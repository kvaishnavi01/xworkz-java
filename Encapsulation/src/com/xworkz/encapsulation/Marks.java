package com.xworkz.encapsulation;

public class Marks {
    private int english=56;
    private int maths=98;
    private int hindi=49;

    public Marks(){
        System.out.println("No use Constructor (no-args)");
    }


    public int getEnglish(){
        return this.english;
    }
    public int getMaths(){
        return this.maths;
    }
    public int getHind(){
        return this.hindi;
    }

    void setEnglish(int english){
        this.english=english;
    }

    void setMaths(int maths){
        this.maths=maths;
    }

    void setHindi(int hindi){
        this.hindi=hindi;
    }
}
