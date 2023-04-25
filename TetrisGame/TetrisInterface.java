package TetrisGame;

import java.awt.*;
import javax.swing.*;

public class TetrisInterface extends JPanel {

    private int rows;
    private int columns;
    private int size;
    private JPanel placeholder;
    private JFrame frame;
    private int[][] tetrimino = {{1,0},{1,0},{1,0}};


    public TetrisInterface(JPanel placeholderJPanel, int numCols){

        this.placeholder = placeholderJPanel;
        this.frame = new JFrame("Tetris");
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(800, 600);
        this.frame.setVisible(true);
        



        this.columns = numCols;
        this.size = this.getBounds().width/this.columns;
        this.rows = this.getBounds().height/this.size;


    }


    private void drawTetriminos(Graphics graphics){

        for(int x= 0;x < tetrimino.length; x++){
            for( int y = 0; y < tetrimino[0].length;  y++){
                if (tetrimino[x][y] == 1){

                    graphics.setColor(Color.BLUE);
                    graphics.fillRect(y*this.size, x*this.size, this.size, this.size);
                    graphics.setColor(Color.BLACK);
                    graphics.drawRect(y*this.size, x*this.size, this.size, this.size);

                }
            }
        }

    }
 


    @Override //Since we are inheriting from JPanel and overriding its methods, this informs us if we have incorrectly called a method
    protected void paintComponent(Graphics graphics){

        super.paintComponents(graphics);



        for (int y = 0; y<this.rows; y++){
            for(int x = 0; x < this.columns; x++){
            
                graphics.drawRect(x * this.size, y * this.size, this.size, this.size );
            }

        }

        drawTetriminos(graphics);
    }

    public static void main(String[] args) {

        TetrisInterface game = new TetrisInterface(null, 20);
        game.drawTetriminos(null);
    }
}
