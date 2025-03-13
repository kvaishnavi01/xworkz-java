class Car {
    Car() {
        System.out.println("Car instance created!");
    }
}

class Mobile {
    Mobile() {
        System.out.println("Mobile instance created!");
    }
}

class Laptop {
    Laptop() {
        System.out.println("Laptop instance created!");
    }
}

class Book {
    Book() {
        System.out.println("Book instance created!");
    }
}

class Chair {
    Chair() {
        System.out.println("Chair instance created!");
    }
}

public class MainRunnerE {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Car obj1 = new Car();
            Mobile obj2 = new Mobile();
            Laptop obj3 = new Laptop();
            Book obj4 = new Book();
            Chair obj5 = new Chair();
        }
    }
}
