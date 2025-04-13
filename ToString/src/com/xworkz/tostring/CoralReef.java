package com.xworkz.tostring;

public class CoralReef {
    private String reefName;
    private String location;
    private int speciesCount;

    public CoralReef(String reefName, String location, int speciesCount) {
        this.reefName = reefName;
        this.location = location;
        this.speciesCount = speciesCount;
    }

    @Override
    public String toString() {
        return "reef name is " + this.reefName +
                " location is " + this.location +
                " species count is " + this.speciesCount;
    }

    @Override
    public int hashCode(){
        return 34;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof CoralReef) {
                System.out.println("will compare.....");
                CoralReef coralReef = this;
                CoralReef coralReef1 = (CoralReef) obj;
                if(coralReef.reefName.equals(coralReef1.reefName) && coralReef.speciesCount == coralReef1.speciesCount) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
