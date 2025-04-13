package com.xworkz.tostring;

public class Toy {
    private String name;
    private double price;
    private String type;

    public Toy(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "name is " + this.name +
                " price is " + this.price +
                " type is " + this.type;
    }

    @Override
    public int hashCode(){
        return 39;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Toy) {
                System.out.println("will compare.....");
                Toy toy = this;
                Toy toy1 = (Toy) obj;
                if(toy.name.equals(toy1.name) && toy.price == toy1.price) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
