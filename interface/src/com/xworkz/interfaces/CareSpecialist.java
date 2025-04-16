package com.xworkz.interfaces;

class CareSpecialist implements FaceScrub, Mascara, Primer, Shampoo, Toner {
    public void exfoliate() {
        System.out.println("CareSpecialist: Exfoliating skin with face scrub.");
    }
    public void unclogPores() {
        System.out.println("CareSpecialist: Unclogging pores with face scrub.");
    }
    public void brightenSkin() {
        System.out.println("CareSpecialist: Brightening skin with face scrub.");
    }
    public void liftLashes() {
        System.out.println("CareSpecialist: Lifting lashes with mascara.");
    }
    public void addVolume() {
        System.out.println("CareSpecialist: Adding volume to lashes with mascara.");
    }
    public void waterproofEffect() {
        System.out.println("CareSpecialist: Applying waterproof mascara.");
    }
    public void prepSkin() {
        System.out.println("CareSpecialist: Prepping skin with primer.");
    }
    public void minimizePores() {
        System.out.println("CareSpecialist: Minimizing pores with primer.");
    }
    public void smoothTexture() {
        System.out.println("CareSpecialist: Smoothing skin texture with primer.");
    }
    public void cleanseHair() {
        System.out.println("CareSpecialist: Cleansing hair with shampoo.");
    }
    public void addFragrance() {
        System.out.println("CareSpecialist: Adding fragrance to hair with shampoo.");
    }
    public void strengthenRoots() {
        System.out.println("CareSpecialist: Strengthening hair roots with shampoo.");
    }
    public void tightenPores() {
        System.out.println("CareSpecialist: Tightening pores with toner.");
    }
    public void balancePH() {
        System.out.println("CareSpecialist: Balancing skin pH with toner.");
    }
    public void refreshSkin() {
        System.out.println("CareSpecialist: Refreshing skin with toner.");
    }
}
