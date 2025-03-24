package com.xworkz.Spceifier;

import com.xworkz.Spceifier.checker.PublicRunner;

public class MallRunner {
    public static void main(String []args){
        Mall m1=new Mall();
        PublicRunner n1= new PublicRunner();

        n1.Acesser();
        System.out.println("we have "+m1.floor+" floors");
        System.out.println("The name of our mall is "+m1.name);

        m1.welcome();
        m1.shop();
    }
}
