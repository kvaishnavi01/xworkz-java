class Water 
{
    String source;
    double volume;
    boolean isDrinkable;
    String color;
    double temperature;
    String state;

    Water() 
    {
        System.out.println("Water() constructor called");
    }

    Water(String source) 
    {
        this.source = source;
        System.out.println("Water(String source) constructor called");
    }

    Water(String source, double volume) 
    {
        this.source = source;
        this.volume = volume;
        System.out.println("Water(String source, double volume) constructor called");
    }

    Water(String source, double volume, boolean isDrinkable) 
    {
        this.source = source;
        this.volume = volume;
        this.isDrinkable = isDrinkable;
        System.out.println("Water(String source, double volume, boolean isDrinkable) constructor called");
    }

    Water(String source, double volume, boolean isDrinkable, String color) 
    {
        this(source, volume, isDrinkable);
        this.color = color;
        System.out.println("Water(String source, double volume, boolean isDrinkable, String color) constructor called");
    }

    Water(String source, double volume, boolean isDrinkable, String color, double temperature) 
    {
        this(source, volume, isDrinkable, color);
        this.temperature = temperature;
        System.out.println("Water(String source, double volume, boolean isDrinkable, String color, double temperature) constructor called");
    }

    Water(String source, double volume, boolean isDrinkable, String color, double temperature, String state) 
    {
        this(source, volume, isDrinkable, color, temperature);
        this.state = state;
        System.out.println("Water(String source, double volume, boolean isDrinkable, String color, double temperature, String state) constructor called");
    }

    void display() 
    {
        System.out.println("Water - Source: " + source + ", Volume: " + volume + "L, Drinkable: " + isDrinkable 
                           + ", Color: " + color + ", Temperature: " + temperature + "°C, State: " + state);
    }
}
