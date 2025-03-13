class MainRunner {
    public static void main(String[] args) {
      
        Festival f1 = new Festival("Diwali", "October", 5);
        Festival f2 = new Festival("Holi", "March", 2);
        Festival f3 = new Festival("Christmas", "December", 1);
        Festival f4 = new Festival("Eid", "April", 1);
        Festival f5 = new Festival("New Year", "January", 1);

        System.out.println(f1.name + ", " + f1.month + ", " + f1.days);
        System.out.println(f2.name + ", " + f2.month + ", " + f2.days);
        System.out.println(f3.name + ", " + f3.month + ", " + f3.days);
        System.out.println(f4.name + ", " + f4.month + ", " + f4.days);
        System.out.println(f5.name + ", " + f5.month + ", " + f5.days);

        Chat c1 = new Chat("Alice", "Hello!", 10);
        Chat c2 = new Chat("Bob", "Hi!", 20);
        Chat c3 = new Chat("Charlie", "How are you?", 30);
        Chat c4 = new Chat("David", "Good morning!", 40);
        Chat c5 = new Chat("Eve", "See you soon!", 50);

        System.out.println(c1.sender + ", " + c1.message + ", " + c1.timestamp);
        System.out.println(c2.sender + ", " + c2.message + ", " + c2.timestamp);
        System.out.println(c3.sender + ", " + c3.message + ", " + c3.timestamp);
        System.out.println(c4.sender + ", " + c4.message + ", " + c4.timestamp);
        System.out.println(c5.sender + ", " + c5.message + ", " + c5.timestamp);

    
        Charger ch1 = new Charger("Samsung", 25, "USB-C");
        Charger ch2 = new Charger("Apple", 20, "Lightning");
        Charger ch3 = new Charger("OnePlus", 65, "Warp");
        Charger ch4 = new Charger("Sony", 30, "USB-C");
        Charger ch5 = new Charger("Dell", 90, "Laptop");

        System.out.println(ch1.brand + ", " + ch1.wattage + ", " + ch1.type);
        System.out.println(ch2.brand + ", " + ch2.wattage + ", " + ch2.type);
        System.out.println(ch3.brand + ", " + ch3.wattage + ", " + ch3.type);
        System.out.println(ch4.brand + ", " + ch4.wattage + ", " + ch4.type);
        System.out.println(ch5.brand + ", " + ch5.wattage + ", " + ch5.type);

      
        Harpic h1 = new Harpic("Liquid", 500, true);
        Harpic h2 = new Harpic("Tablet", 200, false);
        Harpic h3 = new Harpic("Gel", 750, true);
        Harpic h4 = new Harpic("Powder", 300, false);
        Harpic h5 = new Harpic("Spray", 600, true);

        System.out.println(h1.type + ", " + h1.volume + ", " + h1.isDisinfectant);
        System.out.println(h2.type + ", " + h2.volume + ", " + h2.isDisinfectant);
        System.out.println(h3.type + ", " + h3.volume + ", " + h3.isDisinfectant);
        System.out.println(h4.type + ", " + h4.volume + ", " + h4.isDisinfectant);
        System.out.println(h5.type + ", " + h5.volume + ", " + h5.isDisinfectant);

   
        WhatsApp w1 = new WhatsApp("John", 15, true);
        WhatsApp w2 = new WhatsApp("Sarah", 20, false);
        WhatsApp w3 = new WhatsApp("Mike", 5, true);
        WhatsApp w4 = new WhatsApp("Emma", 12, false);
        WhatsApp w5 = new WhatsApp("Lucas", 30, true);

        System.out.println(w1.user + ", " + w1.messages + ", " + w1.isOnline);
        System.out.println(w2.user + ", " + w2.messages + ", " + w2.isOnline);
        System.out.println(w3.user + ", " + w3.messages + ", " + w3.isOnline);
        System.out.println(w4.user + ", " + w4.messages + ", " + w4.isOnline);
        System.out.println(w5.user + ", " + w5.messages + ", " + w5.isOnline);

        RatPoison r1 = new RatPoison("BrandA", 100, true);
        RatPoison r2 = new RatPoison("BrandB", 150, true);
        RatPoison r3 = new RatPoison("BrandC", 200, false);
        RatPoison r4 = new RatPoison("BrandD", 120, true);
        RatPoison r5 = new RatPoison("BrandE", 180, false);

        System.out.println(r1.brand + ", " + r1.quantity + ", " + r1.isToxic);
        System.out.println(r2.brand + ", " + r2.quantity + ", " + r2.isToxic);
        System.out.println(r3.brand + ", " + r3.quantity + ", " + r3.isToxic);
        System.out.println(r4.brand + ", " + r4.quantity + ", " + r4.isToxic);
        System.out.println(r5.brand + ", " + r5.quantity + ", " + r5.isToxic);


        Anklet a1 = new Anklet("Gold", 8, "Traditional");
        Anklet a2 = new Anklet("Silver", 9, "Modern");
        Anklet a3 = new Anklet("Platinum", 7, "Fancy");
        Anklet a4 = new Anklet("Brass", 10, "Ethnic");
        Anklet a5 = new Anklet("Copper", 6, "Minimalist");

        System.out.println(a1.material + ", " + a1.size + ", " + a1.design);
        System.out.println(a2.material + ", " + a2.size + ", " + a2.design);
        System.out.println(a3.material + ", " + a3.size + ", " + a3.design);
        System.out.println(a4.material + ", " + a4.size + ", " + a4.design);
        System.out.println(a5.material + ", " + a5.size + ", " + a5.design);

        Magnet m1 = new Magnet("Neodymium", 50, "Disc");
        Magnet m2 = new Magnet("Ferrite", 30, "Bar");
        Magnet m3 = new Magnet("Alnico", 40, "Ring");
        Magnet m4 = new Magnet("Samarium", 60, "Cylinder");
        Magnet m5 = new Magnet("Ceramic", 35, "Block");

        System.out.println(m1.type + ", " + m1.strength + ", " + m1.shape);
        System.out.println(m2.type + ", " + m2.strength + ", " + m2.shape);
        System.out.println(m3.type + ", " + m3.strength + ", " + m3.shape);
        System.out.println(m4.type + ", " + m4.strength + ", " + m4.shape);
        System.out.println(m5.type + ", " + m5.strength + ", " + m5.shape);

        Chain chn1 = new Chain("Gold", 20, "Cuban");
        Chain chn2 = new Chain("Silver", 18, "Rope");
        Chain chn3 = new Chain("Platinum", 22, "Box");
        Chain chn4 = new Chain("Titanium", 25, "Figaro");
        Chain chn5 = new Chain("Steel", 19, "Snake");

        System.out.println(chn1.material + ", " + chn1.length + ", " + chn1.style);
        System.out.println(chn2.material + ", " + chn2.length + ", " + chn2.style);
        System.out.println(chn3.material + ", " + chn3.length + ", " + chn3.style);
        System.out.println(chn4.material + ", " + chn4.length + ", " + chn4.style);
        System.out.println(chn5.material + ", " + chn5.length + ", " + chn5.style);


        Bar b1 = new Bar("The Tavern", "Downtown", 50);
        Bar b2 = new Bar("The Lounge", "Uptown", 75);
        Bar b3 = new Bar("The Pub", "Midtown", 100);
        Bar b4 = new Bar("The Club", "Seaside", 150);
        Bar b5 = new Bar("The Hideout", "Suburbs", 40);

        System.out.println(b1.name + ", " + b1.location + ", " + b1.capacity);
        System.out.println(b2.name + ", " + b2.location + ", " + b2.capacity);
        System.out.println(b3.name + ", " + b3.location + ", " + b3.capacity);
        System.out.println(b4.name + ", " + b4.location + ", " + b4.capacity);
        System.out.println(b5.name + ", " + b5.location + ", " + b5.capacity);

        Sagar s1 = new Sagar("Engineer", 28, "Bangalore");
        Sagar s2 = new Sagar("Doctor", 30, "Mumbai");
        Sagar s3 = new Sagar("Artist", 25, "Delhi");
        Sagar s4 = new Sagar("Musician", 27, "Pune");
        Sagar s5 = new Sagar("Writer", 29, "Chennai");

        System.out.println(s1.occupation + ", " + s1.age + ", " + s1.city);
        System.out.println(s2.occupation + ", " + s2.age + ", " + s2.city);
        System.out.println(s3.occupation + ", " + s3.age + ", " + s3.city);
        System.out.println(s4.occupation + ", " + s4.age + ", " + s4.city);
        System.out.println(s5.occupation + ", " + s5.age + ", " + s5.city);

        Face fa1 = new Face("Round", "Fair", "Happy");
        Face fa2 = new Face("Oval", "Tan", "Serious");
        Face fa3 = new Face("Square", "Dark", "Smiling");
        Face fa4 = new Face("Heart", "Pale", "Neutral");
        Face fa5 = new Face("Diamond", "Olive", "Frowning");

        System.out.println(fa1.shape + ", " + fa1.skinTone + ", " + fa1.expression);
        System.out.println(fa2.shape + ", " + fa2.skinTone + ", " + fa2.expression);
        System.out.println(fa3.shape + ", " + fa3.skinTone + ", " + fa3.expression);
        System.out.println(fa4.shape + ", " + fa4.skinTone + ", " + fa4.expression);
        System.out.println(fa5.shape + ", " + fa5.skinTone + ", " + fa5.expression);
    }
}