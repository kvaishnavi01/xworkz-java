class PowerBank {
    String brand;
    int capacity;
    int ports;
    String color;

    PowerBank() {
        System.out.println("PowerBank object created!");
    }

    public static void main(String[] args) {
        PowerBank p1 = new PowerBank();
        p1.brand = "Anker";
        p1.capacity = 10000;
        p1.ports = 2;
        p1.color = "Black";
        System.out.println(p1.brand + "  " + p1.capacity + "mAh  " + p1.ports + " ports  " + p1.color);

        PowerBank p2 = new PowerBank();
        p2.brand = "Xiaomi";
        p2.capacity = 20000;
        p2.ports = 3;
        p2.color = "White";
        System.out.println(p2.brand + "  " + p2.capacity + "mAh  " + p2.ports + " ports  " + p2.color);

        PowerBank p3 = new PowerBank();
        p3.brand = "Samsung";
        p3.capacity = 15000;
        p3.ports = 2;
        p3.color = "Blue";
        System.out.println(p3.brand + "  " + p3.capacity + "mAh  " + p3.ports + " ports  " + p3.color);

        PowerBank p4 = new PowerBank();
        p4.brand = "Sony";
        p4.capacity = 12000;
        p4.ports = 1;
        p4.color = "Grey";
        System.out.println(p4.brand + "  " + p4.capacity + "mAh  " + p4.ports + " ports  " + p4.color);

        PowerBank p5 = new PowerBank();
        p5.brand = "OnePlus";
        p5.capacity = 18000;
        p5.ports = 2;
        p5.color = "Red";
        System.out.println(p5.brand + "  " + p5.capacity + "mAh  " + p5.ports + " ports  " + p5.color);

        PowerBank p6 = new PowerBank();
        p6.brand = "Realme";
        p6.capacity = 10000;
        p6.ports = 1;
        p6.color = "Yellow";
        System.out.println(p6.brand + "  " + p6.capacity + "mAh  " + p6.ports + " ports  " + p6.color);

        PowerBank p7 = new PowerBank();
        p7.brand = "Asus";
        p7.capacity = 13000;
        p7.ports = 2;
        p7.color = "Silver";
        System.out.println(p7.brand + "  " + p7.capacity + "mAh  " + p7.ports + " ports  " + p7.color);

        PowerBank p8 = new PowerBank();
        p8.brand = "Lenovo";
        p8.capacity = 20000;
        p8.ports = 3;
        p8.color = "Black";
        System.out.println(p8.brand + "  " + p8.capacity + "mAh  " + p8.ports + " ports  " + p8.color);

        PowerBank p9 = new PowerBank();
        p9.brand = "HP";
        p9.capacity = 12000;
        p9.ports = 2;
        p9.color = "White";
        System.out.println(p9.brand + "  " + p9.capacity + "mAh  " + p9.ports + " ports  " + p9.color);

        PowerBank p10 = new PowerBank();
        p10.brand = "Dell";
        p10.capacity = 15000;
        p10.ports = 2;
        p10.color = "Blue";
        System.out.println(p10.brand + "  " + p10.capacity + "mAh  " + p10.ports + " ports  " + p10.color);
    }
}
