package examples;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collections;


public class Tetris2 extends JPanel {


    public void paint(Graphics g){
        g.setColor(Color.CYAN);
        g.fillRect(1,1,100,200);


    }

    public void handleKeyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE || e.getKeyCode() == KeyEvent.VK_ESCAPE) {  
            System.out.println("Detected Relevant Key Press!");
        }
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Tetris");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        // addKeyListener(this);
        // frame.handleKeyPressed();
        frame.getContentPane().add(new Tetris2());
        frame.setVisible(true);
    }

    
}

