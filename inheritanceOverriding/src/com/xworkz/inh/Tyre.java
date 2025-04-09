package com.xworkz.inh;

public class Tyre extends  Rubber{
    @Override
    public  void  expand(){
        System.out.println("expand method from tyre");
    }

    public void compress(){
        System.out.println("compress from tyre");
    }


}
