class Chocolate {
    String brand;
    String type;
    double weight;
    int cocoaPercentage;

    Chocolate() {
        System.out.println("Chocolate object created!");
    }

    public static void main(String[] args) {
        Chocolate c1 = new Chocolate();
        c1.brand = "Cadbury";
        c1.type = "Milk Chocolate";
        c1.weight = 150.5;
        c1.cocoaPercentage = 30;
        System.out.println(c1.brand + "  " + c1.type + "  " + c1.weight + "g  " + c1.cocoaPercentage + "% cocoa");

        Chocolate c2 = new Chocolate();
        c2.brand = "Lindt";
        c2.type = "Dark Chocolate";
        c2.weight = 100.0;
        c2.cocoaPercentage = 70;
        System.out.println(c2.brand + "  " + c2.type + "  " + c2.weight + "g  " + c2.cocoaPercentage + "% cocoa");

        Chocolate c3 = new Chocolate();
        c3.brand = "Hershey's";
        c3.type = "Milk Chocolate";
        c3.weight = 120.0;
        c3.cocoaPercentage = 40;
        System.out.println(c3.brand + "  " + c3.type + "  " + c3.weight + "g  " + c3.cocoaPercentage + "% cocoa");

        Chocolate c4 = new Chocolate();
        c4.brand = "Ferrero Rocher";
        c4.type = "Hazelnut Chocolate";
        c4.weight = 200.0;
        c4.cocoaPercentage = 50;
        System.out.println(c4.brand + "  " + c4.type + "  " + c4.weight + "g  " + c4.cocoaPercentage + "% cocoa");

        Chocolate c5 = new Chocolate();
        c5.brand = "Ghirardelli";
        c5.type = "Dark Chocolate";
        c5.weight = 90.0;
        c5.cocoaPercentage = 80;
        System.out.println(c5.brand + "  " + c5.type + "  " + c5.weight + "g  " + c5.cocoaPercentage + "% cocoa");

        Chocolate c6 = new Chocolate();
        c6.brand = "Toblerone";
        c6.type = "Almond Chocolate";
        c6.weight = 170.0;
        c6.cocoaPercentage = 35;
        System.out.println(c6.brand + "  " + c6.type + "  " + c6.weight + "g  " + c6.cocoaPercentage + "% cocoa");

        Chocolate c7 = new Chocolate();
        c7.brand = "Nestle";
        c7.type = "White Chocolate";
        c7.weight = 110.0;
        c7.cocoaPercentage = 20;
        System.out.println(c7.brand + "  " + c7.type + "  " + c7.weight + "g  " + c7.cocoaPercentage + "% cocoa");

        Chocolate c8 = new Chocolate();
        c8.brand = "Godiva";
        c8.type = "Milk Chocolate";
        c8.weight = 130.0;
        c8.cocoaPercentage = 45;
        System.out.println(c8.brand + "  " + c8.type + "  " + c8.weight + "g  " + c8.cocoaPercentage + "% cocoa");

        Chocolate c9 = new Chocolate();
        c9.brand = "Mars";
        c9.type = "Caramel Chocolate";
        c9.weight = 95.0;
        c9.cocoaPercentage = 25;
        System.out.println(c9.brand + "  " + c9.type + "  " + c9.weight + "g  " + c9.cocoaPercentage + "% cocoa");

        Chocolate c10 = new Chocolate();
        c10.brand = "Dove";
        c10.type = "Dark Chocolate";
        c10.weight = 105.0;
        c10.cocoaPercentage = 60;
        System.out.println(c10.brand + "  " + c10.type + "  " + c10.weight + "g  " + c10.cocoaPercentage + "% cocoa");
    }
}
