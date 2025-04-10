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
}
