class Road {
    String name;
    int length;
    String type;
    boolean isToll;

    Road() {
        System.out.println("Road object created!");
    }

    public static void main(String[] args) {
        Road r1 = new Road();
        r1.name = "Mumbai-Pune Expressway";
        r1.length = 94;
        r1.type = "Expressway";
        r1.isToll = true;
        System.out.println(r1.name + "  " + r1.length + " km  " + r1.type + "  Toll: " + r1.isToll);

        Road r2 = new Road();
        r2.name = "Bangalore-Mysore Highway";
        r2.length = 150;
        r2.type = "Highway";
        r2.isToll = true;
        System.out.println(r2.name + "  " + r2.length + " km  " + r2.type + "  Toll: " + r2.isToll);

        Road r3 = new Road();
        r3.name = "Chennai-Kolkata Highway";
        r3.length = 1660;
        r3.type = "National Highway";
        r3.isToll = true;
        System.out.println(r3.name + "  " + r3.length + " km  " + r3.type + "  Toll: " + r3.isToll);

        Road r4 = new Road();
        r4.name = "Delhi-Agra Expressway";
        r4.length = 200;
        r4.type = "Expressway";
        r4.isToll = true;
        System.out.println(r4.name + "  " + r4.length + " km  " + r4.type + "  Toll: " + r4.isToll);

        Road r5 = new Road();
        r5.name = "NH66 (Mumbai-Goa)";
        r5.length = 577;
        r5.type = "Coastal Highway";
        r5.isToll = false;
        System.out.println(r5.name + "  " + r5.length + " km  " + r5.type + "  Toll: " + r5.isToll);

        Road r6 = new Road();
        r6.name = "Hyderabad-Bangalore Highway";
        r6.length = 570;
        r6.type = "National Highway";
        r6.isToll = true;
        System.out.println(r6.name + "  " + r6.length + " km  " + r6.type + "  Toll: " + r6.isToll);

        Road r7 = new Road();
        r7.name = "Mangalore-Bangalore Highway";
        r7.length = 352;
        r7.type = "Highway";
        r7.isToll = true;
        System.out.println(r7.name + "  " + r7.length + " km  " + r7.type + "  Toll: " + r7.isToll);

        Road r8 = new Road();
        r8.name = "Kolkata-Digha Road";
        r8.length = 184;
        r8.type = "State Highway";
        r8.isToll = false;
        System.out.println(r8.name + "  " + r8.length + " km  " + r8.type + "  Toll: " + r8.isToll);

        Road r9 = new Road();
        r9.name = "Jaipur-Delhi Highway";
        r9.length = 270;
        r9.type = "Highway";
        r9.isToll = true;
        System.out.println(r9.name + "  " + r9.length + " km  " + r9.type + "  Toll: " + r9.isToll);

        Road r10 = new Road();
        r10.name = "Chandigarh-Manali Highway";
        r10.length = 310;
        r10.type = "Hilly Highway";
        r10.isToll = true;
        System.out.println(r10.name + "  " + r10.length + " km  " + r10.type + "  Toll: " + r10.isToll);
    }
}
