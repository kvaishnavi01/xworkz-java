//2. PostRunner.main---> AreaPostOffice.deliver(customername,address)--> SubRegionalPostOffice.deliver(customername,address)-->RegionalPostOffice.deliver(customername,address)--->PostHeadMaster(customername,address)---->PostMaster(customername,address)

class Runner1 {
    public static void main(String[] args) {
        System.out.println("Main method running");
        AreaPostOffice.deliver("John Doe", "123 Main St");
    }
}

class AreaPostOffice {
    public static void deliver(String customerName, String address) {
        System.out.println("AreaPostOffice running");
        SubRegionalPostOffice.deliver(customerName, address);
    }
}

class SubRegionalPostOffice {
    public static void deliver(String customerName, String address) {
        System.out.println("SubRegionalPostOffice running");
        RegionalPostOffice.deliver(customerName, address);
    }
}

class RegionalPostOffice {
    public static void deliver(String customerName, String address) {
        System.out.println("RegionalPostOffice running");
        PostHeadMaster.deliver(customerName, address);
    }
}

class PostHeadMaster {
    public static void deliver(String customerName, String address) {
        System.out.println("PostHeadMaster processing");
        PostMaster.deliver(customerName, address);
    }
}

class PostMaster {
    public static void deliver(String customerName, String address) {
        System.out.println("Final delivery to " + customerName + " at " + address);
    }
}
