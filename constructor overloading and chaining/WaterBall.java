
class WaterBall 
{
    String material;
    int size;
    String color;
    boolean isFilled;
    double weight;
    String shape;

    WaterBall() 
    {
        System.out.println("WaterBall() constructor called");
    }

    WaterBall(String material) 
    {
        this.material = material;
        System.out.println("WaterBall(String material) constructor called");
    }

    WaterBall(String material, int size) 
    {
        this.material = material;
        this.size = size;
        System.out.println("WaterBall(String material, int size) constructor called");
    }

    WaterBall(String material, int size, String color) 
    {
        this.material = material;
        this.size = size;
        this.color = color;
        System.out.println("WaterBall(String material, int size, String color) constructor called");
    }

    WaterBall(String material, int size, String color, boolean isFilled) 
    {
        this(material, size, color);
        this.isFilled = isFilled;
        System.out.println("WaterBall(String material, int size, String color, boolean isFilled) constructor called");
    }

    WaterBall(String material, int size, String color, boolean isFilled, double weight) 
    {
        this(material, size, color, isFilled);
        this.weight = weight;
        System.out.println("WaterBall(String material, int size, String color, boolean isFilled, double weight) constructor called");
    }

    WaterBall(String material, int size, String color, boolean isFilled, double weight, String shape) 
    {
        this(material, size, color, isFilled, weight);
        this.shape = shape;
        System.out.println("WaterBall(String material, int size, String color, boolean isFilled, double weight, String shape) constructor called");
    }

    void display() 
    {
        System.out.println("WaterBall - Material: " + material + ", Size: " + size + "cm, Color: " + color 
                           + ", Filled: " + isFilled + ", Weight: " + weight + "g, Shape: " + shape);
    }
}
