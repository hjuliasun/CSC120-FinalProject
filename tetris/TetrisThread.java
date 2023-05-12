package tetris;

import java.awt.*;
import java.util.*;

public class TetrisThread extends Thread {

    private TetrisPanel game;

    /**
     * Thread component of the game that is in charge of the movement of pieces
     * input is the game established by TetrisPanel which is also established in TetrisFrame
     * @param game
     */

    public TetrisThread(TetrisPanel game){

        this.game = game;



    }

    /** Overrided method inherited from Thread
     * while creates infinite loop until established on when to stop the game
     * until s
     */

    @Override
    public void run(){
   
        while(true){

            game.makeBlock(); //new block created


            while (game.movePieceDown()){
                try {
                    game.movePieceDown(); //calls movePieceDown method
                    // game.rotateBlock();
                    Thread.sleep(1000); //speed of animation
    
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
            }
            if(game.blockinPanel()){ //when block exceeds panel print game over
                // game.drawGameOver(null);
                // public void paintComponent(Graphics g){
                //     super.paintComponent(g);
                System.out.println("game over");

                // }
                break;
            }
            game.drawBlockBackground(); //draw background when pieces move
            game.deleteLines(); //clear lines when completed
            


        }


    }
    
}
