package com.xworkz.inheritance;

public class Apple {
    public void color(Tree tree){
        tree.absorbWater();
        tree.grow();
        tree.photosynthesize();
        tree.provideShade();
        tree.releaseOxygen();

        if( tree instanceof  MangoTree){
            MangoTree mangoTree=(MangoTree) tree;
            mangoTree.pluck();
        }
    }
}
