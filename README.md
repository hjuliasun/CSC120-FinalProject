# CSC120-FinalProject

## Deliverables:
 - Your final codebase
 - Your revised annotated architecture diagram
 Architecture Diagram:  
Tetris.java initates a new game through TetrisFrame. TetrisFrame holds the TetrisPanel class which contains all the main functions. TetrisBlock contains actions to be performed on the blocks. TetrisThread is substantiated by TetrisFrame in order to create block movement. 

 - Design justification (including a brief discussion of at least one alternative you 
 considered)
 Design:
 Another way of rotating the block could be storing different iterations of a rotated block into a collection and calling a specific rotation using a random number generator to generate a key value. Additionally, all of this code could have been consolidated into one .java with all the main controls in psvm. However, by segregating different functions into separate classes improves code readibility and better illustrates class inheritance and object-oriented programming. 

 - A map of your game's layout (if applicable)
 Game Layout:
 User can change values of pixels to zoom-in/zoom-out for the panel display. Additionally, since the random generator is not working, the user can change which block they would like to play with but only one at a time. 
 - `cheatsheet.md`
 - Completed `rubric.md`
  
## Additional Reflection Questions
 - What was your **overall approach** to tackling this project?
 My initial approach was to build off a code on github that had CCO, which means I could use the code as a foundation to improve on. However, I didn't understand how the code was working together so I started from scratch. I first attempted to get a pop-up window to show a grid system and a tetris piece. From there, I built off that by getting the pieces to move downward continously. I think I spent too much time on trying to teach myself all the basics when it was probably more efficient and useful to just start coding and learn along the way.

 - What **new thing(s)** did you learn / figure out in completing this project?
 I learned so many new things!! It was amazing! I really loved working with graphics and learning how visualize the same objects but using different methods. I initially wanted to use images. However, the way Tetris is formatted requires a grid system. But, by testing out this method, I also learned how images/graphics worked in java which assisted me later on when coloring the grid system for each block. I still don't have a fully grasped understanding of Thread but application of complex concepts we didn't learn in class helped me understand them better. I think the best way to learn is to practice doing/coding it. 

 - Is there anything that you wish you had **implemented differently**?
The rotation and moving methods are prone to glitches. I would make the rotation method read from an array list or hashtable to tetriminos to retrieve set rotated tetrimino instead of trying to manually move each unit of the tetrimino using a for-loop. The current method I have neither works or is time efficient. 

 - If you had **unlimited time**, what additional features would you implement?
 Unfortunately, due to my other finals and being so mentally exhausted from a really rough semester, I didn't get the chance to have the object rotate or generate random pieces or get the deleteLines method to work. I'm still going to work on it outside of class and hopefully implement a score board and a game over button!

 - What was the most helpful **piece of feedback** you received while working on your project? Who gave it to you?
 Coding is about looking up the right things -from Jordan! I got better at searching up the right questions and navigating lines of code for the answer I was looking for more efficiently which improved my ability to read and understand other people's code (i.e on Stack Overflow) more quickly.

 - If you could go back in time and give your past self some **advice** about this project, what hints would you give?
 Start earlier! Don't overthink things- they tend to be a lot more simpler than you think. Work on it consistently otherwise you will lose the flow and forget how things are organized.  

 - _If you worked with a team:_ please comment on how your **team dynamics** influenced your experience working on this project.
 Working on this project alone was really fun but it would've been nice to have some help. However, most people I talked to had already formed a group/idea. 
