package com.xworkz.inheritance;

public class FashionDesigner extends Designer {
    public FashionDesigner() {
        System.out.println("no args const of FashionDesigner");
    }

    @Override
    public void brainstorm() {
        System.out.println("Fashion Designer is brainstorming clothing ideas");
    }

    @Override
    public void sketch() {
        System.out.println("Fashion Designer is sketching outfits");
    }

    @Override
    public void selectMaterial() {
        System.out.println("Fashion Designer is selecting fabrics");
    }

    @Override
    public void collaborate() {
        System.out.println("Fashion Designer is collaborating with models and tailors");
    }

    @Override
    public void finalizeDesign() {
        System.out.println("Fashion Designer is finalizing runway look");
    }

    public void stitch(){
        System.out.println("stitching");
    }
}
