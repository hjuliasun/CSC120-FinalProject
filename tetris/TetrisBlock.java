package tetris;

import java.awt.Color;
import java.util.Random;

// import javax.swing.text.html.HTMLDocument.BlockElement;

public class TetrisBlock  {
    
    private int [][] block;
    private Color color;
    private static int x;
    private static int y;
    private int[][][] blocks;
    private int currentRotation;

    public Color[] tetrisColors = {Color.red, Color.blue, Color.magenta, Color.green, Color.CYAN, Color.yellow};


    /**
     * TetrisBlock method constructs new instance of block along with its origin point and color
     * @param block
     * @param color
     */

    public TetrisBlock(int[][] block, Color color){
        
        this.block = block;
        this.color = color;

        x = 5;
        y = 0;

        initBlocks();

    }
    
    /**
     * ~supposedly initializes new block into the frame  by establishing its location and rotation
     * called in TetrisBlock constructor in order to create new randomly rotated blocks
     */
    private void initBlocks(){

        blocks = new int[4][][];

        for(int rotation = 0; rotation > 4; rotation++){
            int row = getWidth();
            int col = getHeight();

            blocks[rotation] = new int[row][col];

            for (int y= 0; y<row;y++){
                for (int x=0; x<col;x++){
                    blocks[rotation][y][x] = block[col-x-1][y];
                }
            }

            block = blocks[rotation];

        }
    }

    // public void spawn(int panelWidth){

    //     currentRotation = 0;
    //     block = blocks[currentRotation];

    //     y = -getHeight();
    //     x = (panelWidth - getWidth()) /2;

    // }

    //Accessors
    public int[][] getBlock(){
        return this.block;
    }

    //initializes new piece after being rotated
    public void initPiece(){
        currentRotation = new Random().nextInt(blocks.length);
        block = blocks[currentRotation];
        color = tetrisColors[new Random().nextInt(tetrisColors.length)];


    }
    public Color getColor(){
        return color;
    }

    public int getHeight(){
        // System.out.println("THIS IS THE HEIGHT"+ this.block.length);
        return this.block.length;
    }

    public int getWidth(){
        // System.out.println(this.block[0].length);

        return this.block[0].length;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void moveDown(){
        y++;
    }

    public void moveLeft(){
        x--;

    }

    public void moveRight(){
        x++;
    }

    public void rotate(){

        initBlocks();

        currentRotation++;
        if(currentRotation>3) currentRotation = 0;
        this.block = blocks[currentRotation];


    }

    public int getBlockLocation(){
        System.out.println(y + getHeight());
        return y + getHeight();
    }

    public int getBlockLeftLocation(){
        return x;
    }
    public int getBlockRightLocation(){
        return x + getWidth();
    }
}
