class Bottle {
    String brand;
    int capacity;
    String material;
    String color;

    Bottle() {
        System.out.println("Bottle object created!");
    }

    public static void main(String[] args) {
        Bottle b1 = new Bottle();
        b1.brand = "Milton";
        b1.capacity = 1000;
        b1.material = "Steel";
        b1.color = "Silver";
        System.out.println(b1.brand + "  " + b1.capacity + "ml  " + b1.material + "  " + b1.color);

        Bottle b2 = new Bottle();
        b2.brand = "Cello";
        b2.capacity = 750;
        b2.material = "Plastic";
        b2.color = "Blue";
        System.out.println(b2.brand + "  " + b2.capacity + "ml  " + b2.material + "  " + b2.color);

        Bottle b3 = new Bottle();
        b3.brand = "Tupperware";
        b3.capacity = 500;
        b3.material = "Glass";
        b3.color = "Transparent";
        System.out.println(b3.brand + "  " + b3.capacity + "ml  " + b3.material + "  " + b3.color);

        Bottle b4 = new Bottle();
        b4.brand = "Aquafina";
        b4.capacity = 1000;
        b4.material = "Plastic";
        b4.color = "Clear";
        System.out.println(b4.brand + "  " + b4.capacity + "ml  " + b4.material + "  " + b4.color);

        Bottle b5 = new Bottle();
        b5.brand = "Bisleri";
        b5.capacity = 2000;
        b5.material = "Plastic";
        b5.color = "Clear";
        System.out.println(b5.brand + "  " + b5.capacity + "ml  " + b5.material + "  " + b5.color);

        Bottle b6 = new Bottle();
        b6.brand = "Nike";
        b6.capacity = 750;
        b6.material = "Metal";
        b6.color = "Black";
        System.out.println(b6.brand + "  " + b6.capacity + "ml  " + b6.material + "  " + b6.color);

        Bottle b7 = new Bottle();
        b7.brand = "Puma";
        b7.capacity = 600;
        b7.material = "Plastic";
        b7.color = "Red";
        System.out.println(b7.brand + "  " + b7.capacity + "ml  " + b7.material + "  " + b7.color);

        Bottle b8 = new Bottle();
        b8.brand = "Adidas";
        b8.capacity = 500;
        b8.material = "Steel";
        b8.color = "Gray";
        System.out.println(b8.brand + "  " + b8.capacity + "ml  " + b8.material + "  " + b8.color);

        Bottle b9 = new Bottle();
        b9.brand = "Reebok";
        b9.capacity = 900;
        b9.material = "Glass";
        b9.color = "Transparent";
        System.out.println(b9.brand + "  " + b9.capacity + "ml  " + b9.material + "  " + b9.color);

        Bottle b10 = new Bottle();
        b10.brand = "Himalaya";
        b10.capacity = 1500;
        b10.material = "Plastic";
        b10.color = "Green";
        System.out.println(b10.brand + "  " + b10.capacity + "ml  " + b10.material + "  " + b10.color);
    }
}
