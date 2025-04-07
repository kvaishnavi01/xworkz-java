package com.xworkz.inheritance;

public class Jigsaw {
    public void stick(Puzzle puzzle){
        puzzle.checkCompletion();
        puzzle.mix();
        puzzle.display();
        puzzle.reset();
        puzzle.solve();

        if(puzzle instanceof RubiksCube){
            RubiksCube rubiksCube=(RubiksCube) puzzle;
            rubiksCube.fix();
        }
    }
}
