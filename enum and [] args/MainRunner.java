class Car {
    void details() {
        System.out.println("Car instance created!");
    }
}

class Mobile {
    void details() {
        System.out.println("Mobile instance created!");
    }
}

class Laptop {
    void details() {
        System.out.println("Laptop instance created!");
    }
}

class Book {
    void details() {
        System.out.println("Book instance created!");
    }
}

class Chair {
    void details() {
        System.out.println("Chair instance created!");
    }
}

public class MainRunner {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Car obj1 = new Car();
            obj1.details();

            Mobile obj2 = new Mobile();
            obj2.details();

            Laptop obj3 = new Laptop();
            obj3.details();

            Book obj4 = new Book();
            obj4.details();

            Chair obj5 = new Chair();
            obj5.details();
        }
    }
}
