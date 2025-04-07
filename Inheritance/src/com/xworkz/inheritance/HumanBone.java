package com.xworkz.inheritance;

public class HumanBone {
    public void decompose(Fossil fossil){
        fossil.analyze();
        fossil.date();
        fossil.catalog();
        fossil.display();
        fossil.preserve();

        if (fossil instanceof  DinosaurBone)
        {
            DinosaurBone dinosaurBone=(DinosaurBone) fossil;
            dinosaurBone.reserve();
        }
    }
}
