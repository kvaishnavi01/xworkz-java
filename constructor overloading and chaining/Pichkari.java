class Pichkari 
{
    String type;
    int capacity;
    String color;
    double length;
    boolean isAutomatic;
    String material;

    Pichkari() 
    {
        System.out.println("Pichkari() constructor called");
    }

    Pichkari(String type) 
    {
        this.type = type;
        System.out.println("Pichkari(String type) constructor called");
    }

    Pichkari(String type, int capacity) 
    {
        this.type = type;
        this.capacity = capacity;
        System.out.println("Pichkari(String type, int capacity) constructor called");
    }

    Pichkari(String type, int capacity, String color) 
    {
        this.type = type;
        this.capacity = capacity;
        this.color = color;
        System.out.println("Pichkari(String type, int capacity, String color) constructor called");
    }

    Pichkari(String type, int capacity, String color, double length) 
    {
        this(type, capacity, color);
        this.length = length;
        System.out.println("Pichkari(String type, int capacity, String color, double length) constructor called");
    }

    Pichkari(String type, int capacity, String color, double length, boolean isAutomatic) 
    {
        this(type, capacity, color, length);
        this.isAutomatic = isAutomatic;
        System.out.println("Pichkari(String type, int capacity, String color, double length, boolean isAutomatic) constructor called");
    }

    Pichkari(String type, int capacity, String color, double length, boolean isAutomatic, String material) 
    {
        this(type, capacity, color, length, isAutomatic);
        this.material = material;
        System.out.println("Pichkari(String type, int capacity, String color, double length, boolean isAutomatic, String material) constructor called");
    }

    void display() 
    {
        System.out.println("Pichkari - Type: " + type + ", Capacity: " + capacity + ", Color: " + color + ", Length: " + length + ", Automatic: " + isAutomatic + ", Material: " + material);
    }
}

