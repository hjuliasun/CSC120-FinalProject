// import java.awt.*;
// import javax.swing.*;

// public class tetris2 extends JPanel{

//     private int columns;
//     private int size;
//     private int rows;

//     private final int[][] tetrimino = {
//         {0,1},{0,1},{1,1}
    
    
//     };
    

//     public void TetrisInterface(JPanel placeholderJPanel, int numCols){

        



//         this.columns = numCols;
//         this.size = this.getBounds().width/this.columns;
//         this.rows = this.getBounds().height/this.size;


//     }


//     private void drawTetriminos(Graphics graphics){

//         Graphics g = (Graphics) graphics;

//         for(int x= 0;x < tetrimino.length; x++){
//             for( int y = 0; y < tetrimino[0].length;  y++){
//                 if (tetrimino[x][y] == 1){

//                     g.setColor(Color.BLUE);
//                     g.fillRect(y*this.size, x*this.size, this.size, this.size);
//                     g.setColor(Color.BLACK);
//                     g.drawRect(y*this.size, x*this.size, this.size, this.size);

//                 }
//             }
//         }

//     }
 


//     @Override //Since we are inheriting from JPanel and overriding its methods, this informs us if we have incorrectly called a method
//     protected void paintComponent(Graphics graphics){

//         super.paintComponents(graphics);



//         for (int y = 0; y<this.rows; y++){
//             for(int x = 0; x < this.columns; x++){
            
//                 graphics.drawRect(x * this.size, y * this.size, this.size, this.size );
//             }

//         }

//         drawTetriminos(graphics);
//     }

//     public static void main(String[] args) {
//         JFrame.setDefaultLookAndFeelDecorated(true);
//         JFrame frame = new JFrame("Bouncing Ball");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(300, 200);
//         //frame.setContentPane(new BouncingBall());
//         frame.paintComponents(null);

//         frame.setVisible(true);
//     }
// }
