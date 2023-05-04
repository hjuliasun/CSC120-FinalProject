
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.awt.geom.Rectangle2D;
// import java.util.ArrayList;
// import java.awt.event.*;

// public class TetrisArchDiagram extends JPanel implements ActionListener{
//     final static int panelWidth = 800;
//     final static int panelHeight = 800;
//     final int screenPixel = panelHeight/panelWidth;
//     Image jpiece;
//     Image lpiece;
//     static Component spiece;
//     Image ipiece;
//     Image tpiece;
//     static Image zpiece;
//     Image opiece;
//     Timer timer;
//     JTextField tf;
//     JButton b;
//     JLabel l;
//     private int xSpeed = 10;
//     private int ySpeed = 10;
//     private int x = 0;
//     private int y =0;
//     // private final int[][] Lpiece = {
//     //     {0,1},{0,1},{1,1}
//     // };
//     Image sPiece = Toolkit.getDefaultToolkit().getImage("spiece.png");
//     Image zPiece = Toolkit.getDefaultToolkit().getImage("zpiece.png");





//     private int size;

//     public TetrisArchDiagram(){

//         // tf = new JTextField();
//         // tf.setBounds(getVisibleRect());
//         // l = new JLabel();
//         // l.setBounds(getVisibleRect());
//         // l.setText("hello world");
//         // b.setBounds(50,150,95,30);

        
//         this.size = size;
//         Timer timer = new Timer(1000,this);
//         timer.start();
//         // opiece = new ImageIcon("opiece.webp").getImage();
//         // Timer timer = new Timer(1000, this);
        



//     }





//     /**Rotate method */

//     /** Move pieces */

//     /** Draw tetriminos */
//     // private void drawPiece(Graphics g){
//     //     for(int row = 0; row <Lpiece.length; row++){
//     //         for (int col = 0; col <Lpiece.length; row++){
//     //             if(Lpiece[row][col] == 1){

//     //                 g.setColor(Color.yellow);
//     //                 g.fillRect(col*blockSize, row*blockSize, blockSize, blockSize);
//     //                 g.drawRect(x*blockSize, y*blockSize, blockSize, blockSize);

//     //             }
//     //         }

//     //     }
//     // }

//     @Override
//     public void paint(Graphics g) {
//         // super.paintComponent(g);
//         // drawPiece(g);

        
//         super.paint(g);
//         Graphics2D graphics = (Graphics2D) g;
//         graphics.drawImage(sPiece, x,y,null); 
//         graphics.drawImage(zPiece, 20, 30, null );

        

//         // super.paintComponent(g);
//         // g.setColor(Color.yellow);
//         // g.fillRect(0, 0, 20, 60);
//         // g.fillRect(0, 60, 40, 30);

        
//         // for(int x= 0;x < tetrimino.length; x++){
//         //     for( int y = 0; y < tetrimino[0].length;  y++){
//         //         if (tetrimino[x][y] == 1){

//         //             g.setColor(Color.BLUE);
//         //             g.fillRect(y*this.size, x*this.size, this.size, this.size);
//         //             g.setColor(Color.BLACK);
//         //             g.drawRect(y*this.size, x*this.size, this.size, this.size);

//         //         }
//         //     }}
//       }

//     // public void paintComponent( Graphics g ){
//     //     Graphics2D g2d = (Graphics2D) g;
//     //     g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//     //     g2d.setColor(Color.GREEN);
//     //     g2d.fillRect(0, 0, getWidth(), getHeight());    
//     //     int xElemSize = this.getWidth() / this.spiece.getSizeX();
//     //     int yElemSize = this.getHeight() / this.spiece.getSizeY();             
//     //     int rectX = 0, rectY = 0;

//     //     for (int i = 0; i < this.spiece.getSizeX(); i++)
//     //     {
//     //         for (int h = 0; h < this.spiece.getSizeY(); h++)
//     //         {   
//     //             if (spiece.matrix[i][h] != 0)
//     //             {
//     //                 rectX = i * xElemSize;
//     //                 rectY = h * yElemSize;      
//     //                 Rectangle2D rect = new Rectangle2D.Double(rectX, rectY, xElemSize, yElemSize);
//     //                 g2d.setColor(Color.GREEN);
//     //                 g2d.fill(rect);
//     //                 g2d.draw (rect);
//     //                 bresenham_Linie(x1, y1, x2, y2);
//     //             }
//     //         }
//     //     }
//     // }
    
//     /** Draw main display */

//     /** Delete row when filled */

//     /** Main display boundaries */

//     /** Controls from the keyboard */


//     public static void main(String[] args) {
//         new TetrisArchDiagram();
//         JFrame.setDefaultLookAndFeelDecorated(true);
//         JFrame frame = new JFrame("Tetris");
//         // frame.add(spiece);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(panelWidth, panelHeight);
//         // addKeyListener(this);
//         // frame.handleKeyPressed();
//         frame.getContentPane().add(new TetrisArchDiagram());
//         frame.setVisible(true);

//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {

//         if(y>= panelWidth- sPiece.getWidth(this) || y < 0 ){
//             ySpeed = ySpeed *-1;
//         }
//         y = y + ySpeed;
//         repaint();


//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
//     }

    
// }
