class Flag {
    String country;
    String color;
    int height;
    String material;

    Flag() {
        System.out.println("Flag object created!");
    }

    public static void main(String[] args) {
        Flag f1 = new Flag();
        f1.country = "USA";
        f1.color = "Red, White, Blue";
        f1.height = 10;
        f1.material = "Polyester";
        System.out.println(f1.country + "  " + f1.color + "  " + f1.height + "ft  " + f1.material);

        Flag f2 = new Flag();
        f2.country = "India";
        f2.color = "Saffron, White, Green";
        f2.height = 12;
        f2.material = "Cotton";
        System.out.println(f2.country + "  " + f2.color + "  " + f2.height + "ft  " + f2.material);

        Flag f3 = new Flag();
        f3.country = "UK";
        f3.color = "Red, White, Blue";
        f3.height = 15;
        f3.material = "Nylon";
        System.out.println(f3.country + "  " + f3.color + "  " + f3.height + "ft  " + f3.material);

        Flag f4 = new Flag();
        f4.country = "Canada";
        f4.color = "Red, White";
        f4.height = 10;
        f4.material = "Silk";
        System.out.println(f4.country + "  " + f4.color + "  " + f4.height + "ft  " + f4.material);

        Flag f5 = new Flag();
        f5.country = "Germany";
        f5.color = "Black, Red, Yellow";
        f5.height = 8;
        f5.material = "Polyester";
        System.out.println(f5.country + "  " + f5.color + "  " + f5.height + "ft  " + f5.material);

        Flag f6 = new Flag();
        f6.country = "Japan";
        f6.color = "White, Red";
        f6.height = 9;
        f6.material = "Cotton";
        System.out.println(f6.country + "  " + f6.color + "  " + f6.height + "ft  " + f6.material);

        Flag f7 = new Flag();
        f7.country = "Brazil";
        f7.color = "Green, Yellow, Blue";
        f7.height = 14;
        f7.material = "Nylon";
        System.out.println(f7.country + "  " + f7.color + "  " + f7.height + "ft  " + f7.material);

        Flag f8 = new Flag();
        f8.country = "France";
        f8.color = "Blue, White, Red";
        f8.height = 11;
        f8.material = "Silk";
        System.out.println(f8.country + "  " + f8.color + "  " + f8.height + "ft  " + f8.material);

        Flag f9 = new Flag();
        f9.country = "Italy";
        f9.color = "Green, White, Red";
        f9.height = 13;
        f9.material = "Polyester";
        System.out.println(f9.country + "  " + f9.color + "  " + f9.height + "ft  " + f9.material);

        Flag f10 = new Flag();
        f10.country = "China";
        f10.color = "Red, Yellow";
        f10.height = 16;
        f10.material = "Cotton";
        System.out.println(f10.country + "  " + f10.color + "  " + f10.height + "ft  " + f10.material);
    }
}
