class Bucket 
{
    String material;
    int capacity;
    String color;
    boolean hasLid;
    double height;
    String shape;

    Bucket() 
    {
        System.out.println("Bucket() constructor called");
    }

    Bucket(String material) 
    {
        this.material = material;
        System.out.println("Bucket(String material) constructor called");
    }

    Bucket(String material, int capacity) 
    {
        this.material = material;
        this.capacity = capacity;
        System.out.println("Bucket(String material, int capacity) constructor called");
    }

    Bucket(String material, int capacity, String color) 
    {
        this.material = material;
        this.capacity = capacity;
        this.color = color;
        System.out.println("Bucket(String material, int capacity, String color) constructor called");
    }

    Bucket(String material, int capacity, String color, boolean hasLid) 
    {
        this(material, capacity, color);
        this.hasLid = hasLid;
        System.out.println("Bucket(String material, int capacity, String color, boolean hasLid) constructor called");
    }

    Bucket(String material, int capacity, String color, boolean hasLid, double height) 
    {
        this(material, capacity, color, hasLid);
        this.height = height;
        System.out.println("Bucket(String material, int capacity, String color, boolean hasLid, double height) constructor called");
    }

    Bucket(String material, int capacity, String color, boolean hasLid, double height, String shape) 
    {
        this(material, capacity, color, hasLid, height);
        this.shape = shape;
        System.out.println("Bucket(String material, int capacity, String color, boolean hasLid, double height, String shape) constructor called");
    }

    void display() 
    {
        System.out.println("Bucket - Material: " + material + ", Capacity: " + capacity + "L, Color: " + color 
                           + ", Has Lid: " + hasLid + ", Height: " + height + "cm, Shape: " + shape);
    }
}
