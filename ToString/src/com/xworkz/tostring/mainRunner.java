package com.xworkz.tostring;

public class mainRunner {
    public static void main(String[] args) {
        Jug jug = new Jug("red", 2, "plastic");
        Jug jug2 = new Jug("red", 2, "plastic");
        System.out.println(jug);
        System.out.println(jug.hashCode());
        System.out.println(System.identityHashCode(jug));
        System.out.println(jug.equals(jug2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Laptop laptop = new Laptop("HP", 16, 15.6);
        Laptop laptop2 = new Laptop("HP", 16, 15.6);
        System.out.println(laptop);
        System.out.println(laptop.hashCode());
        System.out.println(System.identityHashCode(laptop));
        System.out.println(laptop.equals(laptop2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Pen pen = new Pen("Parker", "Blue", 25.0);
        Pen pen2 = new Pen("Reynolds", "Black", 10.0);
        System.out.println(pen);
        System.out.println(pen.hashCode());
        System.out.println(System.identityHashCode(pen));
        System.out.println(pen.equals(pen2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Chair chair = new Chair("Office", "Plastic", 3.5);
        Chair chair2 = new Chair("Office", "Plastic", 3.5);
        System.out.println(chair);
        System.out.println(chair.hashCode());
        System.out.println(System.identityHashCode(chair));
        System.out.println(chair.equals(chair2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Bottle bottle = new Bottle("Bisleri", 1.0, true);
        Bottle bottle2 = new Bottle("Kinley", 1.0, false);
        System.out.println(bottle);
        System.out.println(bottle.hashCode());
        System.out.println(System.identityHashCode(bottle));
        System.out.println(bottle.equals(bottle2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Fan fan = new Fan("Usha", 5, "White");
        Fan fan2 = new Fan("Usha", 5, "White");
        System.out.println(fan);
        System.out.println(fan.hashCode());
        System.out.println(System.identityHashCode(fan));
        System.out.println(fan.equals(fan2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Mobile mobile = new Mobile("iPhone 13", 128, 79999);
        Mobile mobile2 = new Mobile("Samsung S22", 256, 69999);
        System.out.println(mobile);
        System.out.println(mobile.hashCode());
        System.out.println(System.identityHashCode(mobile));
        System.out.println(mobile.equals(mobile2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Book book = new Book("Wings of Fire", "A.P.J Abdul Kalam", 300);
        Book book2 = new Book("Wings of Fire", "A.P.J Abdul Kalam", 300);
        System.out.println(book);
        System.out.println(book.hashCode());
        System.out.println(System.identityHashCode(book));
        System.out.println(book.equals(book2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Shoe shoe = new Shoe("Nike", 9, "Running");
        Shoe shoe2 = new Shoe("Adidas", 10, "Casual");
        System.out.println(shoe);
        System.out.println(shoe.hashCode());
        System.out.println(System.identityHashCode(shoe));
        System.out.println(shoe.equals(shoe2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Watch watch = new Watch("Titan", "Analog", 2499);
        Watch watch2 = new Watch("Titan", "Analog", 2499);
        System.out.println(watch);
        System.out.println(watch.hashCode());
        System.out.println(System.identityHashCode(watch));
        System.out.println(watch.equals(watch2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Camera camera = new Camera("Canon", 24.1, true);
        Camera camera2 = new Camera("Sony", 20.0, false);
        System.out.println(camera);
        System.out.println(camera.hashCode());
        System.out.println(System.identityHashCode(camera));
        System.out.println(camera.equals(camera2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Keyboard keyboard = new Keyboard("Logitech", true, 104);
        Keyboard keyboard2 = new Keyboard("Logitech", true, 104);
        System.out.println(keyboard);
        System.out.println(keyboard.hashCode());
        System.out.println(System.identityHashCode(keyboard));
        System.out.println(keyboard.equals(keyboard2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Television tv = new Television("Sony", 55, true);
        Television tv2 = new Television("Samsung", 43, false);
        System.out.println(tv);
        System.out.println(tv.hashCode());
        System.out.println(System.identityHashCode(tv));
        System.out.println(tv.equals(tv2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Backpack bag = new Backpack("Wildcraft", 3, true);
        Backpack bag2 = new Backpack("Wildcraft", 3, true);
        System.out.println(bag);
        System.out.println(bag.hashCode());
        System.out.println(System.identityHashCode(bag));
        System.out.println(bag.equals(bag2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Microwave mw = new Microwave("LG", 800, true);
        Microwave mw2 = new Microwave("Samsung", 1000, false);
        System.out.println(mw);
        System.out.println(mw.hashCode());
        System.out.println(System.identityHashCode(mw));
        System.out.println(mw.equals(mw2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Helmet helmet = new Helmet("Vega", "Black", true);
        Helmet helmet2 = new Helmet("Vega", "Black", true);
        System.out.println(helmet);
        System.out.println(helmet.hashCode());
        System.out.println(System.identityHashCode(helmet));
        System.out.println(helmet.equals(helmet2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Speaker speaker = new Speaker("JBL", 20, true);
        Speaker speaker2 = new Speaker("Sony", 30, false);
        System.out.println(speaker);
        System.out.println(speaker.hashCode());
        System.out.println(System.identityHashCode(speaker));
        System.out.println(speaker.equals(speaker2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Printer printer = new Printer("HP", true, 30);
        Printer printer2 = new Printer("HP", true, 30);
        System.out.println(printer);
        System.out.println(printer.hashCode());
        System.out.println(System.identityHashCode(printer));
        System.out.println(printer.equals(printer2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Fridge fridge = new Fridge("Samsung", 250, true);
        Fridge fridge2 = new Fridge("LG", 300, false);
        System.out.println(fridge);
        System.out.println(fridge.hashCode());
        System.out.println(System.identityHashCode(fridge));
        System.out.println(fridge.equals(fridge2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Tablet tablet = new Tablet("Apple", 10.2, true);
        Tablet tablet2 = new Tablet("Apple", 10.2, true);
        System.out.println(tablet);
        System.out.println(tablet.hashCode());
        System.out.println(System.identityHashCode(tablet));
        System.out.println(tablet.equals(tablet2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Projector projector = new Projector("BenQ", "1080p", true);
        Projector projector2 = new Projector("Epson", "4K", false);
        System.out.println(projector);
        System.out.println(projector.hashCode());
        System.out.println(System.identityHashCode(projector));
        System.out.println(projector.equals(projector2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Lamp lamp = new Lamp("Table", "White", true);
        Lamp lamp2 = new Lamp("Table", "White", true);
        System.out.println(lamp);
        System.out.println(lamp.hashCode());
        System.out.println(System.identityHashCode(lamp));
        System.out.println(lamp.equals(lamp2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Mouse mouse = new Mouse("Logitech", true, 1600);
        Mouse mouse2 = new Mouse("HP", false, 1200);
        System.out.println(mouse);
        System.out.println(mouse.hashCode());
        System.out.println(System.identityHashCode(mouse));
        System.out.println(mouse.equals(mouse2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Cycle cycle = new Cycle("Hero", 18, "Aluminum");
        Cycle cycle2 = new Cycle("Hero", 18, "Aluminum");
        System.out.println(cycle);
        System.out.println(cycle.hashCode());
        System.out.println(System.identityHashCode(cycle));
        System.out.println(cycle.equals(cycle2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Drone drone = new Drone("DJI Mini", 30, true);
        Drone drone2 = new Drone("Skydio X2", 25, false);
        System.out.println(drone);
        System.out.println(drone.hashCode());
        System.out.println(System.identityHashCode(drone));
        System.out.println(drone.equals(drone2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Telescope t1 = new Telescope("Celestron", 70, "Altazimuth");
        Telescope t2 = new Telescope("Orion", 80, "Equatorial");
        System.out.println(t1);
        System.out.println(t1.hashCode());
        System.out.println(System.identityHashCode(t1));
        System.out.println(t1.equals(t2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Greenhouse g1 = new Greenhouse("Bangalore", 200, true);
        Greenhouse g2 = new Greenhouse("Bangalore", 200, true);
        System.out.println(g1);
        System.out.println(g1.hashCode());
        System.out.println(System.identityHashCode(g1));
        System.out.println(g1.equals(g2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Museum m1 = new Museum("History Gallery", 1950, true);
        Museum m2 = new Museum("Art Museum", 1975, false);
        System.out.println(m1);
        System.out.println(m1.hashCode());
        System.out.println(System.identityHashCode(m1));
        System.out.println(m1.equals(m2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Volcano v1 = new Volcano("Mount Etna", 3329.0, true);
        Volcano v2 = new Volcano("Mount Etna", 3329.0, true);
        System.out.println(v1);
        System.out.println(v1.hashCode());
        System.out.println(System.identityHashCode(v1));
        System.out.println(v1.equals(v2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Spacesuit s1 = new Spacesuit("Apollo-X", 300, true);
        Spacesuit s2 = new Spacesuit("Orion-S", 250, false);
        System.out.println(s1);
        System.out.println(s1.hashCode());
        System.out.println(System.identityHashCode(s1));
        System.out.println(s1.equals(s2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");



        Candle candle = new Candle("Lavender", 40, true);
        Candle candle1 = new Candle("Lavender", 40, true);
        System.out.println(candle);
        System.out.println(candle.hashCode());
        System.out.println(System.identityHashCode(candle));
        System.out.println(candle.equals(candle1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Harbor harbor = new Harbor("Mumbai", 7, true);
        Harbor harbor1 = new Harbor("Chennai", 8, false);
        System.out.println(harbor);
        System.out.println(harbor.hashCode());
        System.out.println(System.identityHashCode(harbor));
        System.out.println(harbor.equals(harbor1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Windmill windmill = new Windmill("Rajasthan", 45.5, 200);
        Windmill windmill1 = new Windmill("Rajasthan", 50.0, 200);
        System.out.println(windmill);
        System.out.println(windmill.hashCode());
        System.out.println(System.identityHashCode(windmill));
        System.out.println(windmill.equals(windmill1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        CoralReef coralReef = new CoralReef("Great Barrier", "Australia", 1500);
        CoralReef coralReef1 = new CoralReef("Great Barrier", "Pacific", 1400);
        System.out.println(coralReef);
        System.out.println(coralReef.hashCode());
        System.out.println(System.identityHashCode(coralReef));
        System.out.println(coralReef.equals(coralReef1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Submarine submarine = new Submarine("SeaDragon", 400.5, true);
        Submarine submarine1 = new Submarine("SeaDragon", 500.0, true);
        System.out.println(submarine);
        System.out.println(submarine.hashCode());
        System.out.println(System.identityHashCode(submarine));
        System.out.println(submarine.equals(submarine1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Planet planet = new Planet("Jupiter", 139820.0, true);
        Planet planet1 = new Planet("Mars", 6779.0, false);
        System.out.println(planet);
        System.out.println(planet.hashCode());
        System.out.println(System.identityHashCode(planet));
        System.out.println(planet.equals(planet1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Pyramid pyramid = new Pyramid("Great Pyramid of Giza", 146.6, -2560);
        Pyramid pyramid1 = new Pyramid("Great Pyramid of Giza", 138.8, -2560);
        System.out.println(pyramid);
        System.out.println(pyramid.hashCode());
        System.out.println(System.identityHashCode(pyramid));
        System.out.println(pyramid.equals(pyramid1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Comet comet = new Comet("Halley", 75.3, true);
        Comet comet1 = new Comet("Encke", 3.3, true);
        System.out.println(comet);
        System.out.println(comet.hashCode());
        System.out.println(System.identityHashCode(comet));
        System.out.println(comet.equals(comet1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Toy toy = new Toy("Teddy Bear", 499.99, "Plush");
        Toy toy1 = new Toy("Teddy Bear", 499.99, "Stuffed");
        System.out.println(toy);
        System.out.println(toy.hashCode());
        System.out.println(System.identityHashCode(toy));
        System.out.println(toy.equals(toy1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        SchoolBag b = new SchoolBag("Skybags", 3, true, 1.5);
        SchoolBag b1 = new SchoolBag("American Tourister", 4, true, 1.5);
        System.out.println(b);
        System.out.println(b.hashCode());
        System.out.println(System.identityHashCode(b));
        System.out.println(b.equals(b1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Clock clock = new Clock("Wall", 2, true);
        Clock clock1 = new Clock("Wall", 2, false);
        System.out.println(clock);
        System.out.println(clock.hashCode());
        System.out.println(System.identityHashCode(clock));
        System.out.println(clock.equals(clock1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Ticket ticket = new Ticket("Concert", 1500.0, true);
        Ticket ticket1 = new Ticket("Theatre", 1500.0, true);
        System.out.println(ticket);
        System.out.println(ticket.hashCode());
        System.out.println(System.identityHashCode(ticket));
        System.out.println(ticket.equals(ticket1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Bottle bo = new Bottle("Tupperware", 1.5, true);
        Bottle bo1 = new Bottle("Tupperware", 1.5, false);
        System.out.println(bo);
        System.out.println(bo.hashCode());
        System.out.println(System.identityHashCode(bo));
        System.out.println(bo.equals(bo1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        ExamResult result = new ExamResult("Math", 95, 'A');
        ExamResult result1 = new ExamResult("Science", 88, 'A');
        System.out.println(result);
        System.out.println(result.hashCode());
        System.out.println(System.identityHashCode(result));
        System.out.println(result.equals(result1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Bus bus = new Bus("Route 5", 40, 15.5);
        Bus bus1 = new Bus("Route 5", 40, 20.0);
        System.out.println(bus);
        System.out.println(bus.hashCode());
        System.out.println(System.identityHashCode(bus));
        System.out.println(bus.equals(bus1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        WeatherReport report = new WeatherReport("Mumbai", 30.5, true);
        WeatherReport report1 = new WeatherReport("Delhi", 30.5, false);
        System.out.println(report);
        System.out.println(report.hashCode());
        System.out.println(System.identityHashCode(report));
        System.out.println(report.equals(report1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Guitar guitar = new Guitar("Acoustic", 6, false);
        Guitar guitar1 = new Guitar("Acoustic", 6, true);
        System.out.println(guitar);
        System.out.println(guitar.hashCode());
        System.out.println(System.identityHashCode(guitar));
        System.out.println(guitar.equals(guitar1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Movie movie = new Movie("Inception", 148, 'A');
        Movie movie1 = new Movie("Interstellar", 169, 'A');
        System.out.println(movie);
        System.out.println(movie.hashCode());
        System.out.println(System.identityHashCode(movie));
        System.out.println(movie.equals(movie1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        CricketPlayer player = new CricketPlayer("Virat Kohli", 12000, true);
        CricketPlayer player1 = new CricketPlayer("Virat Kohli", 12000, false);
        System.out.println(player);
        System.out.println(player.hashCode());
        System.out.println(System.identityHashCode(player));
        System.out.println(player.equals(player1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        BankAccount account = new BankAccount("Anjali Sharma", 9988776655L, 50000.0);
        BankAccount account1 = new BankAccount("Anjali Sharma", 1234567890L, 50000.0);
        System.out.println(account);
        System.out.println(account.hashCode());
        System.out.println(System.identityHashCode(account));
        System.out.println(account.equals(account1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Satellite satellite = new Satellite("INSAT-3D", 950.0, true);
        Satellite satellite1 = new Satellite("INSAT-3D", 1000.0, true);
        System.out.println(satellite);
        System.out.println(satellite.hashCode());
        System.out.println(System.identityHashCode(satellite));
        System.out.println(satellite.equals(satellite1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Recipe recipe = new Recipe("Pasta", 25, true);
        Recipe recipe1 = new Recipe("Pasta", 25, false);
        System.out.println(recipe);
        System.out.println(recipe.hashCode());
        System.out.println(System.identityHashCode(recipe));
        System.out.println(recipe.equals(recipe1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Hotel hotel = new Hotel("Taj", 5, true);
        Hotel hotel1 = new Hotel("Taj", 4, true);
        System.out.println(hotel);
        System.out.println(hotel.hashCode());
        System.out.println(System.identityHashCode(hotel));
        System.out.println(hotel.equals(hotel1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Crop crop = new Crop("Wheat", 1000, true);
        Crop crop1 = new Crop("Wheat", 1200, true);
        System.out.println(crop);
        System.out.println(crop.hashCode());
        System.out.println(System.identityHashCode(crop));
        System.out.println(crop.equals(crop1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Shirt shirt = new Shirt("Blue", 'M', 799.0);
        Shirt shirt1 = new Shirt("Blue", 'M', 899.0);
        System.out.println(shirt);
        System.out.println(shirt.hashCode());
        System.out.println(System.identityHashCode(shirt));
        System.out.println(shirt.equals(shirt1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Pet pet = new Pet("Luna", 4, true);
        Pet pet1 = new Pet("Luna", 2, true);
        System.out.println(pet);
        System.out.println(pet.hashCode());
        System.out.println(System.identityHashCode(pet));
        System.out.println(pet.equals(pet1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Student student = new Student("Ravi", 101, 89.5);
        Student student1 = new Student("Ravi", 101, 92.0);
        System.out.println(student);
        System.out.println(student.hashCode());
        System.out.println(System.identityHashCode(student));
        System.out.println(student.equals(student1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Game game = new Game("BattleZone", 20, true);
        Game game1 = new Game("BattleZone", 20, false);
        System.out.println(game);
        System.out.println(game.hashCode());
        System.out.println(System.identityHashCode(game));
        System.out.println(game.equals(game1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Bicycle cycle1 = new Bicycle("Hero", 21, true);
        Bicycle cycle3 = new Bicycle("Hero", 21, false);
        System.out.println(cycle1);
        System.out.println(cycle1.hashCode());
        System.out.println(System.identityHashCode(cycle1));
        System.out.println(cycle1.equals(cycle3));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Doctor doc1 = new Doctor("Dr. Arjun", 10, true);
        Doctor doc2 = new Doctor("Dr. Arjun", 10, false);
        System.out.println(doc1);
        System.out.println(doc1.hashCode());
        System.out.println(System.identityHashCode(doc1));
        System.out.println(doc1.equals(doc2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Remote remote1 = new Remote("Sony", 20, true);
        Remote remote2 = new Remote("Sony", 20, false);
        System.out.println(remote1);
        System.out.println(remote1.hashCode());
        System.out.println(System.identityHashCode(remote1));
        System.out.println(remote1.equals(remote2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Player playe = new Player("Cricket", 80, true);
        Player playe1 = new Player("Badminton", 45, true);
        System.out.println(playe);
        System.out.println(playe.hashCode());
        System.out.println(System.identityHashCode(playe));
        System.out.println(playe.equals((playe1)));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Instrument inst = new Instrument("Guitar", 15000.0, true);
        Instrument inst1 = new Instrument("Piano", 25000.0, false);
        System.out.println(inst);
        System.out.println(inst.hashCode());
        System.out.println(System.identityHashCode(inst));
        System.out.println(inst.equals(inst1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Theatre theatre = new Theatre("INOX", (byte)5, (short)300);
        Theatre theatre1 = new Theatre("PVR", (byte)6, (short)320);
        System.out.println(theatre);
        System.out.println(theatre.hashCode());
        System.out.println(System.identityHashCode(theatre));
        System.out.println(theatre.equals(theatre1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Lock lock = new Lock("Digital", (byte)4, 'A');
        Lock lock1 = new Lock("Analog", (byte)3, 'B');
        System.out.println(lock);
        System.out.println(lock.hashCode());
        System.out.println(System.identityHashCode(lock));
        System.out.println(lock.equals(lock1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Currency currency = new Currency("India", 1000L, '₹');
        Currency currency1 = new Currency("USA", 1000L, '$');
        System.out.println(currency);
        System.out.println(currency.hashCode());
        System.out.println(System.identityHashCode(currency));
        System.out.println(currency.equals(currency1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Exam exam = new Exam("Maths", 100, 'A');
        Exam exam1 = new Exam("Science", 100, 'A');
        System.out.println(exam);
        System.out.println(exam.hashCode());
        System.out.println(System.identityHashCode(exam));
        System.out.println(exam.equals(exam1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Auto auto = new Auto("Ramesh", 13.5f, (short)101);
        Auto auto1 = new Auto("Suresh", 13.5f, (short)101);
        System.out.println(auto);
        System.out.println(auto.hashCode());
        System.out.println(System.identityHashCode(auto));
        System.out.println(auto.equals(auto1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Animal animal = new Animal("Tiger", 220.5, true);
        Animal animal1 = new Animal("Lion", 220.5, true);
        System.out.println(animal);
        System.out.println(animal.hashCode());
        System.out.println(System.identityHashCode(animal));
        System.out.println(animal.equals(animal1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Smartwatch w = new Smartwatch("Noise", 10, true);
        Smartwatch w1 = new Smartwatch("FireBoltt", 8, false);
        System.out.println(w);
        System.out.println(w.hashCode());
        System.out.println(System.identityHashCode(w));
        System.out.println(watch.equals(w1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Dessert dessert = new Dessert("Ice Cream", 250, true);
        Dessert dessert1 = new Dessert("Brownie", 300, false);
        System.out.println(dessert);
        System.out.println(dessert.hashCode());
        System.out.println(System.identityHashCode(dessert));
        System.out.println(dessert.equals(dessert1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Bulb bulb = new Bulb("CFL", 15, false);
        Bulb bulb1 = new Bulb("LED", 9, true);
        System.out.println(bulb);
        System.out.println(bulb.hashCode());
        System.out.println(System.identityHashCode(bulb));
        System.out.println(bulb.equals(bulb1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        BankAccount accoun = new BankAccount("Ravi", 9876543210L, 25000.75);
        BankAccount accoun1 = new BankAccount("Ravi", 9876543210L, 24000.50);
        System.out.println(accoun);
        System.out.println(accoun.hashCode());
        System.out.println(System.identityHashCode(accoun));
        System.out.println(accoun.equals(accoun1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Tent tent = new Tent("Blue", 4, true);
        Tent tent1 = new Tent("Green", 4, true);
        System.out.println(tent);
        System.out.println(tent.hashCode());
        System.out.println(System.identityHashCode(tent));
        System.out.println(tent.equals(tent1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Ride ride = new Ride("Roller Coaster", 2.5, true);
        Ride ride1 = new Ride("Ferris Wheel", 2.5, true);
        System.out.println(ride);
        System.out.println(ride.hashCode());
        System.out.println(System.identityHashCode(ride));
        System.out.println(ride.equals(ride1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Evidence evidence = new Evidence("Fingerprint", 0.02, true);
        Evidence evidence1 = new Evidence("DNA", 0.02, true);
        System.out.println(evidence);
        System.out.println(evidence.hashCode());
        System.out.println(System.identityHashCode(evidence));
        System.out.println(evidence.equals(evidence1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        DivingSuit suit = new DivingSuit("Neoprene", 100, true);
        DivingSuit suit1 = new DivingSuit("Rubber", 100, true);
        System.out.println(suit);
        System.out.println(suit.hashCode());
        System.out.println(System.identityHashCode(suit));
        System.out.println(suit.equals(suit1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        SpyGadget gadget = new SpyGadget("PenCam", 50, true);
        SpyGadget gadget1 = new SpyGadget("WatchMic", 50, true);
        System.out.println(gadget);
        System.out.println(gadget.hashCode());
        System.out.println(System.identityHashCode(gadget));
        System.out.println(gadget.equals(gadget1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Mixer mixer = new Mixer("Yamaha", 12, true);
        Mixer mixer1 = new Mixer("Behringer", 8, false);
        System.out.println(mixer);
        System.out.println(mixer.hashCode());
        System.out.println(System.identityHashCode(mixer));
        System.out.println(mixer.equals(mixer1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        SoilSensor sensor = new SoilSensor("AgriSense-X", 12.5, true);
        SoilSensor sensor1 = new SoilSensor("FarmTrack", 10.0, false);
        System.out.println(sensor);
        System.out.println(sensor.hashCode());
        System.out.println(System.identityHashCode(sensor));
        System.out.println(sensor.equals(sensor1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        VendingMachine vm = new VendingMachine("Station", 120, true);
        VendingMachine vm1 = new VendingMachine("Mall", 80, false);
        System.out.println(vm);
        System.out.println(vm.hashCode());
        System.out.println(System.identityHashCode(vm));
        System.out.println(vm.equals(vm1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        SkiBoot boot = new SkiBoot("Nordica", 42, true);
        SkiBoot boot1 = new SkiBoot("Atomic", 41, false);
        System.out.println(boot);
        System.out.println(boot.hashCode());
        System.out.println(System.identityHashCode(boot));
        System.out.println(boot.equals(boot1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        PencilBox box = new PencilBox("Red", 3, true);
        PencilBox box1 = new PencilBox("Blue", 2, false);
        System.out.println(box);
        System.out.println(box.hashCode());
        System.out.println(System.identityHashCode(box));
        System.out.println(box.equals(box1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        WaterBottle bottlee = new WaterBottle("Milton", 1000, true);
        WaterBottle bottlee1 = new WaterBottle("Cello", 750, false);
        System.out.println(bottlee);
        System.out.println(bottlee.hashCode());
        System.out.println(System.identityHashCode(bottlee));
        System.out.println(bottlee.equals(bottlee1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        SchoolBench bench = new SchoolBench("Wood", 120, true);
        SchoolBench bench1 = new SchoolBench("Plastic", 120, false);
        System.out.println(bench);
        System.out.println(bench.hashCode());
        System.out.println(System.identityHashCode(bench));
        System.out.println(bench.equals(bench1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        CeilingFan fann = new CeilingFan("White", 5, true);
        CeilingFan fann1 = new CeilingFan("Black", 5, true);
        System.out.println(fann);
        System.out.println(fann.hashCode());
        System.out.println(System.identityHashCode(fann));
        System.out.println(fann.equals(fann1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        TvRemote remotee = new TvRemote("Samsung", 20, true);
        TvRemote remotee1 = new TvRemote("LG", 20, true);
        System.out.println(remotee);
        System.out.println(remotee.hashCode());
        System.out.println(System.identityHashCode(remotee));
        System.out.println(remotee.equals(remotee1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Toothbrush brush = new Toothbrush("OralB", 1200, true);
        Toothbrush brush1 = new Toothbrush("Colgate", 1200, true);
        System.out.println(brush);
        System.out.println(brush.hashCode());
        System.out.println(System.identityHashCode(brush));
        System.out.println(brush.equals(brush1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Slipper slipper = new Slipper("9", 300, true);
        Slipper slipper1 = new Slipper("8", 300, true);
        System.out.println(slipper);
        System.out.println(slipper.hashCode());
        System.out.println(System.identityHashCode(slipper));
        System.out.println(slipper.equals(slipper1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Comb comb = new Comb("Plastic", 25, false);
        Comb comb1 = new Comb("Plastic", 20, false);
        System.out.println(comb);
        System.out.println(comb.hashCode());
        System.out.println(System.identityHashCode(comb));
        System.out.println(comb.equals(comb1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");



        Mirror mirror = new Mirror("Oval", 120, true);
        Mirror mirror1 = new Mirror("Oval", 120, false);
        System.out.println(mirror);
        System.out.println(mirror.hashCode());
        System.out.println(System.identityHashCode(mirror));
        System.out.println(mirror.equals(mirror1));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Curtain c1 = new Curtain("Cotton", 120, true);
        Curtain c2 = new Curtain("Cotton", 120, true);
        System.out.println(c1);
        System.out.println(c1.hashCode());
        System.out.println(System.identityHashCode(c1));
        System.out.println(c1.equals(c2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Sharpener sh1 = new Sharpener("Faber-Castell", 2, true);
        Sharpener sh2 = new Sharpener("Faber-Castell", 2, true);
        System.out.println(sh1);
        System.out.println(sh1.hashCode());
        System.out.println(System.identityHashCode(sh1));
        System.out.println(sh1.equals(sh2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Stapler st1 = new Stapler("Kangaro HP-45", 100, true);
        Stapler st2 = new Stapler("Kangaro HP-45", 100, true);
        System.out.println(st1);
        System.out.println(st1.hashCode());
        System.out.println(System.identityHashCode(st1));
        System.out.println(st1.equals(st2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        LunchBox l1 = new LunchBox("Rectangle", 3, true);
        LunchBox l2 = new LunchBox("Rectangle", 3, true);
        System.out.println(l1);
        System.out.println(l1.hashCode());
        System.out.println(System.identityHashCode(l1));
        System.out.println(l1.equals(l2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Charger ch1 = new Charger("Type-C", 25, true);
        Charger ch2 = new Charger("Type-C", 25, true);
        System.out.println(ch1);
        System.out.println(ch1.hashCode());
        System.out.println(System.identityHashCode(ch1));
        System.out.println(ch1.equals(c2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Keychain k1 = new Keychain("Leather", 3, true);
        Keychain k2 = new Keychain("Leather", 3, true);
        System.out.println(k1);
        System.out.println(k1.hashCode());
        System.out.println(System.identityHashCode(k1));
        System.out.println(k1.equals(k2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        USBDrive u1 = new USBDrive("SanDisk", 64, true);
        USBDrive u2 = new USBDrive("SanDisk", 64, true);
        System.out.println(u1);
        System.out.println(u1.hashCode());
        System.out.println(System.identityHashCode(u1));
        System.out.println(u1.equals(u2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Joystick j1 = new Joystick("XtremePad", 12, true);
        Joystick j2 = new Joystick("XtremePad", 12, true);
        System.out.println(j1);
        System.out.println(j1.hashCode());
        System.out.println(System.identityHashCode(j1));
        System.out.println(j1.equals(j2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Torchlight to1 = new Torchlight("Philips", 10, true);
        Torchlight to2 = new Torchlight("Philips", 10, true);
        System.out.println(to1);
        System.out.println(to1.hashCode());
        System.out.println(System.identityHashCode(to1));
        System.out.println(to1.equals(to2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");


        Headphones headphones1 = new Headphones("Boat", 1499, true);
        Headphones headphones2 = new Headphones("Boat", 1499, true);
        System.out.println(headphones1);
        System.out.println(headphones1.hashCode());
        System.out.println(System.identityHashCode(headphones1));
        System.out.println(headphones1.equals(headphones2));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");



        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        Tshirt tshirt1=new Tshirt();
        Tshirt tshirt2=new Tshirt();
        Tshirt tshirt3=new Tshirt();
        tshirt1.setBrand("xworkz");
        tshirt2.setBrand("myntra");
        tshirt3.setBrand("xworkz");
        tshirt1.setColor("pink");
        tshirt2.setColor("blue");
        tshirt3.setColor("pink");
        tshirt1.setSize(32);
        tshirt2.setSize(34);
        tshirt3.setSize(32);

        boolean diff=tshirt1.equals(tshirt2);
        System.out.println(diff);
        boolean same= tshirt1.equals(tshirt3);
        System.out.println(same);



    }

}
