package TetrisGame;

import javax.swing.*;
import java.awt.*;


/** TetrisForm is a JForm that extends from JFrame in order to accompany JPanel(different from JFrame and maintains the Graphics portion) to manipulate pieces
 * This is built off a classic JForm template
 */
public class TetrisForm extends JFrame{

    /** Creates a new form within this JForm */
    public TetrisForm(){

        // initComponents();

        this.add(new TetrisInterface(null, 20));
        this.add(drawTetriminos);

    }
    @SuppressWarnings("unchecked")


    public static void main(String[] args) {

        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new TetrisForm().setVisible(true);
            }
        });
    }


    
}
