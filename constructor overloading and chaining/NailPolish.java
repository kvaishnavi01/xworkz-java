class NailPolish 
{
    String brand;
    String color;
    double volume;
    boolean isGlossy;
    String finish;
    double price;

    NailPolish() 
    {
        System.out.println("NailPolish() constructor called");
    }

    NailPolish(String brand) 
    {
        this.brand = brand;
        System.out.println("NailPolish(String brand) constructor called");
    }

    NailPolish(String brand, String color) 
    {
        this.brand = brand;
        this.color = color;
        System.out.println("NailPolish(String brand, String color) constructor called");
    }

    NailPolish(String brand, String color, double volume) 
    {
        this.brand = brand;
        this.color = color;
        this.volume = volume;
        System.out.println("NailPolish(String brand, String color, double volume) constructor called");
    }

    NailPolish(String brand, String color, double volume, boolean isGlossy) 
    {
        this(brand, color, volume);
        this.isGlossy = isGlossy;
        System.out.println("NailPolish(String brand, String color, double volume, boolean isGlossy) constructor called");
    }

    NailPolish(String brand, String color, double volume, boolean isGlossy, String finish) 
    {
        this(brand, color, volume, isGlossy);
        this.finish = finish;
        System.out.println("NailPolish(String brand, String color, double volume, boolean isGlossy, String finish) constructor called");
    }

    NailPolish(String brand, String color, double volume, boolean isGlossy, String finish, double price) 
    {
        this(brand, color, volume, isGlossy, finish);
        this.price = price;
        System.out.println("NailPolish(String brand, String color, double volume, boolean isGlossy, String finish, double price) constructor called");
    }

    void display() 
    {
        System.out.println("NailPolish - Brand: " + brand + ", Color: " + color + ", Volume: " + volume + "ml, Glossy: " + isGlossy 
                           + ", Finish: " + finish + ", Price: $" + price);
    }
}

