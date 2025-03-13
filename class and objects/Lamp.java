class Lamp {
    String brand;
    int brightness;
    String type;
    String color;

    Lamp() {
        System.out.println("Lamp object created!");
    }

    public static void main(String[] args) {
        Lamp l1 = new Lamp();
        l1.brand = "Philips";
        l1.brightness = 800;
        l1.type = "LED";
        l1.color = "White";
        System.out.println(l1.brand + "  " + l1.brightness + " " + l1.type + "  " + l1.color);

        Lamp l2 = new Lamp();
        l2.brand = "Syska";
        l2.brightness = 600;
        l2.type = "CFL";
        l2.color = "Yellow";
        System.out.println(l2.brand + "  " + l2.brightness + " " + l2.type + "  " + l2.color);

        Lamp l3 = new Lamp();
        l3.brand = "Wipro";
        l3.brightness = 500;
        l3.type = "Halogen";
        l3.color = "Warm White";
        System.out.println(l3.brand + "  " + l3.brightness + " " + l3.type + "  " + l3.color);

        Lamp l4 = new Lamp();
        l4.brand = "Havells";
        l4.brightness = 1000;
        l4.type = "Fluorescent";
        l4.color = "Cool White";
        System.out.println(l4.brand + "  " + l4.brightness + " " + l4.type + "  " + l4.color);

        Lamp l5 = new Lamp();
        l5.brand = "Panasonic";
        l5.brightness = 750;
        l5.type = "LED";
        l5.color = "Daylight";
        System.out.println(l5.brand + "  " + l5.brightness + " " + l5.type + "  " + l5.color);

        Lamp l6 = new Lamp();
        l6.brand = "Eveready";
        l6.brightness = 650;
        l6.type = "CFL";
        l6.color = "Soft White";
        System.out.println(l6.brand + "  " + l6.brightness + " " + l6.type + "  " + l6.color);

        Lamp l7 = new Lamp();
        l7.brand = "Oreva";
        l7.brightness = 900;
        l7.type = "LED";
        l7.color = "Neutral White";
        System.out.println(l7.brand + "  " + l7.brightness + " " + l7.type + "  " + l7.color);

        Lamp l8 = new Lamp();
        l8.brand = "Bajaj";
        l8.brightness = 850;
        l8.type = "Halogen";
        l8.color = "Golden Yellow";
        System.out.println(l8.brand + "  " + l8.brightness + " " + l8.type + "  " + l8.color);

        Lamp l9 = new Lamp();
        l9.brand = "Orient";
        l9.brightness = 720;
        l9.type = "Fluorescent";
        l9.color = "Cool Daylight";
        System.out.println(l9.brand + "  " + l9.brightness + " " + l9.type + "  " + l9.color);

        Lamp l10 = new Lamp();
        l10.brand = "Crompton";
        l10.brightness = 950;
        l10.type = "LED";
        l10.color = "Warm White";
        System.out.println(l10.brand + "  " + l10.brightness + " " + l10.type + "  " + l10.color);
    }
}
