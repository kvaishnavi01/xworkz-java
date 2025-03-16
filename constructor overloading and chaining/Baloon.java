class Baloon 
{
    String color;
    int size;
    boolean isFilled;
    String shape;
    double weight;
    String material;

    Baloon() 
    {
        System.out.println("Baloon() constructor called");
    }

    Baloon(String color) 
    {
        this.color = color;
        System.out.println("Baloon(String color) constructor called");
    }

    Baloon(String color, int size) 
    {
        this.color = color;
        this.size = size;
        System.out.println("Baloon(String color, int size) constructor called");
    }

    Baloon(String color, int size, boolean isFilled) 
    {
        this.color = color;
        this.size = size;
        this.isFilled = isFilled;
        System.out.println("Baloon(String color, int size, boolean isFilled) constructor called");
    }

    Baloon(String color, int size, boolean isFilled, String shape) 
    {
        this(color, size, isFilled);
        this.shape = shape;
        System.out.println("Baloon(String color, int size, boolean isFilled, String shape) constructor called");
    }

    Baloon(String color, int size, boolean isFilled, String shape, double weight) 
    {
        this(color, size, isFilled, shape);
        this.weight = weight;
        System.out.println("Baloon(String color, int size, boolean isFilled, String shape, double weight) constructor called");
    }

    Baloon(String color, int size, boolean isFilled, String shape, double weight, String material) 
    {
        this(color, size, isFilled, shape, weight);
        this.material = material;
        System.out.println("Baloon(String color, int size, boolean isFilled, String shape, double weight, String material) constructor called");
    }

    void display() 
    {
        System.out.println("Baloon Color: " + color + ", Size: " + size + ", Filled: " + isFilled + ", Shape: " + shape + ", Weight: " + weight + ", Material: " + material);
		
    }
}
