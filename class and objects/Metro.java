class Metro {
    String name;
    int numberOfCoaches;
    double speed;
    String city;

    Metro() {
        System.out.println("Metro object created!");
    }

    public static void main(String[] args) {
        Metro m1 = new Metro();
        m1.name = "Blue Line";
        m1.numberOfCoaches = 8;
        m1.speed = 80.5;
        m1.city = "New York";
        System.out.println(m1.name + "  " + m1.numberOfCoaches + " coaches  " + m1.speed + " km/h  " + m1.city);

        Metro m2 = new Metro();
        m2.name = "Red Line";
        m2.numberOfCoaches = 6;
        m2.speed = 75.0;
        m2.city = "Chicago";
        System.out.println(m2.name + "  " + m2.numberOfCoaches + " coaches  " + m2.speed + " km/h  " + m2.city);

        Metro m3 = new Metro();
        m3.name = "Green Line";
        m3.numberOfCoaches = 10;
        m3.speed = 85.0;
        m3.city = "Los Angeles";
        System.out.println(m3.name + "  " + m3.numberOfCoaches + " coaches  " + m3.speed + " km/h  " + m3.city);

        Metro m4 = new Metro();
        m4.name = "Yellow Line";
        m4.numberOfCoaches = 7;
        m4.speed = 78.5;
        m4.city = "Boston";
        System.out.println(m4.name + "  " + m4.numberOfCoaches + " coaches  " + m4.speed + " km/h  " + m4.city);

        Metro m5 = new Metro();
        m5.name = "Purple Line";
        m5.numberOfCoaches = 9;
        m5.speed = 82.0;
        m5.city = "San Francisco";
        System.out.println(m5.name + "  " + m5.numberOfCoaches + " coaches  " + m5.speed + " km/h  " + m5.city);

        Metro m6 = new Metro();
        m6.name = "Orange Line";
        m6.numberOfCoaches = 6;
        m6.speed = 76.5;
        m6.city = "Houston";
        System.out.println(m6.name + "  " + m6.numberOfCoaches + " coaches  " + m6.speed + " km/h  " + m6.city);

        Metro m7 = new Metro();
        m7.name = "Silver Line";
        m7.numberOfCoaches = 8;
        m7.speed = 79.5;
        m7.city = "Seattle";
        System.out.println(m7.name + "  " + m7.numberOfCoaches + " coaches  " + m7.speed + " km/h  " + m7.city);

        Metro m8 = new Metro();
        m8.name = "Brown Line";
        m8.numberOfCoaches = 7;
        m8.speed = 81.0;
        m8.city = "Philadelphia";
        System.out.println(m8.name + "  " + m8.numberOfCoaches + " coaches  " + m8.speed + " km/h  " + m8.city);

        Metro m9 = new Metro();
        m9.name = "Pink Line";
        m9.numberOfCoaches = 5;
        m9.speed = 74.5;
        m9.city = "Miami";
        System.out.println(m9.name + "  " + m9.numberOfCoaches + " coaches  " + m9.speed + " km/h  " + m9.city);

        Metro m10 = new Metro();
        m10.name = "Gold Line";
        m10.numberOfCoaches = 10;
        m10.speed = 88.0;
        m10.city = "Atlanta";
        System.out.println(m10.name + "  " + m10.numberOfCoaches + " coaches  " + m10.speed + " km/h  " + m10.city);
    }
}
