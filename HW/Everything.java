class Lipstick {
    static void apply() {
        System.out.println("Applying lipstick.");
        remove();
        Brand.showBrand();
        Perfume.spray();
    }
    static void remove() {
        System.out.println("Removing lipstick.");
    }
    static void checkShade() {
        System.out.println("Checking lipstick shade.");
        checkExpiry();
        Trafficsignal.stop();
        Gold.polish();
    }
    static void checkExpiry() {
        System.out.println("Checking lipstick expiry.");
    }
}

class Trafficsignal {
    static void stop() {
        System.out.println("Red light - Stop!");
        go();
        Pineapple.eat();
        Wallet.open();
    }
    static void go() {
        System.out.println("Green light - Go!");
    }
    static void checkLight() {
        System.out.println("Checking traffic light status.");
        repairSignal();
        Brand.rateBrand();
        Currency.exchange();
    }
    static void repairSignal() {
        System.out.println("Repairing traffic signal.");
    }
}

class Brand {
    static void showBrand() {
        System.out.println("Showing brand details.");
        compareBrand();
        Gold.melt();
        Bitcoin.checkValue();
    }
    static void compareBrand() {
        System.out.println("Comparing brands.");
    }
    static void rateBrand() {
        System.out.println("Rating the brand.");
        advertiseBrand();
        Pineapple.blendJuice();
        Wire.connect();
    }
    static void advertiseBrand() {
        System.out.println("Advertising brand.");
    }
}

class Pineapple {
    static void eat() {
        System.out.println("Eating pineapple.");
        peel();
        Wire.cut();
        Perfume.checkFragrance();
    }
    static void peel() {
        System.out.println("Peeling pineapple.");
    }
    static void blendJuice() {
        System.out.println("Blending pineapple into juice.");
        storeInFridge();
        Gold.weigh();
        Bitcoin.trade();
    }
    static void storeInFridge() {
        System.out.println("Storing pineapple in fridge.");
    }
}

class Gold {
    static void melt() {
        System.out.println("Melting gold.");
        weigh();
        Wire.testCurrent();
        Currency.convert();
    }
    static void weigh() {
        System.out.println("Weighing gold.");
    }
    static void polish() {
        System.out.println("Polishing gold.");
        verifyPurity();
        Wallet.close();
        Bitcoin.secureStorage();
    }
    static void verifyPurity() {
        System.out.println("Verifying gold purity.");
    }
}

class Wire {
    static void connect() {
        System.out.println("Connecting wire.");
        cut();
        Wallet.depositMoney();
        Trafficsignal.repairSignal();
    }
    static void cut() {
        System.out.println("Cutting wire.");
    }
    static void coil() {
        System.out.println("Coiling wire.");
        testCurrent();
        Perfume.listScents();
        Currency.authenticate();
    }
    static void testCurrent() {
        System.out.println("Testing wire conductivity.");
    }
}

class Perfume {
    static void spray() {
        System.out.println("Spraying perfume.");
        checkFragrance();
        Pineapple.storeInFridge();
        Gold.verifyPurity();
    }
    static void checkFragrance() {
        System.out.println("Checking perfume fragrance.");
    }
    static void refillBottle() {
        System.out.println("Refilling perfume bottle.");
        listScents();
        Lipstick.checkExpiry();
        Wire.coil();
    }
    static void listScents() {
        System.out.println("Listing perfume scents.");
    }
}

class Wallet {
    static void open() {
        System.out.println("Opening wallet.");
        close();
        Bitcoin.mine();
        Lipstick.remove();
    }
    static void close() {
        System.out.println("Closing wallet.");
    }
    static void checkBalance() {
        System.out.println("Checking wallet balance.");
        depositMoney();
        Currency.print();
        Brand.compareBrand();
    }
    static void depositMoney() {
        System.out.println("Depositing money in wallet.");
    }
}

class Currency {
    static void exchange() {
        System.out.println("Exchanging currency.");
        convert();
        Trafficsignal.go();
        Perfume.refillBottle();
    }
    static void convert() {
        System.out.println("Converting currency.");
    }
    static void print() {
        System.out.println("Printing currency.");
        authenticate();
        Lipstick.checkShade();
        Pineapple.peel();
    }
    static void authenticate() {
        System.out.println("Authenticating currency.");
    }
}

class Bitcoin {
    static void mine() {
        System.out.println("Mining bitcoin.");
        trade();
        Trafficsignal.checkLight();
        Perfume.checkFragrance();
    }
    static void trade() {
        System.out.println("Trading bitcoin.");
    }
    static void checkValue() {
        System.out.println("Checking bitcoin value.");
        secureStorage();
        Wire.cut();
        Wallet.checkBalance();
    }
    static void secureStorage() {
        System.out.println("Storing bitcoin securely.");
    }
}

public class Everything {
    public static void main(String[] args) {
        Lipstick.apply();
    }
}