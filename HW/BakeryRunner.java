class Bakery {
    public static void buy(String itemName, int quantity) {
        System.out.println("Your order is " + itemName + " " + quantity);
    }

    public static void open(boolean yesorno) {
        System.out.println("Store is open: " + yesorno);
    }

    public static void close(boolean yesorno) {
        System.out.println("Store is closed: " + yesorno);
    }

    public static void owner(String name) {
        System.out.println("Our owner is " + name);
    }

    public static void cashier(String name) {
        System.out.println("Our cashier is " + name);
    }
}

class BakeryRunner {
    public static void main(String[] args) {
        Bakery.buy("chocolate cake", 1);
        Bakery.open(true);
        Bakery.close(false);
        Bakery.owner("vk");
        Bakery.cashier("srk");
    }
}
