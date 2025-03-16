class Gun 
{
    String type;
    String material;
    int size;
    boolean isLoaded;
    String color;
    double weight;

    Gun() 
    {
        System.out.println("Gun() constructor called");
    }

    Gun(String type) 
    {
        this.type = type;
        System.out.println("Gun(String type) constructor called");
    }

    Gun(String type, String material) 
    {
        this.type = type;
        this.material = material;
        System.out.println("Gun(String type, String material) constructor called");
    }

    Gun(String type, String material, int size) 
    {
        this.type = type;
        this.material = material;
        this.size = size;
        System.out.println("Gun(String type, String material, int size) constructor called");
    }

    Gun(String type, String material, int size, boolean isLoaded) 
    {
        this(type, material, size);
        this.isLoaded = isLoaded;
        System.out.println("Gun(String type, String material, int size, boolean isLoaded) constructor called");
    }

    Gun(String type, String material, int size, boolean isLoaded, String color) 
    {
        this(type, material, size, isLoaded);
        this.color = color;
        System.out.println("Gun(String type, String material, int size, boolean isLoaded, String color) constructor called");
    }

    Gun(String type, String material, int size, boolean isLoaded, String color, double weight) 
    {
        this(type, material, size, isLoaded, color);
        this.weight = weight;
        System.out.println("Gun(String type, String material, int size, boolean isLoaded, String color, double weight) constructor called");
    }

    void display() 
    {
        System.out.println("Gun - Type: " + type + ", Material: " + material + ", Size: " + size + "cm, Loaded: " + isLoaded 
                           + ", Color: " + color + ", Weight: " + weight + "g");
    }
}

