package tetris;
import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TetrisFrame extends JFrame { //main frame of tetris game

    /** Tetris Frame that extends the JFrame interface. Creates new game through TetrisPanel
     * @return pop-up window with game
     * 
     */

    TetrisFrame(){
        //this.setDefaultLookAndFeelDecorated(true);
        TetrisPanel game = new TetrisPanel(); //create a new panel in the frame
        this.add(game);
        this.setTitle("Tetris");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        new TetrisThread(game).start(); // starts animation of the pieces moving down

        //keyboard controls using KeyListener 
        game.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
            }
            
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                case KeyEvent.VK_UP:
                    game.rotateBlock();
                case KeyEvent.VK_DOWN:
                    game.movePieceDown();
                    break;
                case KeyEvent.VK_LEFT:
                    game.movePieceLeft();
                    break;
                case KeyEvent.VK_RIGHT:
                    game.movePieceRight();
                    break;
                case KeyEvent.VK_SPACE:
                    game.dropBlock();

                    break;
                } 
            }
            
            public void keyReleased(KeyEvent e) {
            }});

        		// Keyboard controls


    }

    // private void consoleArea(){
    //     // InputMap input = this.getRootPane().getInputMap();
    //     // ActionMap action = this.getRootPane().getActionMap();

    //     // input.put(KeyStroke.getKeyStroke("RIGHT"), "right");
    //     // input.put(KeyStroke.getKeyStroke("UP"), "up");
    //     // input.put(KeyStroke.getKeyStroke("LEFT"), "left");
    //     // input.put(KeyStroke.getKeyStroke("DOWN"), "down");
    //     // input.put(KeyStroke.getKeyStroke("SPACE"), "space");


    // }

    


    // TetrisPanel panel;

    // TetrisFrame(){

    //     panel = new TetrisPanel();
    //     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //     this.add(panel);

    //     this.pack();
    //     this.setLocationRelativeTo(null);
    //     this.setVisible(true);
    // }
    
    
}