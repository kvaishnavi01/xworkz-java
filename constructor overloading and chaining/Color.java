class Color 
{
    String name;
    String type;
    boolean isWaterSoluble;
    String shade;
    double quantity;
    String origin;

    Color() 
    {
        System.out.println("Color() constructor called");
    }

    Color(String name) 
    {
        this.name = name;
        System.out.println("Color(String name) constructor called");
    }

    Color(String name, String type) 
    {
        this.name = name;
        this.type = type;
        System.out.println("Color(String name, String type) constructor called");
    }

    Color(String name, String type, boolean isWaterSoluble) 
    {
        this.name = name;
        this.type = type;
        this.isWaterSoluble = isWaterSoluble;
        System.out.println("Color(String name, String type, boolean isWaterSoluble) constructor called");
    }

    Color(String name, String type, boolean isWaterSoluble, String shade) 
    {
        this(name, type, isWaterSoluble);
        this.shade = shade;
        System.out.println("Color(String name, String type, boolean isWaterSoluble, String shade) constructor called");
    }

    Color(String name, String type, boolean isWaterSoluble, String shade, double quantity) 
    {
        this(name, type, isWaterSoluble, shade);
        this.quantity = quantity;
        System.out.println("Color(String name, String type, boolean isWaterSoluble, String shade, double quantity) constructor called");
    }

    Color(String name, String type, boolean isWaterSoluble, String shade, double quantity, String origin) 
    {
        this(name, type, isWaterSoluble, shade, quantity);
        this.origin = origin;
        System.out.println("Color(String name, String type, boolean isWaterSoluble, String shade, double quantity, String origin) constructor called");
    }

    void display() 
    {
        System.out.println("Color - Name: " + name + ", Type: " + type + ", Water Soluble: " +    isWaterSoluble + ", Shade: " + shade + ", Quantity: " + quantity + ", Origin: " + origin);
    }
}
