class Bag {
    String brand;
    double capacity;
    int compartments;
    String material;

    Bag() {
        System.out.println("Bag object created!");
    }

    public static void main(String[] args) {
        Bag b1 = new Bag();
        b1.brand = "Nike";
        b1.capacity = 20.5;
        b1.compartments = 3;
        b1.material = "Polyester";
        System.out.println(b1.brand + "  " + b1.capacity + "  " + b1.compartments + " compartments  " + b1.material);

        Bag b2 = new Bag();
        b2.brand = "Adidas";
        b2.capacity = 18.0;
        b2.compartments = 2;
        b2.material = "Nylon";
        System.out.println(b2.brand + "  " + b2.capacity + "  " + b2.compartments + " compartments  " + b2.material);

        Bag b3 = new Bag();
        b3.brand = "Puma";
        b3.capacity = 22.0;
        b3.compartments = 4;
        b3.material = "Canvas";
        System.out.println(b3.brand + "  " + b3.capacity + "  " + b3.compartments + " compartments  " + b3.material);

        Bag b4 = new Bag();
        b4.brand = "Under Armour";
        b4.capacity = 19.5;
        b4.compartments = 3;
        b4.material = "Leather";
        System.out.println(b4.brand + "  " + b4.capacity + "  " + b4.compartments + " compartments  " + b4.material);

        Bag b5 = new Bag();
        b5.brand = "Reebok";
        b5.capacity = 25.0;
        b5.compartments = 5;
        b5.material = "Fabric";
        System.out.println(b5.brand + "  " + b5.capacity + "  " + b5.compartments + " compartments  " + b5.material);

        Bag b6 = new Bag();
        b6.brand = "Samsonite";
        b6.capacity = 30.0;
        b6.compartments = 6;
        b6.material = "Polyester";
        System.out.println(b6.brand + "  " + b6.capacity + "  " + b6.compartments + " compartments  " + b6.material);

        Bag b7 = new Bag();
        b7.brand = "Wildcraft";
        b7.capacity = 28.5;
        b7.compartments = 4;
        b7.material = "Nylon";
        System.out.println(b7.brand + "  " + b7.capacity + "  " + b7.compartments + " compartments  " + b7.material);

        Bag b8 = new Bag();
        b8.brand = "American Tourister";
        b8.capacity = 21.0;
        b8.compartments = 3;
        b8.material = "Canvas";
        System.out.println(b8.brand + "  " + b8.capacity + "  " + b8.compartments + " compartments  " + b8.material);

        Bag b9 = new Bag();
        b9.brand = "Skybags";
        b9.capacity = 26.5;
        b9.compartments = 5;
        b9.material = "Leather";
        System.out.println(b9.brand + "  " + b9.capacity + "  " + b9.compartments + " compartments  " + b9.material);

        Bag b10 = new Bag();
        b10.brand = "VIP";
        b10.capacity = 24.0;
        b10.compartments = 4;
        b10.material = "Fabric";
        System.out.println(b10.brand + "  " + b10.capacity + "  " + b10.compartments + " compartments  " + b10.material);
    }
}

