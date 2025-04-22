package com.xworkz.interfaceconnector.runner;

import com.xworkz.interfaceconnector.external.*;
import com.xworkz.interfaceconnector.internal.*;


public class MainRunner {
    public static void main(String[] args) {
        Connector connector = new ConnectorImp();
        ConnectorUser connectorUser = new ConnectorUser(connector);
        connectorUser.execute();

        Light light = new Bulb();
        Room room = new Room(light);
        room.illuminate();

        Fan fan = new CeilingFan();
        Bedroom bedroom = new Bedroom(fan);
        bedroom.cool();

        Door door = new WoodenDoor();
        House house = new House(door);
        house.enter();

        Phone phone = new Mobile();
        Person person = new Person(phone);
        person.communicate();

        Car car = new Sedan();
        Driver driver = new Driver(car);
        driver.travel();

        TV tv = new SmartTV();
        LivingRoom livingRoom = new LivingRoom(tv);
        livingRoom.entertain();

        Pen pen = new BallPen();
        Student student = new Student(pen);
        student.study();

        Lock lock = new Padlock();
        Gate gate = new Gate(lock);
        gate.protect();

        Speaker speaker = new BluetoothSpeaker();
        Party party = new Party(speaker);
        party.playMusic();

        Chair chair = new WoodenChair();
        Office office = new Office(chair);
        office.work();

        Pastry pastry = new Croissant();
        Bakery bakery = new Bakery(pastry);
        bakery.prepare();

        Lipstick lipstick = new MatteLipstick();
        MakeupArtist makeupArtist = new MakeupArtist(lipstick);
        makeupArtist.beautify();

        Chocolate chocolate = new DarkChocolate();
        Chef chef = new Chef(chocolate);
        chef.cook();

        Chocolate.Pizza pizza = new Margherita();
        Pizzeria pizzeria = new Pizzeria(pizza);
        pizzeria.serve();

        Mascara mascara = new VolumizingMascara();
        Stylist stylist = new Stylist(mascara);
        stylist.enhance();

        IceCream iceCream = new VanillaIceCream();
        DessertShop dessertShop = new DessertShop(iceCream);
        dessertShop.sell();

        Foundation foundation = new LiquidFoundation();
        Beautician beautician = new Beautician(foundation);
        beautician.makeup();

        Candy candy = new Lollipop();
        SweetShop sweetShop = new SweetShop(candy);
        sweetShop.pack();

        Eyeliner eyeliner = new GelEyeliner();
        Salon salon = new Salon(eyeliner);
        salon.style();

        Cake cake = new ChocolateCake();
        Patisserie patisserie = new Patisserie(cake);
        patisserie.display();

        Donut donut = new GlazedDonut();
        DonutShop donutShop = new DonutShop(donut);
        donutShop.sell();

        Highlighter highlighter = new CreamHighlighter();
        MakeupCounter makeupCounter = new MakeupCounter(highlighter);
        makeupCounter.apply();

        Praline praline = new HazelnutPraline();
        CandyStore candyStore = new CandyStore(praline);
        candyStore.packageCandy();

        Sushi sushi = new CaliforniaRoll();
        SushiBar sushiBar = new SushiBar(sushi);
        sushiBar.serve();

        Bronzer bronzer = new MatteBronzer();
        BeautyStudio beautyStudio = new BeautyStudio(bronzer);
        beautyStudio.sculpt();

        Muffin muffin = new BlueberryMuffin();
        CoffeeShop coffeeShop = new CoffeeShop(muffin);
        coffeeShop.offer();

        Toffee toffee = new CaramelToffee();
        SweetVendor sweetVendor = new SweetVendor(toffee);
        sweetVendor.distribute();

        NailPolish nailPolish = new GlossyNailPolish();
        NailSalon nailSalon = new NailSalon(nailPolish);
        nailSalon.polish();

        Taco taco = new BeefTaco();
        FoodTruck foodTruck = new FoodTruck(taco);
        foodTruck.serve();

        Ganache ganache = new DarkGanache();
        PastryChef pastryChef = new PastryChef(ganache);
        pastryChef.decorate();
        Cookie cookie = new ChocolateChip();
        CookieJar cookieJar = new CookieJar(cookie);
        cookieJar.store();

        LipGloss lipGloss = new SparkleLipGloss();
        BeautyKit beautyKit = new BeautyKit(lipGloss);
        beautyKit.enhance();

        Caramel caramel = new SaltedCaramel();
        DessertMaker dessertMaker = new DessertMaker(caramel);
        dessertMaker.top();

        Burger burger = new CheeseBurger();
        Diner diner = new Diner(burger);
        diner.serve();

        Primer primer = new HydratingPrimer();
        MakeupVan makeupVan = new MakeupVan(primer);
        makeupVan.base();

        Waffle waffle = new BelgianWaffle();
        BreakfastNook breakfastNook = new BreakfastNook(waffle);
        breakfastNook.plate();

        CocoaNib cocoaNib = new RoastedCocoaNib();
        ChocolateShop chocolateShop = new ChocolateShop(cocoaNib);
        chocolateShop.process();

        BrowGel browGel = new ClearBrowGel();
        GroomingStudio groomingStudio = new GroomingStudio(browGel);
        groomingStudio.style();

        Pancake pancake = new ButtermilkPancake();
        BrunchCafe brunchCafe = new BrunchCafe(pancake);
        brunchCafe.cook();

        Marshmallow marshmallow = new VanillaMarshmallow();
        Campfire campfire = new Campfire(marshmallow);
        campfire.treat();

        Smoothie smoothie = new BerrySmoothie();
        JuiceBar juiceBar = new JuiceBar(smoothie);
        juiceBar.serve();

        LipBalm lipBalm = new TintedLipBalm();
        CosmeticBag cosmeticBag = new CosmeticBag(lipBalm);
        cosmeticBag.moisturize();

        Bonbon bonbon = new ChocolateBonbon();
        Confectioner confectioner = new Confectioner(bonbon);
        confectioner.craft();

        Wrap wrap = new ChickenWrap();
        Deli deli = new Deli(wrap);
        deli.prepare();

        SettingSpray settingSpray = new DewySettingSpray();
        MakeupBooth makeupBooth = new MakeupBooth(settingSpray);
        makeupBooth.finish();

        Cupcake cupcake = new RedVelvetCupcake();
        CakeShop cakeShop = new CakeShop(cupcake);
        cakeShop.decorate();

        CocoaButter cocoaButter = new PureCocoaButter();
        ChocoMaker chocoMaker = new ChocoMaker(cocoaButter);
        chocoMaker.mix();

        EyelashCurler eyelashCurler = new MetalEyelashCurler();
        BeautyBar beautyBar = new BeautyBar(eyelashCurler);
        beautyBar.lift();

        Bagel bagel = new SesameBagel();
        BagelShop bagelShop = new BagelShop(bagel);
        bagelShop.serve();
    }

}