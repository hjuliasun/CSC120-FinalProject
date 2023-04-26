import java.awt.Frame;

import javax.swing.*;
import java.awt.*;


public class tetrisagain extends JFrame {

    private int columns;
    private int size;
    private int rows;

    private int[][] tetrimino = {
        {0,1},{0,1},{1,1},
    
    
    };

    tetrisagain(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLocation(0, 0);
        this.setVisible(true);

    }

    public void paint(Graphics g){

        Graphics graphics = (Graphics) g;

        for(int x= 0;x < tetrimino.length; x++){
            for( int y = 0; y < tetrimino[0].length;  y++){
                if (tetrimino[x][y] == 1){

                    g.setColor(Color.BLUE);
                    g.fillRect(y*this.size, x*this.size, this.size, this.size);
                    g.setColor(Color.BLACK);
                    g.drawRect(y*this.size, x*this.size, this.size, this.size);

                }
            }
        }
    }

    
}
