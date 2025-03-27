package com.xworkz.ralation;

public class MainRunner {
    public static void main(String[] args) {
        System.out.println("running main method");
        Lens len=new Lens(5,1024);
        Warranty warranty=new Warranty("01/02/2020","01/02/2025");
        Lamp lamp=new Lamp(30,warranty);
        PortType pt=new PortType("c",440);
        Port port=new Port(80,pt);
        Quality q=new Quality("good",220);
        Wire wire=new Wire(50,q);
        Capacitor cp=new Capacitor(50,"ceramic");
        Board board=new Board(50,cp);
        Material m= new Material("film","soft");
        Button button=new Button("pink",m);
        Panel panel=new Panel("red","M");
        Voltage v=new Voltage("AC",400);
        Battery b=new Battery(40,v);
        Remote remote=new Remote("on",b);
        Screw screw=new Screw(10,5);

        Projector pr=new Projector(len,lamp,port,wire,board,button,panel,remote,screw);
        pr.present();
    }
}
