package tetris.tetrominos;

import java.awt.Color;

import tetris.TetrisBlock;
import java.util.Random;

public class IPiece extends TetrisBlock{

    static int TETRIS_UNIT = 40;
    public static Color[] tetrisColors = {Color.red, Color.blue, Color.magenta, Color.green, Color.CYAN, Color.yellow};
    // private static ipieces[][][];

    public IPiece() {
        super(new int[][]{{TETRIS_UNIT}, {TETRIS_UNIT}, {TETRIS_UNIT},{TETRIS_UNIT}}, tetrisColors[new Random().nextInt(tetrisColors.length)]);
        //TODO Auto-generated constructor stub
    }


}
