class Icecream {
    public static void melt() { 
        System.out.println("Icecream melting."); 
    }

    public static void freeze() { 
        System.out.println("Icecream frozen."); 
    }

    public static void serve() { 
        System.out.println("Icecream served."); 
    }

    public static void changeFlavor() { 
        System.out.println("Flavor changed."); 
    }

    public static void addTopping() { 
        System.out.println("Topping added."); 
    }

    public static void checkTemperature() { 
        System.out.println("Temperature checked."); 
    }

    public static void checkExpiry() { 
        System.out.println("Expiry checked."); 
    }

    public static void packageIcecream() { 
        System.out.println("Icecream packaged."); 
    }

    public static void sell() { 
        System.out.println("Icecream sold."); 
    }

    public static void eat() { 
        System.out.println("Icecream eaten."); 
    }

    public static void main(String[] args) {
        melt();
        freeze();
        serve();
        changeFlavor();
        addTopping();
    }
}

class Customer {
    public static void main(String[] args) {
        Icecream.checkTemperature();
        Icecream.checkExpiry();
        Icecream.packageIcecream();
        Icecream.sell();
        Icecream.eat();
    }
}