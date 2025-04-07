package com.xworkz.inheritance;

public class PosterDesigner {
    public void design(Designer designer){
        designer.finalizeDesign();
        designer.brainstorm();
        designer.collaborate();
        designer.sketch();
        designer.selectMaterial();

        if(designer instanceof FashionDesigner){
            FashionDesigner fashionDesigner=(FashionDesigner) designer;
            fashionDesigner.stitch();
        }

    }
}
