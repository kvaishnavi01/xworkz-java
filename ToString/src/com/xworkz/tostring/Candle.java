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

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Candle) {
                System.out.println("will compare.....");
                Candle candle = this;
                Candle candle1 = (Candle) obj;
                if(candle.scent.equals(candle1.scent) && candle.burnTime == candle1.burnTime) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
