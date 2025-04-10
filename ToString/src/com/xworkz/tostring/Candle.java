package com.xworkz.tostring;

public class Candle {
    private String scent;
    private int burnTime;
    private boolean isSoyBased;

    public Candle(String scent, int burnTime, boolean isSoyBased) {
        this.scent = scent;
        this.burnTime = burnTime;
        this.isSoyBased = isSoyBased;
    }

    @Override
    public String toString() {
        return "scent is " + this.scent +
                " burn time is " + this.burnTime + " hours" +
                " soy based is " + this.isSoyBased;
    }

    @Override
    public int hashCode(){
        return 31;
    }
}
