class Bullet {
    String type;
    double caliber;
    int velocity;
    String material;

    Bullet() {
        System.out.println("Bullet object created!");
    }

    public static void main(String[] args) {
        Bullet b1 = new Bullet();
        b1.type = "FMJ";
        b1.caliber = 9.0;
        b1.velocity = 1200;
        b1.material = "Lead";
        System.out.println(b1.type + "  " + b1.caliber + "mm  " + b1.velocity + " " + b1.material);

        Bullet b2 = new Bullet();
        b2.type = "Hollow Point";
        b2.caliber = 10.0;
        b2.velocity = 1100;
        b2.material = "Copper";
        System.out.println(b2.type + "  " + b2.caliber + "mm  " + b2.velocity + " " + b2.material);

        Bullet b3 = new Bullet();
        b3.type = "Armor Piercing";
        b3.caliber = 7.62;
        b3.velocity = 2800;
        b3.material = "Steel";
        System.out.println(b3.type + "  " + b3.caliber + "mm  " + b3.velocity + " " + b3.material);

        Bullet b4 = new Bullet();
        b4.type = "Tracer";
        b4.caliber = 5.56;
        b4.velocity = 3200;
        b4.material = "Phosphor";
        System.out.println(b4.type + "  " + b4.caliber + "mm  " + b4.velocity + " " + b4.material);

        Bullet b5 = new Bullet();
        b5.type = "Shotgun Shell";
        b5.caliber = 12.0;
        b5.velocity = 1600;
        b5.material = "Plastic & Lead";
        System.out.println(b5.type + "  " + b5.caliber + " gauge  " + b5.velocity + " " + b5.material);

        Bullet b6 = new Bullet();
        b6.type = "Rubber Bullet";
        b6.caliber = 37.0;
        b6.velocity = 600;
        b6.material = "Rubber";
        System.out.println(b6.type + "  " + b6.caliber + "mm  " + b6.velocity + " " + b6.material);

        Bullet b7 = new Bullet();
        b7.type = "Subsonic";
        b7.caliber = 300.0;
        b7.velocity = 1050;
        b7.material = "Brass";
        System.out.println(b7.type + "  " + b7.caliber + "mm  " + b7.velocity + " " + b7.material);

        Bullet b8 = new Bullet();
        b8.type = "Explosive";
        b8.caliber = 50.0;
        b8.velocity = 2800;
        b8.material = "Tungsten";
        System.out.println(b8.type + "  " + b8.caliber + "mm  " + b8.velocity + " " + b8.material);

        Bullet b9 = new Bullet();
        b9.type = "Caseless";
        b9.caliber = 4.73;
        b9.velocity = 3000;
        b9.material = "Polymer";
        System.out.println(b9.type + "  " + b9.caliber + "mm  " + b9.velocity + " " + b9.material);

        Bullet b10 = new Bullet();
        b10.type = "Blank";
        b10.caliber = 5.56;
        b10.velocity = 0;
        b10.material = "Paper & Wax";
        System.out.println(b10.type + "  " + b10.caliber + "mm  " + b10.velocity + " " + b10.material);
    }
}
