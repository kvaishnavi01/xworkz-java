class Egg 
{
    String type;
    double weight;
    String color;
    boolean isBoiled;
    String origin;
    int quantity;

    Egg() 
    {
        System.out.println("Egg() constructor called");
    }

    Egg(String type) 
    {
        this.type = type;
        System.out.println("Egg(String type) constructor called");
    }

    Egg(String type, double weight) 
    {
        this.type = type;
        this.weight = weight;
        System.out.println("Egg(String type, double weight) constructor called");
    }

    Egg(String type, double weight, String color) 
    {
        this.type = type;
        this.weight = weight;
        this.color = color;
        System.out.println("Egg(String type, double weight, String color) constructor called");
    }

    Egg(String type, double weight, String color, boolean isBoiled) 
    {
        this(type, weight, color);
        this.isBoiled = isBoiled;
        System.out.println("Egg(String type, double weight, String color, boolean isBoiled) constructor called");
    }

    Egg(String type, double weight, String color, boolean isBoiled, String origin) 
    {
        this(type, weight, color, isBoiled);
        this.origin = origin;
        System.out.println("Egg(String type, double weight, String color, boolean isBoiled, String origin) constructor called");
    }

    Egg(String type, double weight, String color, boolean isBoiled, String origin, int quantity) 
    {
        this(type, weight, color, isBoiled, origin);
        this.quantity = quantity;
        System.out.println("Egg(String type, double weight, String color, boolean isBoiled, String origin, int quantity) constructor called");
    }

    void display() 
    {
        System.out.println("Egg - Type: " + type + ", Weight: " + weight + "g, Color: " + color 
                           + ", Boiled: " + isBoiled + ", Origin: " + origin + ", Quantity: " + quantity);
    }
}
