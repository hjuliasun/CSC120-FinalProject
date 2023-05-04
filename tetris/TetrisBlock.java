package tetris;

import java.awt.Color;

// import javax.swing.text.html.HTMLDocument.BlockElement;

public class TetrisBlock  {
    
    private int [][] block;
    private Color color;
    private static int x;
    private static int y;
    private int[][][] blocks;
    private int currentRotation;




    public TetrisBlock(int[][] block, Color color){
        
        this.block = block;
        this.color = color;

        x = 5;
        y = 0;

        initBlocks();

    }
    
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
        System.out.println(block);
        return block;
    }
    public Color getColor(){
        return color;
    }

    public int getHeight(){
        // System.out.println("THIS IS THE HEIGHT"+ this.block.length);
        return block.length;
    }

    public int getWidth(){
        System.out.println("THIS IS THE WIDTH"+ block[0].length);

        return block[0].length;
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
        return y + getHeight();
    }
}
