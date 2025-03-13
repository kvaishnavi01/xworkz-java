class Supra {
    public static void startEngine() { 
        System.out.println("Engine started."); 
    }

    public static void accelerate() { 
        System.out.println("Car accelerated."); 
    }

    public static void brake() { 
        System.out.println("Brakes applied."); 
    }

    public static void changeGear() { 
        System.out.println("Gear changed."); 
    }

    public static void drift() { 
        System.out.println("Car drifting."); 
    }

    public static void playMusic() { 
        System.out.println("Music playing."); 
    }

    public static void openSunroof() { 
        System.out.println("Sunroof opened."); 
    }

    public static void checkFuelLevel() { 
        System.out.println("Fuel level checked."); 
    }

    public static void washCar() { 
        System.out.println("Car washed."); 
    }

    public static void park() { 
        System.out.println("Car parked."); 
    }

    public static void main(String[] args) {
        startEngine();
        accelerate();
        brake();
        changeGear();
        drift();
    }
}

class Driver {
    public static void main(String[] args) {
        Supra.playMusic();
        Supra.openSunroof();
        Supra.checkFuelLevel();
        Supra.washCar();
        Supra.park();
    }
}