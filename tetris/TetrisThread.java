package tetris;


public class TetrisThread extends Thread {

    private TetrisPanel game;

    public TetrisThread(TetrisPanel game){

        this.game = game;



    }

    @Override
    public void run(){



   
        while(true){

            game.makeBlock();


            while (game.movePieceDown()){
                try {
                    game.movePieceDown();
                    // game.rotateBlock();
                    Thread.sleep(1000);
    
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
            }


        }


    }
    
}
