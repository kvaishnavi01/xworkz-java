package com.xworkz.tostring;

public class SpyGadget {
    private String name;
    private int range;
    private boolean isEncrypted;

    public SpyGadget(String name, int range, boolean isEncrypted) {
        this.name = name;
        this.range = range;
        this.isEncrypted = isEncrypted;
    }

    @Override
    public String toString() {
        return "name is " + this.name + " range is " + this.range + " encrypted is " + this.isEncrypted;
    }

    @Override
    public int hashCode() {
        return 75;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof SpyGadget) {
                System.out.println("will compare.....");
                SpyGadget g1 = this;
                SpyGadget g2 = (SpyGadget) obj;
                if (g1.name.equals(g2.name) && g1.range == g2.range && g1.isEncrypted == g2.isEncrypted) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
