package com.xworkz.tostring;

public class Evidence {
    private String type;
    private double weight;
    private boolean isAnalyzed;

    public Evidence(String type, double weight, boolean isAnalyzed) {
        this.type = type;
        this.weight = weight;
        this.isAnalyzed = isAnalyzed;
    }

    @Override
    public String toString() {
        return "type is " + this.type + " weight is " + this.weight + " analyzed is " + this.isAnalyzed;
    }

    @Override
    public int hashCode(){
        return 73;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Evidence) {
                System.out.println("will compare.....");
                Evidence e1 = this;
                Evidence e2 = (Evidence) obj;
                if(e1.type.equals(e2.type) && e1.weight == e2.weight && e1.isAnalyzed == e2.isAnalyzed) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
