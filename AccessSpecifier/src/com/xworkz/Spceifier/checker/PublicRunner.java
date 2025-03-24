package com.xworkz.Spceifier.checker;

import com.xworkz.Spceifier.Mall;

public class PublicRunner {
    public void Acesser(){
        Mall m1=new Mall();
        System.out.println("we have "+m1.floor+" floors. (Accessing this from other package)");

        m1.welcome();
        System.out.println("***********************************************");
    }
}

