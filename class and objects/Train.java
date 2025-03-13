class Train {
    String name;
    int number;
    double speed;
    String type;

    Train() {
        System.out.println("Train object created!");
    }

    public static void main(String[] args) {
        Train t1 = new Train();
        t1.name = "Shinkansen";
        t1.number = 101;
        t1.speed = 320.0;
        t1.type = "Bullet Train";
        System.out.println(t1.name + "  " + t1.number + "  " + t1.speed + " km/h  " + t1.type);

        Train t2 = new Train();
        t2.name = "Eurostar";
        t2.number = 202;
        t2.speed = 300.0;
        t2.type = "High-Speed Train";
        System.out.println(t2.name + "  " + t2.number + "  " + t2.speed + " km/h  " + t2.type);

        Train t3 = new Train();
        t3.name = "Maglev";
        t3.number = 303;
        t3.speed = 431.0;
        t3.type = "Magnetic Levitation";
        System.out.println(t3.name + "  " + t3.number + "  " + t3.speed + " km/h  " + t3.type);

        Train t4 = new Train();
        t4.name = "Rajdhani Express";
        t4.number = 404;
        t4.speed = 140.0;
        t4.type = "Express Train";
        System.out.println(t4.name + "  " + t4.number + "  " + t4.speed + " km/h  " + t4.type);

        Train t5 = new Train();
        t5.name = "TGV";
        t5.number = 505;
        t5.speed = 320.0;
        t5.type = "High-Speed Train";
        System.out.println(t5.name + "  " + t5.number + "  " + t5.speed + " km/h  " + t5.type);

        Train t6 = new Train();
        t6.name = "Frecciarossa";
        t6.number = 606;
        t6.speed = 300.0;
        t6.type = "High-Speed Train";
        System.out.println(t6.name + "  " + t6.number + "  " + t6.speed + " km/h  " + t6.type);

        Train t7 = new Train();
        t7.name = "Duronto Express";
        t7.number = 707;
        t7.speed = 130.0;
        t7.type = "Express Train";
        System.out.println(t7.name + "  " + t7.number + "  " + t7.speed + " km/h  " + t7.type);

        Train t8 = new Train();
        t8.name = "ICE";
        t8.number = 808;
        t8.speed = 330.0;
        t8.type = "High-Speed Train";
        System.out.println(t8.name + "  " + t8.number + "  " + t8.speed + " km/h  " + t8.type);

        Train t9 = new Train();
        t9.name = "Acela Express";
        t9.number = 909;
        t9.speed = 240.0;
        t9.type = "High-Speed Train";
        System.out.println(t9.name + "  " + t9.number + "  " + t9.speed + " km/h  " + t9.type);

        Train t10 = new Train();
        t10.name = "Gatimaan Express";
        t10.number = 1010;
        t10.speed = 160.0;
        t10.type = "Semi-High-Speed Train";
        System.out.println(t10.name + "  " + t10.number + "  " + t10.speed + " km/h  " + t10.type);
    }
}
