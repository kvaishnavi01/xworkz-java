package com.xworkz.interfaces;

public class MainTester {
    public static void main(String[] args) {

        Chef chef = new ItalianChef();
        chef.cook();
        chef.planMenu();
        chef.manageKitchen();
        chef.getDescription();

        System.out.println("######################################################");

        Driver driver = new CarDriver();
        driver.drive();
        driver.checkFuel();
        driver.collectFare();
        driver.getDescription();

        System.out.println("######################################################");

        Pilot pilot = new CommercialPilot();
        pilot.flyAircraft();
        pilot.checkWeather();
        pilot.passengerAnnouncement();
        pilot.getDescription();

        System.out.println("######################################################");

        Teacher teacher = new HighSchoolTeacher();
        teacher.teachSubject();
        teacher.assignHomework();
        teacher.evaluateExam();
        teacher.getDescription();

        System.out.println("######################################################");

        Plumber plumber = new HomePlumber();
        plumber.fixLeak();
        plumber.installPipes();
        plumber.inspectDrains();
        plumber.getDescription();

        System.out.println("######################################################");


        Architect architect = new ResidentialArchitect();
        architect.designBuilding();
        architect.createBlueprint();
        architect.inspectConstruction();
        architect.getDescription();

        System.out.println("######################################################");

        Florist florist = new WeddingFlorist();
        florist.arrangeFlowers();
        florist.takeOrders();
        florist.deliverBouquets();
        florist.getDescription();

        System.out.println("######################################################");

        Musician musician = new JazzMusician();
        musician.playInstrument();
        musician.composeSong();
        musician.attendRehearsal();
        musician.getDescription();

        System.out.println("######################################################");

        NewsReporter reporter = new FieldReporter();
        reporter.gatherNews();
        reporter.reportLive();
        reporter.interviewPeople();
        reporter.getDescription();

        System.out.println("######################################################");

        FashionDesigner designer = new LuxuryFashionDesigner();
        designer.sketchDesigns();
        designer.chooseFabric();
        designer.attendFashionShow();
        designer.getDescription();


        System.out.println("######################################################");

        RealEstateAgent agent = new ResidentialAgent();
        agent.showProperties();
        agent.negotiateDeals();
        agent.handlePaperwork();
        agent.getDescription();

        System.out.println("######################################################");

        Bartender bartender = new ClubBartender();
        bartender.mixDrinks();
        bartender.takeOrders();
        bartender.maintainBar();
        bartender.getDescription();

        System.out.println("######################################################");

        SecurityGuard security = new MallSecurityGuard();
        security.patrolArea();
        security.monitorCCTV();
        security.checkID();
        security.getDescription();

        System.out.println("######################################################");

        BankManager bankManager = new BranchBankManager();
        bankManager.approveLoan();
        bankManager.manageAccounts();
        bankManager.meetCustomers();
        bankManager.getDescription();

        System.out.println("######################################################");

        ContentWriter writer = new SEOContentWriter();
        writer.writeArticle();
        writer.proofreadContent();
        writer.researchTopic();
        writer.getDescription();

        System.out.println("######################################################");

        TourGuide tourGuide = new MountainTourGuide();
        tourGuide.giveTour();
        tourGuide.provideInformation();
        tourGuide.ensureSafety();
        tourGuide.getDescription();

        System.out.println("######################################################");

        ResearchScientist scientist = new MarineBiologist();
        scientist.conductResearch();
        scientist.publishPapers();
        scientist.presentFindings();
        scientist.getDescription();

        System.out.println("######################################################");

        Firefighter firefighter = new WildfireFighter();
        firefighter.extinguishFire();
        firefighter.performRescue();
        firefighter.inspectFireHazards();
        firefighter.getDescription();

        System.out.println("######################################################");

        Veterinarian vet = new AnimalSurgeon();
        vet.treatAnimals();
        vet.performSurgery();
        vet.prescribeMedication();
        vet.getDescription();

        System.out.println("######################################################");

        Gardener gardener = new UrbanGardener();
        gardener.plantTrees();
        gardener.maintainLawns();
        gardener.landscapeGardens();
        gardener.getDescription();

        System.out.println("######################################################");

        Artist artist = new Sculptor();
        artist.createArtwork();
        artist.showcaseArt();
        artist.collaborateOnProjects();
        artist.getDescription();
        System.out.println("######################################################");

        Librarian librarian = new DigitalLibrarian();
        librarian.catalogBooks();
        librarian.assistPatrons();
        librarian.organizeEvents();
        librarian.getDescription();

        System.out.println("######################################################");

        PersonalTrainer trainer = new FitnessTrainer();
        trainer.createWorkoutPlan();
        trainer.demonstrateExercises();
        trainer.monitorProgress();
        trainer.getDescription();

        System.out.println("######################################################");

        SpaceExplorer explorer = new MarsMissionSpecialist();
        explorer.planMission();
        explorer.analyzeData();
        explorer.performExtravehicularActivity();
        explorer.getDescription();

        System.out.println("######################################################");

        AquaticResearcher coralEcosystemSpecialist = new CoralEcosystemSpecialist();
        coralEcosystemSpecialist.studyMarineLife();
        coralEcosystemSpecialist.monitorEcosystemHealth();
        coralEcosystemSpecialist.leadResearchExpedition();
        coralEcosystemSpecialist.getDescription();

        System.out.println("######################################################");

        Pencil pencil = new HBPencil();
        pencil.write();
        pencil.erase();
        pencil.sharpen();
        pencil.getDescription();

        System.out.println("######################################################");

        Notebook notebook = new SpiralNotebook();
        notebook.open();
        notebook.writePage();
        notebook.close();
        notebook.getDescription();

        System.out.println("######################################################");

        Mug mug = new CoffeeMug();
        mug.fill();
        mug.drink();
        mug.wash();
        mug.getDescription();

        System.out.println("######################################################");

        Phone phone = new SmartPhone();
        phone.makeCall();
        phone.receiveCall();
        phone.charge();
        phone.getDescription();

        System.out.println("######################################################");

        Spoon spoon = new SteelSpoon();
        spoon.scoop();
        spoon.stir();
        spoon.clean();
        spoon.getDescription();

        System.out.println("######################################################");

        Bottle bottle = new PlasticBottle();
        bottle.fillWater();
        bottle.drinkWater();
        bottle.recycle();
        bottle.getDescription();

        System.out.println("######################################################");

        Bag bag = new Backpack();
        bag.carry();
        bag.zip();
        bag.unpack();
        bag.getDescription();

        System.out.println("######################################################");

        Keyboard keyboard = new MechanicalKeyboard();
        keyboard.type();
        keyboard.backlight();
        keyboard.connect();
        keyboard.getDescription();

        System.out.println("######################################################");

        Chair chair = new OfficeChair();
        chair.sit();
        chair.recline();
        chair.roll();
        chair.getDescription();

        System.out.println("######################################################");

        Remote remote = new TVRemote();
        remote.turnOn();
        remote.turnOff();
        remote.changeChannel();
        remote.getDescription();

        System.out.println("######################################################");

        Blush blush = new PowderBlush();
        blush.applyColor();
        blush.blend();
        blush.highlightCheeks();
        blush.getDescription();

        System.out.println("######################################################");

        Lipstick lipstick = new MatteLipstick();
        lipstick.twistOpen();
        lipstick.applyOnLips();
        lipstick.sealColor();
        lipstick.getDescription();

        System.out.println("######################################################");

        Primer primer = new GlowPrimer();
        primer.prepSkin();
        primer.minimizePores();
        primer.smoothTexture();
        primer.getDescription();

        System.out.println("######################################################");

        Eyeliner eyeliner = new LiquidEyeliner();
        eyeliner.drawLine();
        eyeliner.defineEyes();
        eyeliner.dryQuickly();
        eyeliner.getDescription();

        System.out.println("######################################################");

        Foundation foundation = new LiquidFoundation();
        foundation.matchSkinTone();
        foundation.provideCoverage();
        foundation.stayLong();
        foundation.getDescription();

        System.out.println("######################################################");

        Concealer concealer = new CreamConcealer();
        concealer.hideSpots();
        concealer.blendWithSkin();
        concealer.brightenUnderEyes();
        concealer.getDescription();

        System.out.println("######################################################");

        Mascara mascara = new VolumeMascara();
        mascara.liftLashes();
        mascara.addVolume();
        mascara.waterproofEffect();
        mascara.getDescription();

        System.out.println("######################################################");

        Highlighter highlighter = new ShimmerHighlighter();
        highlighter.addGlow();
        highlighter.applyAboveCheeks();
        highlighter.reflectLight();
        highlighter.getDescription();

        System.out.println("######################################################");

        Compact compact = new PressedCompact();
        compact.setMakeup();
        compact.reduceShine();
        compact.carryEasily();
        compact.getDescription();

        System.out.println("######################################################");

        BrowPencil browPencil = new DefinedBrowPencil();
        browPencil.shapeBrows();
        browPencil.fillGaps();
        browPencil.createDefinition();
        browPencil.getDescription();

        System.out.println("######################################################");

        Panipuri panipuri = new StreetPanipuri();
        panipuri.prepareWater();
        panipuri.fillPuri();
        panipuri.serve();
        panipuri.getDescription();

        System.out.println("######################################################");

        Dahipuri dahipuri = new SpicyDahipuri();
        dahipuri.addCurd();
        dahipuri.sprinkleMasala();
        dahipuri.plateUp();
        dahipuri.getDescription();

        System.out.println("######################################################");

        Sevpuri sevpuri = new CrunchySevpuri();
        sevpuri.addToppings();
        sevpuri.crushPuri();
        sevpuri.serveWithChutney();
        sevpuri.getDescription();

        System.out.println("######################################################");

        PavBhaji pavBhaji = new MumbaikarPavBhaji();
        pavBhaji.cookBhaji();
        pavBhaji.toastPav();
        pavBhaji.garnish();
        pavBhaji.getDescription();

        System.out.println("######################################################");

        VadaPav vadaPav = new SpicyVadaPav();
        vadaPav.fryVada();
        vadaPav.applyChutney();
        vadaPav.wrapInPaper();
        vadaPav.getDescription();

        System.out.println("######################################################");

        Misal misal = new KolhapuriMisal();
        misal.makeRassa();
        misal.fryUsal();
        misal.topWithFarsan();
        misal.getDescription();

        System.out.println("######################################################");

        Bhel bhel = new ChatpatiBhel();
        bhel.mixPuffedRice();
        bhel.addVeggies();
        bhel.squeezeLemon();
        bhel.getDescription();

        System.out.println("######################################################");

        RagdaPattice ragda = new MumbaiRagdaPattice();
        ragda.prepareRagda();
        ragda.shallowFryPattice();
        ragda.serveWithGarnish();
        ragda.getDescription();

        System.out.println("######################################################");

        Frankie frankie = new VegFrankie();
        frankie.prepareFilling();
        frankie.rollRoti();
        frankie.packWrap();
        frankie.getDescription();

        System.out.println("######################################################");

        KandaBhaji bhaji = new HotKandaBhaji();
        bhaji.sliceOnions();
        bhaji.coatWithBesan();
        bhaji.deepFry();
        bhaji.getDescription();

        System.out.println("######################################################");

        Shampoo shampoo = new HerbalShampoo();
        shampoo.cleanseHair();
        shampoo.addFragrance();
        shampoo.strengthenRoots();
        shampoo.getDescription();

        System.out.println("######################################################");

        Conditioner conditioner = new SilkyConditioner();
        conditioner.softenHair();
        conditioner.reduceFrizz();
        conditioner.addShine();
        conditioner.getDescription();


        System.out.println("######################################################");

        FaceWash faceWash = new AloeFaceWash();
        faceWash.removeDirt();
        faceWash.refreshSkin();
        faceWash.controlOil();
        faceWash.getDescription();

        System.out.println("######################################################");

        FaceScrub faceScrub = new WalnutFaceScrub();
        faceScrub.exfoliate();
        faceScrub.unclogPores();
        faceScrub.brightenSkin();
        faceScrub.getDescription();

        System.out.println("######################################################");

        BodyLotion bodyLotion = new CocoaBodyLotion();
        bodyLotion.hydrateSkin();
        bodyLotion.smoothenTexture();
        bodyLotion.repairDryness();
        bodyLotion.getDescription();

        System.out.println("######################################################");

        HandWash handWash = new AntibacterialHandWash();
        handWash.killGerms();
        handWash.moisturizeHands();
        handWash.leaveFragrance();
        handWash.getDescription();

        System.out.println("######################################################");

        Moisturizer moisturizer = new DailyMoisturizer();
        moisturizer.lockMoisture();
        moisturizer.healSkin();
        moisturizer.preventDryness();
        moisturizer.getDescription();

        System.out.println("######################################################");

        HairGel hairGel = new StrongHoldGel();
        hairGel.styleHair();
        hairGel.provideHold();
        hairGel.addTexture();
        hairGel.getDescription();

        System.out.println("######################################################");

        BeardOil beardOil = new ArganBeardOil();
        beardOil.nourishBeard();
        beardOil.softenBeard();
        beardOil.promoteGrowth();
        beardOil.getDescription();

        System.out.println("######################################################");

        Toner toner = new RoseToner();
        toner.tightenPores();
        toner.balancePH();
        toner.refreshSkin();
        toner.getDescription();

        System.out.println("######################################################");

        Charger charger = new MobileCharger();
        charger.plugIn();
        charger.startCharging();
        charger.getDescription();
        charger.stopCharging();

        System.out.println("######################################################");

        Earphone earphone = new WiredEarphone();
        earphone.playAudio();
        earphone.adjustVolume();
        earphone.disconnect();
        earphone.getDescription();

        System.out.println("######################################################");

        Earpods earpods = new WirelessEarpods();
        earpods.connectBluetooth();
        earpods.playMusic();
        earpods.chargeCase();
        earpods.getDescription();

        System.out.println("######################################################");

        PowerBank powerBank = new MiniPowerBank();
        powerBank.chargeDevice();
        powerBank.checkBattery();
        powerBank.turnOff();
        powerBank.getDescription();

        System.out.println("######################################################");

        BluetoothSpeaker speaker = new MiniSpeaker();
        speaker.connectPhone();
        speaker.playSound();
        speaker.disconnect();
        speaker.getDescription();

        System.out.println("######################################################");

        SmartWatch watch = new FitnessWatch();
        watch.trackSteps();
        watch.showNotifications();
        watch.measureHeartRate();
        watch.getDescription();

        System.out.println("######################################################");

        Laptop laptop = new GamingLaptop();
        laptop.bootUp();
        laptop.runProgram();
        laptop.shutDown();
        laptop.getDescription();

        System.out.println("######################################################");

        Mouse mouse = new WirelessMouse();
        mouse.click();
        mouse.scroll();
        mouse.connectToPC();
        mouse.getDescription();


        System.out.println("######################################################");

        Monitor monitor = new LEDMonitor();
        monitor.displayOutput();
        monitor.changeBrightness();
        monitor.powerOff();
        monitor.getDescription();

        System.out.println("######################################################");

        ChefDriver chefDriver = new ChefDriver();
        Chef cheff = chefDriver;
        Driver driverr = chefDriver;

        cheff.cook();
        cheff.planMenu();
        cheff.manageKitchen();

        driverr.drive();
        driverr.checkFuel();
        driverr.collectFare();

        System.out.println("######################################################");

        TeacherPlumber teacherPlumber = new TeacherPlumber();
        Teacher teacherr = teacherPlumber;
        Plumber plumberr = teacherPlumber;

        teacherr.teachSubject();
        teacherr.assignHomework();
        teacherr.evaluateExam();

        plumberr.fixLeak();
        plumberr.installPipes();
        plumberr.inspectDrains();

        System.out.println("######################################################");

        PilotTeacher pilotTeacher = new PilotTeacher();
        Pilot pilott = pilotTeacher;
        Teacher teacher2 = pilotTeacher;

        pilott.flyAircraft();
        pilott.checkWeather();
        pilott.passengerAnnouncement();

        teacher2.teachSubject();
        teacher2.assignHomework();
        teacher2.evaluateExam();

        System.out.println("######################################################");

        ChefPlumber chefPlumber = new ChefPlumber();
        Chef chef2 = chefPlumber;
        Plumber plumber2 = chefPlumber;

        chef2.cook();
        chef2.planMenu();
        chef2.manageKitchen();

        plumber2.fixLeak();
        plumber2.installPipes();
        plumber2.inspectDrains();

        System.out.println("######################################################");

        DriverPilot driverPilot = new DriverPilot();
        Driver driver2 = driverPilot;
        Pilot pilot2 = driverPilot;

        driver2.drive();
        driver2.checkFuel();
        driver2.collectFare();

        pilot2.flyAircraft();
        pilot2.checkWeather();
        pilot2.passengerAnnouncement();

        System.out.println("######################################################");

        ChefTeacher A = new ChefTeacher();
        Chef B = A;
        Teacher C = A;
        B.cook();
        B.planMenu();
        B.manageKitchen();
        C.teachSubject();
        C.assignHomework();
        C.evaluateExam();

        System.out.println("######################################################");

        PilotDriver D = new PilotDriver();
        Pilot E = D;
        Driver F = D;
        E.flyAircraft();
        E.checkWeather();
        E.passengerAnnouncement();
        F.drive();
        F.checkFuel();
        F.collectFare();

        System.out.println("######################################################");

        ChefPilot K = new ChefPilot();
        Chef L = K;
        Pilot M = K;
        L.cook();
        L.planMenu();
        L.manageKitchen();
        M.flyAircraft();
        M.checkWeather();
        M.passengerAnnouncement();

        System.out.println("######################################################");

        DriverTeacher N = new DriverTeacher();
        Driver O = N;
        Teacher P = N;
        O.drive();
        O.checkFuel();
        O.collectFare();
        P.teachSubject();
        P.assignHomework();
        P.evaluateExam();

        System.out.println("######################################################");

        DriverChef a = new DriverChef();
        Driver b = a;
        Chef c = a;
        b.drive();
        b.checkFuel();
        b.collectFare();
        c.cook();
        c.planMenu();
        c.manageKitchen();

        System.out.println("######################################################");

        BartenderPlumber d = new BartenderPlumber();
        Bartender e = d;
        Plumber f = d;
        e.mixDrinks();
        e.takeOrders();
        e.maintainBar();
        f.fixLeak();
        f.installPipes();
        f.inspectDrains();

        System.out.println("######################################################");

        FashionTeacher G = new FashionTeacher();
        FashionDesigner H = G;
        Teacher I = G;
        H.sketchDesigns();
        H.chooseFabric();
        H.attendFashionShow();
        I.teachSubject();
        I.assignHomework();
        I.evaluateExam();

        System.out.println("######################################################");

        SecurityChef J = new SecurityChef();
        SecurityGuard k = J;
        Chef l = J;
        k.patrolArea();
        k.monitorCCTV();
        k.checkID();
        l.cook();
        l.planMenu();
        l.manageKitchen();

        System.out.println("######################################################");

        ArchitectMusician m= new ArchitectMusician();
        Architect n =m;
        Musician o =m;
        n.designBuilding();
        n.createBlueprint();
        n.inspectConstruction();
        o.playInstrument();
        o.composeSong();
        o.attendRehearsal();

        System.out.println("######################################################");

        NewsReporter aa = new NewsFlorist();
        aa.gatherNews();
        aa.reportLive();
        aa.interviewPeople();

        Chef bb = new ChefWriter();
        bb.cook();
        bb.planMenu();
        bb.manageKitchen();

        Musician cc = new MusicianAgent();
        cc.playInstrument();
        cc.composeSong();
        cc.attendRehearsal();

        SecurityGuard dd = new GuardDesigner();
        dd.patrolArea();
        dd.monitorCCTV();
        dd.checkID();

        Pilot ee = new PilotLibrarian();
        ee.flyAircraft();
        ee.checkWeather();
        ee.passengerAnnouncement();

        Florist v = new NewsFlorist();
        v.arrangeFlowers();
        v.takeOrders();
        v.deliverBouquets();

        ContentWriter kk = new ChefWriter();
        kk.writeArticle();
        kk.proofreadContent();
        kk.researchTopic();

        RealEstateAgent z = new MusicianAgent();
        z.showProperties();
        z.negotiateDeals();
        z.handlePaperwork();

        FashionDesigner x = new GuardDesigner();
        x.sketchDesigns();
        x.chooseFabric();
        x.attendFashionShow();

        Librarian y = new PilotLibrarian();
        y.assistPatrons();
        y.catalogBooks();
        y.organizeEvents();


        Lipstick ll = new LipstickManager();
        ll.applyOnLips();
        ll.sealColor();
        ll.twistOpen();

        BankManager bm = new LipstickManager();
        bm.approveLoan();
        bm.manageAccounts();
        bm.meetCustomers();

        System.out.println("########################################");

        Conditioner cp = new ConditionerPilot();
        cp.addShine();
        cp.reduceFrizz();
        cp.softenHair();

        Pilot p = new ConditionerPilot();
        p.flyAircraft();
        p.checkWeather();
        p.passengerAnnouncement();

        System.out.println("########################################");

        Sevpuri sw = new SevpuriWriter();
        sw.addToppings();
        sw.crushPuri();
        sw.serveWithChutney();

        ContentWriter w = new SevpuriWriter();
        w.writeArticle();
        w.proofreadContent();
        w.researchTopic();

        System.out.println("########################################");

        FaceScrub fm = new FaceScrubMusician();
        fm.exfoliate();
        fm.brightenSkin();
        fm.unclogPores();

        Musician mf = new FaceScrubMusician();
        mf.playInstrument();
        mf.composeSong();
        mf.attendRehearsal();

        System.out.println("########################################");

        Dahipuri dp = new DahipuriDriver();
        dp.plateUp();
        dp.addCurd();
        dp.sprinkleMasala();

        Driver dr = new DahipuriDriver();
        dr.drive();
        dr.checkFuel();
        dr.collectFare();

        System.out.println("########################################");

        Primer primerr = new PrimerBartender();
        primerr.minimizePores();
        primerr.prepSkin();
        primerr.smoothTexture();

        Bartender bartenderr = new PrimerBartender();
        bartenderr.mixDrinks();
        bartenderr.takeOrders();
        bartenderr.maintainBar();

        System.out.println("######################################################");


    }
}
