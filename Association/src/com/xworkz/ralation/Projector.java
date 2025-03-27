package com.xworkz.ralation;

public class Projector {
    Lens len;
    Lamp lamp;
    Port port;
    Wire wire;
    Board board;
    Button button;
    Panel panel;
    Remote remote;
    Screw screw;

    public Projector(Lens len,Lamp lamp,Port port,Wire wire,Board board, Button button,Panel panel, Remote remote,Screw screw){
        System.out.println("running projector");
        this.len=len;
        this.lamp=lamp;
        this.port=port;
        this.wire=wire;
        this.board=board;
        this.button=button;
        this.panel=panel;
        this.remote=remote;
        this.screw=screw;

    }

    void present(){
        this.len.zoom();
        this.lamp.light();
        this.port.connect();
        this.wire.use();
        this.board.getDetails();
        this.button.press();
        this.panel.attach();
        this.remote.changeBattery();
        this.screw.tighten();
    }

}
