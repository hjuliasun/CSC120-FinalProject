package tetris.tetrominos;

import tetris.TetrisBlock;
import java.awt.Color;

import java.util.Random;

public class JPiece extends TetrisBlock{

    static int TETRIS_UNIT = 40;
    public static Color[] tetrisColors = {Color.red, Color.blue, Color.magenta, Color.green, Color.CYAN, Color.yellow};

    public JPiece() {
        super(new int[][]{{0,TETRIS_UNIT}, {0,TETRIS_UNIT}, {TETRIS_UNIT,TETRIS_UNIT}}, tetrisColors[new Random().nextInt(tetrisColors.length)]);
        //TODO Auto-generated constructor stub
    }

    
}
