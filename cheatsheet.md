This file will contain documentation for all commands available in your game.
makeBlock(): call new block that is inherited from TetrisBlock--> can be changed 
blockinPanel(): checks for game over status
deleteLines(): deleteLines method ~supposedly reads the dimensions of the block and compares to the fill of the background
clearLine(int row): assists deleteLines in making the background black when line filled. takes in int parameter
shiftDown(int row): methods moves the colored blocks down once row is cleared. Takes int parameter
checkTetrisPiece(): method maintains piece within bounds
checkLeftSide(): method to check block in left bounds
checkRightSide(): method to check block in right bounds
movePieceDown(): method to draw block every time the piece moves down or draws piece into background
movePieceLeft(): calls moveLeft method from TetrisBlock class to shift x value of block
movePieceRight():calls moveRight method from TetrisBlock class to shift x value of block to the right
dropBlock(): calls moveDown method from TetrisBlock class to drop block to bottom of the panel
rotateBlock(): method doesn't work but tries to call rotate method in TetrisBlock
paintComponent(Graphics g): paintComponent is an overridden inherited method that draws everything
drawBlock(Graphics g): reads through coordinates of block and colors each unit 
drawBackground(Graphics g): illustrates tetris piece within the grid system 
drawGrid(Graphics g, Color color, int x, int y): illustrates grid system background
drawBlockBackground(): illustrates tetris piece within the grid system
actionPerformed(ActionEvent e): inherited method from ActionListener that assists in the controls
Note:  It's a good idea to also make this list available inside the game, in response to a `HELP` command.




# SPOILER ALERT

If your game includes challenges that must be overcome to win, also list them below.
-you can never win, don't try
-make art with the blocks! 
-you can change the speed of the thread sleep value to make it harder/faster