package tetris.tetrominos;
import tetris.TetrisBlock;
import java.awt.Color;

import java.util.Random;
public class SPiece extends TetrisBlock {
    static int TETRIS_UNIT = 40;
    public static Color[] tetrisColors = {Color.red, Color.blue, Color.magenta, Color.green, Color.CYAN, Color.yellow};

    public SPiece() {
        super(new int[][]{{0,TETRIS_UNIT,TETRIS_UNIT}, {TETRIS_UNIT,TETRIS_UNIT,0}}, tetrisColors[new Random().nextInt(tetrisColors.length)]);
        //TODO Auto-generated constructor stub
    }
}
