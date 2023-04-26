import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TetrisArchDiagram extends JPanel{

    private int size;

    public TetrisArchDiagram(){
        this.size = size;
    }

    private final int[][] tetrimino = {
        {0,1},{0,1},{1,1}
    
    
    };

    /**Rotate method */

    /** Move pieces */

    /** Draw tetriminos */
    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 20, 60);
        g.fillRect(0, 60, 40, 30);
        // for(int x= 0;x < tetrimino.length; x++){
        //     for( int y = 0; y < tetrimino[0].length;  y++){
        //         if (tetrimino[x][y] == 1){

        //             g.setColor(Color.BLUE);
        //             g.fillRect(y*this.size, x*this.size, this.size, this.size);
        //             g.setColor(Color.BLACK);
        //             g.drawRect(y*this.size, x*this.size, this.size, this.size);

        //         }
        //     }}
      }
    
    /** Draw main display */

    /** Delete row when filled */

    /** Main display boundaries */

    /** Controls from the keyboard */


    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Tetris");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        // addKeyListener(this);
        // frame.handleKeyPressed();
        frame.getContentPane().add(new TetrisArchDiagram());
        frame.setVisible(true);
    }

    
}
