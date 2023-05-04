package tetris;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import javax.swing.KeyStroke;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.TimerTask;
import java.util.ArrayList;
import java.util.Collections;   
// import javax.swing

import javax.swing.*;

public class TetrisPanel extends JPanel implements ActionListener {

    private final static int width_ratio = 11;
    private final static int height_ratio = 20;
    private final static int scale = 40;
    static final int PANEL_WIDTH = width_ratio*scale;
    static final int PANEL_HEIGHT = height_ratio*scale;
    static final int TETRIS_UNIT = 1*scale;
    // static final int PANEL_WIDTH = PANEL_RATIO_WIDTH*500;
    // static final int PANEL_HEIGHT = PANEL_RATIO_HEIGHT*500;
    // static final int TETRIS_UNIT_SIZE = TETRIS_RATIO_UNITS *500;
    static final int TETRIS_TOTAL_UNITS = (PANEL_WIDTH*PANEL_HEIGHT)/TETRIS_UNIT;
    static final int delay = 100;
    private Point origin;
    int score;
    private ArrayList<Integer> nextPieces = new ArrayList<Integer>();
    boolean running = false;
    Timer timer;
    Random random;
    private int rotation;
    private int currentPiece;
    private TetrisBlock block;
    private TetrisPanel game;
    private Color[][] background;

    // private final Color[] blockColors = { Color.BLACK, Color.BLUE, Color.CYAN, Color.GREEN,
    //     Color.MAGENTA, Color.ORANGE, Color.RED, Color.YELLOW };
    // private final Shape[] shapes = new Shape[7];
    // char direction = "D";
//     private static final Color[] COLORS = { Color.BLACK, Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.MAGENTA, Color.CYAN, Color.ORANGE };
// 	private final Point[][][] TETRISPIECES = {
//         // I-Piece
//         {
//             { new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(3, 1) },
//             { new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(1, 3) },
//             { new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(3, 1) },
//             { new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(1, 3) }
//         },
        
//         // J-Piece
//         {
//             { new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(2, 0) },
//             { new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(2, 2) },
//             { new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(0, 2) },
//             { new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(0, 0) }
//         },
        
//         // L-Piece
//         {
//             { new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(2, 2) },
//             { new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(0, 2) },
//             { new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(0, 0) },
//             { new Point(1, 0), new Point(1, 1), new Point(1, 2), new Point(2, 0) }
//         },
        
//         // O-Piece
//         {
//             { new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1) },
//             { new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1) },
//             { new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1) },
//             { new Point(0, 0), new Point(0, 1), new Point(1, 0), new Point(1, 1) }
//         },
        
//         // S-Piece
//         {
//             { new Point(1, 0), new Point(2, 0), new Point(0, 1), new Point(1, 1) },
//             { new Point(0, 0), new Point(0, 1), new Point(1, 1), new Point(1, 2) },
//             { new Point(1, 0), new Point(2, 0), new Point(0, 1), new Point(1, 1) },
//             { new Point(0, 0), new Point(0, 1), new Point(1, 1), new Point(1, 2) }
//         },
        
//         // T-Piece
//         {
//             { new Point(1, 0), new Point(0, 1), new Point(1, 1), new Point(2, 1) },
//             { new Point(1, 0), new Point(0, 1), new Point(1, 1), new Point(1, 2) },
//             { new Point(0, 1), new Point(1, 1), new Point(2, 1), new Point(1, 2) },
//             { new Point(1, 0), new Point(1, 1), new Point(2, 1), new Point(1, 2) }
//         },
        
//         // Z-Piece
//         {
//             { new Point(0, 0), new Point(1, 0), new Point(1, 1), new Point(2, 1) },
//             { new Point(1, 0), new Point(0, 1), new Point(1, 1), new Point(0, 2) },
//             { new Point(0, 0), new Point(1, 0), new Point(1, 1), new Point(2, 1) },
//             { new Point(1, 0), new Point(0, 1), new Point(1, 1), new Point(0, 2) }
//         }
// };

    TetrisPanel(){
        random = new Random();
        // this.game = new TetrisThread(game);
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        // initTimer();
        // initShapes();
        background = new Color[PANEL_HEIGHT][PANEL_WIDTH];

        makeBlock();

        // movePieceDown();
        // startGame();


    }

    public void makeBlock(){
        block = new TetrisBlock(new int[][] {{TETRIS_UNIT,0},{TETRIS_UNIT,0}, {TETRIS_UNIT,TETRIS_UNIT}}, Color.BLUE);
        // block.spawn(PANEL_WIDTH);
    }

    // 	// Put a new, random piece into the dropping position
	// public void newPiece() {
	// 	origin = new Point(5, 2);
	// 	rotation = 0;
	// 	if (nextPieces.isEmpty()) {
	// 		Collections.addAll(nextPieces, 0, 1, 2, 3, 4, 5, 6);
	// 		Collections.shuffle(nextPieces);
	// 	}
	// 	currentPiece = nextPieces.get(0);
	// 	nextPieces.remove(0);

	// }


    // private void initShapes() {
    //     shapes[0] = new Shape(new int[][] { { 1, 1, 1, 1 } }, this, blockColors[0]);
    //     shapes[1] = new Shape(new int[][] { { 1, 1, 1 }, { 0, 1, 0 } }, this, blockColors[1]);
    //     shapes[2] = new Shape(new int[][] { { 1, 1, 1 }, { 1, 0, 0 } }, this, blockColors[2]);
    //     shapes[3] = new Shape(new int[][] { { 1, 1, 0 }, { 0, 1, 1 } }, this, blockColors[3]);
    //     shapes[4] = new Shape(new int[][] { { 0, 1, 1 }, { 1, 1, 0 } }, this, blockColors[4]);
    //     shapes[5] = new Shape(new int[][] { { 0, 1, 0 }, { 1, 1, 1 } }, this, blockColors[5]);
    //     shapes[6] = new Shape(new int[][] { { 1, 1 }, { 1, 1 } }, this, blockColors[6]);
    //     random = new Random();
    // }

    // private void initTimer() {
    //     timer = new Timer(delay, this);
    //     timer.start();
    // }

    // public void startGame(){
    //     // newTetrisPiece();
    //     // running = true;
    //     new TetrisThread(this).start();
        // timer = new Timer(delay,this);
        // timer.start();
        // 		// Make the falling piece drop every second
                // 		new Thread() {
        // 			@Override 
        // 			public void run() {
        // 				while (true) {
        // 					try {
        // 						Thread.sleep(1000);
        // 						game.dropDown();
        // 					} catch ( InterruptedException e ) {}
        // 				}
        // 			}
        // 		}.start();

        

    // }

	// Collision test for the dropping piece
	// private boolean checkCollisions(int x, int y, int rotation) {
	// 	for (Point p : TETRISPIECES[currentPiece][rotation]) {
	// 		if (well[p.x + x][p.y + y] != Color.BLACK) {
	// 			return true;
	// 		}
	// 	}
	// 	return false;
	// }

    public void newTetrisPiece(){
        // originX = (PANEL_WIDTH/TETRIS_UNIT)*TETRIS_UNIT;
        // originY = (PANEL_HEIGHT/TETRIS_UNIT)*TETRIS_UNIT;

    }

    // 	// Collision test for the dropping piece
	// private boolean collidesAt(int x, int y, int rotation) {
	// 	for (Point p : Tetraminos[currentPiece][rotation]) {
	// 		if (well[p.x + x][p.y + y] != Color.BLACK) {
	// 			return true;
	// 		}
	// 	}
	// 	return false;
	// }
	
	// // Rotate the piece clockwise or counterclockwise
	// public void rotate(int i) {
	// 	int newRotation = (rotation + i) % 4;
	// 	if (newRotation < 0) {
	// 		newRotation = 3;
	// 	}
	// 	if (!collidesAt(pieceOrigin.x, pieceOrigin.y, newRotation)) {
	// 		rotation = newRotation;
	// 	}
	// 	repaint();
	// }
    
    public boolean checkTetrisPiece(){
        // System.out.println(block.getBlockLocation());

        if(block.getBlockLocation() == height_ratio){
            // System.out.println("hi");
            // System.out.println(block.getBlockLocation());
            return false;
        }
        return true;
    }

    public boolean movePieceDown(){
        // makeBlock();
        // System.out.println(block);



        if (checkTetrisPiece() == false){
            drawBlockBackground();
            return false;
        }
        else{
            block.moveDown();
            repaint();

            return true;

        }

    }

    public void movePieceLeft(){
        block.moveLeft();
        repaint();

    }


    public void movePieceRight(){
        block.moveRight();
        repaint();
    }

    public void dropBlock(){
        while(checkTetrisPiece()){
            block.moveDown();
        }
        repaint();
    }

    public void rotateBlock(){
        block.rotate();
        repaint();
    }









    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        drawBackground(g);
        // drawCircle(g);
        drawBlock(g);
    }

    public void drawBlock(Graphics g){
        // makeBlock();
        int height = block.getHeight();
        int width = block.getWidth();
        Color c = block.getColor();
        int[][] b = block.getBlock();


        for (int row = 0; row < height; row++){
            for(int col = 0; col < width; col ++){
                if (b[row][col]==TETRIS_UNIT){
                    int xPlace = (block.getX() + col) * TETRIS_UNIT; 
                    int yPlace = (block.getY() + row) * TETRIS_UNIT; 

                    g.setColor(c);
                    g.fillRect(xPlace, yPlace, TETRIS_UNIT, TETRIS_UNIT);
                    g.setColor(Color.black);
                    g.drawRect(xPlace, yPlace, TETRIS_UNIT, TETRIS_UNIT);
                }
            }
        }

        // for (int i=0;i<(PANEL_WIDTH/TETRIS_UNIT);i++){


        // // }

        // g.setColor(Color.BLUE);

        // g.fillRect(0, 0, TETRIS_UNIT, TETRIS_UNIT);
        
        // g.fillRect(0, TETRIS_UNIT, TETRIS_UNIT, TETRIS_UNIT);
        // g.fillRect(0, TETRIS_UNIT*2, TETRIS_UNIT, TETRIS_UNIT);
        // g.fillRect(0, TETRIS_UNIT*2, TETRIS_UNIT, TETRIS_UNIT);
        // g.fillRect(TETRIS_UNIT, TETRIS_UNIT*2, TETRIS_UNIT, TETRIS_UNIT);
        // g.setColor(Color.black);
        // g.drawRect(0, TETRIS_UNIT, TETRIS_UNIT, TETRIS_UNIT);
        // g.drawRect(0, TETRIS_UNIT*2, TETRIS_UNIT, TETRIS_UNIT);
        // g.drawRect(0, TETRIS_UNIT*2, TETRIS_UNIT, TETRIS_UNIT);
        // g.drawRect(TETRIS_UNIT, TETRIS_UNIT*2, TETRIS_UNIT, TETRIS_UNIT);
        
    }


    // public void drawCircle(Graphics g){
    //     g.setColor(Color.red);
    //     g.fillOval(25, 25, TETRIS_UNIT, TETRIS_UNIT);
    // }


    public void drawBackground(Graphics g){
        Color color;

        for (int r =0; r<PANEL_HEIGHT; r++){
            for (int c= 0; c<PANEL_WIDTH; c++){
                color = background[r][c];

                if (color != null){
                    int x = c* TETRIS_UNIT;
                    int y = r * TETRIS_UNIT;

                    drawGrid(g, color, x,y);



                }
            }
        }
        // if(running){

            // g.setColor(Color.red);
            // g.fillOval(PANEL_WIDTH*TETRIS_UNIT*4, PANEL_HEIGHT*TETRIS_UNIT*4, TETRIS_UNIT, TETRIS_UNIT);

            for(int i = 0; i<(PANEL_HEIGHT/TETRIS_UNIT);i++){
                g.setColor(Color.darkGray);
                g.drawLine(i*TETRIS_UNIT, 0, i*TETRIS_UNIT, PANEL_HEIGHT);
                g.drawLine(0, i*TETRIS_UNIT, PANEL_WIDTH, i*TETRIS_UNIT);
                
            }


            // for (Point p : TETRISPIECES[currentPiece][rotation]) {
            //     g.setColor(COLORS[currentPiece]);
            //     g.fillRect((p.x + origin.x) * 26, 
            //             (p.y + origin.y) * 26, 
            //             25, 25);
                        
            // }

        // }


        // for(int i = 0; )

    }

    private void drawGrid(Graphics g, Color color, int x, int y){
        g.setColor(color);
        g.fillRect(x, y, TETRIS_UNIT, TETRIS_UNIT);
        g.setColor(Color.black);
        g.drawRect(x, y, TETRIS_UNIT, TETRIS_UNIT);

    }

    private void drawBlockBackground(){
        int[][] piece = block.getBlock();
        int height = block.getHeight();
        int width = block.getWidth();
        int xLocation = block.getX();
        int yLocation = block.getY();
        Color color = block.getColor();

        for (int row = 0; row <height; row++){
            for(int col = 0; col < width; col++){
                if (piece[row][col] == TETRIS_UNIT){
                    background[row + yLocation][col + xLocation] = color;

                }
            }
        }
    }

    public void movePieces(){

    }

    public void gameOver(Graphics g){

    }

    // @Override
    // public void actionPerformed(ActionEvent e) {

    //     if(running){
    //         movePieces();
    //         checkTetrisPiece();
    //         movePieceDown();
    //         //checkCollisions();

    //     }
    //     repaint();


    //         // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        

    // }

    public class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    // final int panelWidth = 500;
    // final int panelHeight = 800;
    // final int blockSize = panelHeight/panelWidth;
    // Image jpiece;
    // Image lpiece;
    // Image spiece;
    // Image ipiece;
    // Image tpiece;
    // Image zpiece;
    // Image opiece;
    // Timer timer;
    // private int xSpeed = 10;
    // private int ySpeed = 10;
    // private int x = 0;
    // private int y =0;

    // final int [][] Lpiece = {{1,0}, {1,0}, {1,1}};


    // TetrisPanel(){
    //     this.setPreferredSize(new Dimension(panelWidth, panelHeight));
    //     // this.setBackground(Color.BLACK);
    //     this.setBorder(getBorder());
        


    //     // ImageIcon spiece = new ImageIcon(getClass().getResource("spiece.png"));
    //     zpiece = new ImageIcon("Z_Tetromino0.png").getImage();
    //     timer = new Timer(10, null);
    //     timer.start();
    // }

    // private void drawPiece(Graphics g){
    //     for(int row = 0; row <Lpiece.length; row++){
    //         for (int col = 0; col <Lpiece.length; row++){
    //             if(Lpiece[row][col] == 1){

    //                 g.setColor(Color.yellow);
    //                 g.fillRect(col*blockSize, row*blockSize, blockSize, blockSize);
    //                 g.drawRect(x*blockSize, y*blockSize, blockSize, blockSize);

    //             }
    //         }

    //     }
    // }


    // public void paintComponent(Graphics g){
    //     // super.paint(g);
    //     // Graphics2D graphics = (Graphics2D) g;
    //     // graphics.drawImage(spiece, 250, y, null);

    //     // super.paintComponent(g);
    //     // Graphics graphics = (Graphics) g;
    //     // graphics.setColor(Color.red);
    //     // graphics.drawImage(zpiece, 120,100,null);  

    //     super.paintComponent(g);
    //     for(int row = 0; row <Lpiece.length; row++){
    //         for (int col = 0; col <Lpiece.length; row++){
    //             if(Lpiece[row][col] == 1){

    //                 g.setColor(Color.yellow);
    //                 g.fillRect(col*blockSize, row*blockSize, blockSize, blockSize);
    //                 g.drawRect(x*blockSize, y*blockSize, blockSize, blockSize);

    //             }
    //         }

    //     }
    //     drawPiece(g);


    //     // super.paintComponent(g);
    //     // g.setColor(Color.yellow);
    //     // g.fillRect(0, 0, 25, 60);
    //     // g.fillRect(0, 60, 50, 30);

    // }

    
}
