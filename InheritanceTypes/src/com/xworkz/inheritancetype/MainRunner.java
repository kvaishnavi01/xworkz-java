package com.xworkz.inheritancetype;

import com.xworkz.inheritancetype.hierarchical.Student;
import com.xworkz.inheritancetype.hierarchical.Teacher;
import com.xworkz.inheritancetype.multilevel.Burger;
import com.xworkz.inheritancetype.single.Novel;

import com.xworkz.inheritancetype.single.Bicycle;
import com.xworkz.inheritancetype.multilevel.PlayStation;
import com.xworkz.inheritancetype.hierarchical.SBI;
import com.xworkz.inheritancetype.hierarchical.HDFC;


import com.xworkz.inheritancetype.single.Movie;
import com.xworkz.inheritancetype.multilevel.Helicopter;
import com.xworkz.inheritancetype.hierarchical.Developer;
import com.xworkz.inheritancetype.hierarchical.Tester;

import com.xworkz.inheritancetype.single.Painting;
import com.xworkz.inheritancetype.multilevel.JavaCourse;
import com.xworkz.inheritancetype.hierarchical.Professor;
import com.xworkz.inheritancetype.hierarchical.Admin;


import com.xworkz.inheritancetype.single.Chess;
import com.xworkz.inheritancetype.multilevel.Cardiology;
import com.xworkz.inheritancetype.hierarchical.Android;
import com.xworkz.inheritancetype.hierarchical.IOS;

import com.xworkz.inheritancetype.single.VacuumCleaner;
import com.xworkz.inheritancetype.multilevel.Cameraman;
import com.xworkz.inheritancetype.hierarchical.Sculpture;


import com.xworkz.inheritancetype.single.Piano;
import com.xworkz.inheritancetype.multilevel.Astronomer;
import com.xworkz.inheritancetype.hierarchical.PhotoGallery;
import com.xworkz.inheritancetype.hierarchical.ArtGallery;


import com.xworkz.inheritancetype.single.Animal;
import com.xworkz.inheritancetype.multilevel.Supervisor;
import com.xworkz.inheritancetype.hierarchical.DrillingMachine;
import com.xworkz.inheritancetype.hierarchical.CuttingMachine;

import com.xworkz.inheritancetype.single.Sparkstone;
import com.xworkz.inheritancetype.multilevel.RadiantLife;
import com.xworkz.inheritancetype.hierarchical.Starblaze;
import com.xworkz.inheritancetype.hierarchical.CosmoWing;


import com.xworkz.inheritancetype.single.Clairvoyant;
import com.xworkz.inheritancetype.multilevel.CelestialBeing;
import com.xworkz.inheritancetype.hierarchical.Spark;
import com.xworkz.inheritancetype.hierarchical.Charge;

public class MainRunner {
    public static void main(String[] args) {

        // Single Level
        Employee e = new Employee();
        e.displayPerson();
        e.displayEmployee();

        System.out.println("--------------------------------------------------");

        // Multi Level
        Manager m = new Manager();
        m.displayPerson();
        m.displayEmployee();
        m.displayManager();

        System.out.println("--------------------------------------------------");


        // Hierarchical
        Son s = new Son();
        s.parentInfo();
        s.sonInfo();

        Daughter d = new Daughter();
        d.parentInfo();
        d.daughterInfo();

        System.out.println("##################################################");

        // Single Level
        Novel novel = new Novel();
        novel.bookInfo();
        novel.novelInfo();

        System.out.println("--------------------------------------------------");

        // Multi Level
        Burger burger = new Burger();
        burger.eat();
        burger.fastFoodType();
        burger.burgerInfo();

        System.out.println("--------------------------------------------------");

        // Hierarchical
        Teacher teacher = new Teacher();
        teacher.schoolName();
        teacher.teach();

        Student student = new Student();
        student.schoolName();
        student.study();

        System.out.println("##################################################");

        Bicycle bicycle = new Bicycle();
        bicycle.vehicleInfo();
        bicycle.bicycleInfo();

        System.out.println("--------------------------------------------------");

        // Multi Level
        PlayStation ps = new PlayStation();
        ps.deviceInfo();
        ps.consoleInfo();
        ps.playStationInfo();

        System.out.println("--------------------------------------------------");

        // Hierarchical
        SBI sbi = new SBI();
        sbi.bankInfo();
        sbi.sbiInfo();

        HDFC hdfc = new HDFC();
        hdfc.bankInfo();
        hdfc.hdfcInfo();

        System.out.println("##################################################");

        // Single Level
        Movie movie = new Movie();
        movie.mediaInfo();
        movie.movieInfo();

        System.out.println("--------------------------------------------------");

        // Multi Level
        Helicopter helicopter = new Helicopter();
        helicopter.transportInfo();
        helicopter.airTransportInfo();
        helicopter.helicopterInfo();

        System.out.println("--------------------------------------------------");

        // Hierarchical
        Developer developer = new Developer();
        developer.companyInfo();
        developer.developerInfo();

        Tester tester = new Tester();
        tester.companyInfo();
        tester.testerInfo();

        System.out.println("##################################################");


        // Single Level
        Painting painting = new Painting();
        painting.artInfo();
        painting.paintingInfo();

        System.out.println("--------------------------------------------------");

        // Multi Level
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.courseInfo();
        javaCourse.onlineCourseInfo();
        javaCourse.javaCourseInfo();

        System.out.println("--------------------------------------------------");

        // Hierarchical
        Professor professor = new Professor();
        professor.universityInfo();
        professor.professorInfo();

        Admin admin = new Admin();
        admin.universityInfo();
        admin.adminInfo();

        System.out.println("##################################################");

        // Single Level
        Chess chess = new Chess();
        chess.gameInfo();
        chess.chessInfo();

        System.out.println("--------------------------------------------------");

        // Multi Level
        Cardiology cardio = new Cardiology();
        cardio.hospitalInfo();
        cardio.departmentInfo();
        cardio.cardiologyInfo();

        System.out.println("--------------------------------------------------");

        // Hierarchical
        Android android = new Android();
        android.mobileInfo();
        android.androidInfo();

        IOS ios = new IOS();
        ios.mobileInfo();
        ios.iosInfo();

        System.out.println("##################################################");


        // Single Level
        VacuumCleaner vacuum = new VacuumCleaner();
        vacuum.cleanInfo();
        vacuum.vacuumInfo();

        System.out.println("--------------------------------------------------");

        // Multi Level
        Cameraman cam = new Cameraman();
        cam.studioInfo();
        cam.crewInfo();
        cam.cameramanInfo();

        System.out.println("--------------------------------------------------");

        // Hierarchical
        Painting paint = new Painting();
        paint.artInfo();
        paint.paintingInfo();

        Sculpture sculpture = new Sculpture();
        sculpture.artInfo();
        sculpture.sculptureInfo();

        System.out.println("##################################################");

        // Single Level
        Piano piano = new Piano();
        piano.instrumentInfo();
        piano.pianoInfo();

        System.out.println("--------------------------------------------------");

        // Multi Level
        Astronomer astro = new Astronomer();
        astro.observatoryInfo();
        astro.telescopeInfo();
        astro.astronomerInfo();

        System.out.println("--------------------------------------------------");

        // Hierarchical
        PhotoGallery photo = new PhotoGallery();
        photo.galleryInfo();
        photo.photoGalleryInfo();

        ArtGallery art = new ArtGallery();
        art.galleryInfo();
        art.artGalleryInfo();

        System.out.println("##################################################");

        // Single Level
        Animal animal = new Animal();
        animal.creatureInfo();
        animal.animalInfo();

        System.out.println("--------------------------------------------------");

        // Multi Level
        Supervisor supervisor = new Supervisor();
        supervisor.jobInfo();
        supervisor.employeeInfo();
        supervisor.supervisorInfo();

        System.out.println("--------------------------------------------------");

        // Hierarchical
        DrillingMachine drill = new DrillingMachine();
        drill.machineInfo();
        drill.drillingMachineInfo();

        CuttingMachine cut = new CuttingMachine();
        cut.machineInfo();
        cut.cuttingMachineInfo();

        System.out.println("##################################################");

        // Single Level
        Sparkstone sparkstone = new Sparkstone();
        sparkstone.dreamstoneInfo();
        sparkstone.sparkstoneInfo();

        System.out.println("--------------------------------------------------");

        // Multi Level
        RadiantLife radiantLife = new RadiantLife();
        radiantLife.lifeformInfo();
        radiantLife.biolumeInfo();
        radiantLife.radiantLifeInfo();

        System.out.println("--------------------------------------------------");

        // Hierarchical
        Starblaze starblaze = new Starblaze();
        starblaze.nebulonInfo();
        starblaze.starblazeInfo();

        CosmoWing cosmoWing = new CosmoWing();
        cosmoWing.nebulonInfo();
        cosmoWing.cosmoWingInfo();

        System.out.println("##################################################");


        // Single Level
        Clairvoyant clairvoyant = new Clairvoyant();
        clairvoyant.visionaryInfo();
        clairvoyant.clairvoyantInfo();

        System.out.println("--------------------------------------------------");

        // Multi Level
        CelestialBeing celestialBeing = new CelestialBeing();
        celestialBeing.entityInfo();
        celestialBeing.phenomenonInfo();
        celestialBeing.celestialBeingInfo();

        System.out.println("--------------------------------------------------");

        // Hierarchical
        Spark spark = new Spark();
        spark.dynamoInfo();
        spark.sparkInfo();

        Charge charge = new Charge();
        charge.dynamoInfo();
        charge.chargeInfo();

        System.out.println("##################################################");

    }
}
