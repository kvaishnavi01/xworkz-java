package com.xworkz.inheritance;

public class Rony {
    public void create(Artist artist){
        artist.displayArt();
        artist.draw();
        artist.mixColors();
        artist.paint();
        artist.sketch();

        if (artist instanceof  Painter){
            Painter painter=(Painter) artist;
            painter.painting();
        }
    }
}
