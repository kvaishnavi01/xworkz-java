class Ladder {
    static void climb(String person) {
        System.out.println(person + " is climbing the ladder.");
    }

    static void stepOn(String step) {
        System.out.println("Stepping on " + step);
    }

    static void descend(String person) {
        System.out.println(person + " is descending the ladder.");
    }

    static void extend(String model, int height) {
        System.out.println("Extending " + model + " to " + height + " feet.");
    }

    static void fold(int weight, double width) {
        System.out.println("Folding ladder with weight " + weight + " kg and width " + width + " cm.");
    }

    static void adjust(String model, int height, double width) {
        System.out.println("Adjusting " + model + " to " + height + " feet and " + width + " cm width.");
    }

    static void paint(int height, double width, String color) {
        System.out.println("Painting ladder " + color + " with height " + height + " feet and width " + width + " cm.");
    }
}

class WhiteBoard {
    static void write(String message) {
        System.out.println("Writing: " + message);
    }

    static void erase(String area) {
        System.out.println("Erasing " + area);
    }

    static void display(String text) {
        System.out.println("Displaying: " + text);
    }

    static void attachMarker(String color, int quantity) {
        System.out.println("Attaching " + quantity + " " + color + " markers.");
    }

    static void clean(int times, double cleanerAmount) {
        System.out.println("Cleaning board " + times + " times with " + cleanerAmount + " ml cleaner.");
    }

    static void mount(String wall, int height, double width) {
        System.out.println("Mounting board on " + wall + " at " + height + " feet height and " + width + " cm width.");
    }

    static void setBrightness(int level, double contrast, String mode) {
        System.out.println("Setting brightness to " + level + " with contrast " + contrast + " in " + mode + " mode.");
    }
}

class FoodItem {
    static void cook(String dish) {
        System.out.println("Cooking " + dish);
    }

    static void serve(String dish) {
        System.out.println("Serving " + dish);
    }

    static void eat(String dish) {
        System.out.println("Eating " + dish);
    }

    static void prepare(String ingredient, int quantity) {
        System.out.println("Preparing " + quantity + " of " + ingredient);
    }

    static void pack(int weight, double price) {
        System.out.println("Packing food with weight " + weight + " grams and price $" + price);
    }

    static void refrigerate(String item, int duration, double temperature) {
        System.out.println("Refrigerating " + item + " for " + duration + " hours at " + temperature + " degrees.");
    }

    static void heat(int temperature, double duration, String method) {
        System.out.println("Heating food to " + temperature + " degrees for " + duration + " minutes using " + method);
    }
}

class Beer {
    static void pour(String brand) {
        System.out.println("Pouring " + brand + " beer.");
    }

    static void drink(String person) {
        System.out.println(person + " is drinking beer.");
    }

    static void store(String container) {
        System.out.println("Storing beer in " + container);
    }

    static void order(String brand, int quantity) {
        System.out.println("Ordering " + quantity + " bottles of " + brand + " beer.");
    }

    static void chill(int temperature, double duration) {
        System.out.println("Chilling beer at " + temperature + " degrees for " + duration + " hours.");
    }

    static void serve(String glassType, int quantity, double volume) {
        System.out.println("Serving " + quantity + " glasses of beer in " + glassType + " with " + volume + " ml each.");
    }

    static void mix(int amount, double alcoholContent, String mixer) {
        System.out.println("Mixing " + amount + " ml of beer with " + alcoholContent + "% alcohol content and " + mixer);
    }
}

class TeddyBear {
    static void hug(String person) {
        System.out.println(person + " is hugging the teddy bear.");
    }

    static void place(String location) {
        System.out.println("Placing teddy bear on " + location);
    }

    static void clean(String method) {
        System.out.println("Cleaning teddy bear using " + method);
    }

    static void decorate(String room, int count) {
        System.out.println("Decorating " + room + " with " + count + " teddy bears.");
    }

    static void gift(int age, double price) {
        System.out.println("Gifting teddy bear for age " + age + " costing $" + price);
    }

    static void repair(String part, int stitches, double cost) {
        System.out.println("Repairing " + part + " with " + stitches + " stitches costing $" + cost);
    }

    static void customize(int size, double weight, String color) {
        System.out.println("Customizing teddy bear of size " + size + " cm, weight " + weight + " kg, in color " + color);
    }
}

class Paper {
    static void write(String text) {
        System.out.println("Writing on paper: " + text);
    }

    static void fold(String style) {
        System.out.println("Folding paper in " + style + " style.");
    }

    static void cut(String shape) {
        System.out.println("Cutting paper into " + shape);
    }

    static void print(String document, int copies) {
        System.out.println("Printing " + copies + " copies of " + document);
    }

    static void recycle(int weight, double cost) {
        System.out.println("Recycling " + weight + " grams of paper costing $" + cost);
    }

    static void decorate(String design, int layers, double thickness) {
        System.out.println("Decorating paper with " + design + " design, " + layers + " layers, and " + thickness + " mm thickness.");
    }

    static void laminate(int size, double density, String finish) {
        System.out.println("Laminating paper of size " + size + " inches, density " + density + " gsm, with " + finish + " finish.");
    }
}

class Tubelight {
    static void turnOn(String location) {
        System.out.println("Turning on tubelight in " + location);
    }

    static void turnOff(String location) {
        System.out.println("Turning off tubelight in " + location);
    }

    static void replace(String brand) {
        System.out.println("Replacing tubelight with " + brand);
    }

    static void install(String room, int height) {
        System.out.println("Installing tubelight in " + room + " at height " + height + " feet.");
    }

    static void dim(int level, double voltage) {
        System.out.println("Dimming tubelight to level " + level + " at " + voltage + " volts.");
    }

    static void checkPower(String status, int consumption, double efficiency) {
        System.out.println("Checking power: " + status + " with " + consumption + " watts at " + efficiency + " efficiency.");
    }

    static void setTimer(int duration, double delay, String mode) {
        System.out.println("Setting tubelight timer for " + duration + " minutes with " + delay + " seconds delay in " + mode + " mode.");
    }
}

public class Main {
    public static void main(String[] args) {
       
        Ladder.climb("John");
        Ladder.stepOn("Second Step");
        Ladder.descend("John");
        Ladder.extend("Model X", 10);
        Ladder.fold(15, 30.5);
        Ladder.adjust("Model Y", 12, 28.2);
        Ladder.paint(15, 35.0, "Red");

        WhiteBoard.write("Hello World");
        WhiteBoard.erase("Top Corner");
        WhiteBoard.display("Java Code");
        WhiteBoard.attachMarker("Blue", 3);
        WhiteBoard.clean(2, 50.5);
        WhiteBoard.mount("Concrete Wall", 6, 100.2);
        WhiteBoard.setBrightness(5, 1.5, "Night");

        FoodItem.cook("Pasta");
        FoodItem.serve("Pizza");
        FoodItem.eat("Burger");
        FoodItem.prepare("Tomato", 5);
        FoodItem.pack(500, 9.99);
        FoodItem.refrigerate("Milk", 12, 4.0);
        FoodItem.heat(180, 10.5, "Microwave");

        Beer.pour("Heineken");
        Beer.drink("Mike");
        Beer.store("Fridge");
        Beer.order("Corona", 6);
        Beer.chill(4, 2.5);
        Beer.serve("Mug", 2, 500);
        Beer.mix(250, 5.0, "Soda");

        TeddyBear.hug("Sarah");
        TeddyBear.place("Shelf");
        TeddyBear.clean("Hand Wash");
        TeddyBear.decorate("Bedroom", 4);
        TeddyBear.gift(5, 20.0);
        TeddyBear.repair("Ear", 3, 5.5);
        TeddyBear.customize(30, 2.5, "Brown");

        Paper.write("Essay");
        Paper.fold("Origami");
        Paper.cut("Star Shape");
        Paper.print("Report", 10);
        Paper.recycle(200, 3.5);
        Paper.decorate("Floral", 2, 0.5);
        Paper.laminate(8, 150, "Glossy");

        Tubelight.turnOn("Living Room");
        Tubelight.turnOff("Kitchen");
        Tubelight.replace("Philips");
        Tubelight.install("Office", 9);
        Tubelight.dim(3, 220);
        Tubelight.checkPower("On", 60, 0.85);
        Tubelight.setTimer(30, 5.0, "Auto-Off");
    }
}
