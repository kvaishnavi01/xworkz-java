class Tomato 
{
    String type;
    double weight;
    String color;
    boolean isRipe;
    String origin;
    int quantity;

    Tomato() 
    {
        System.out.println("Tomato() constructor called");
    }

    Tomato(String type) 
    {
        this.type = type;
        System.out.println("Tomato(String type) constructor called");
    }

    Tomato(String type, double weight) 
    {
        this.type = type;
        this.weight = weight;
        System.out.println("Tomato(String type, double weight) constructor called");
    }

    Tomato(String type, double weight, String color) 
    {
        this.type = type;
        this.weight = weight;
        this.color = color;
        System.out.println("Tomato(String type, double weight, String color) constructor called");
    }

    Tomato(String type, double weight, String color, boolean isRipe) 
    {
        this(type, weight, color);
        this.isRipe = isRipe;
        System.out.println("Tomato(String type, double weight, String color, boolean isRipe) constructor called");
    }

    Tomato(String type, double weight, String color, boolean isRipe, String origin) 
    {
        this(type, weight, color, isRipe);
        this.origin = origin;
        System.out.println("Tomato(String type, double weight, String color, boolean isRipe, String origin) constructor called");
    }

    Tomato(String type, double weight, String color, boolean isRipe, String origin, int quantity) 
    {
        this(type, weight, color, isRipe, origin);
        this.quantity = quantity;
        System.out.println("Tomato(String type, double weight, String color, boolean isRipe, String origin, int quantity) constructor called");
    }

    void display() 
    {
        System.out.println("Tomato - Type: " + type + ", Weight: " + weight + "g, Color: " + color 
                           + ", Ripe: " + isRipe + ", Origin: " + origin + ", Quantity: " + quantity);
    }
}