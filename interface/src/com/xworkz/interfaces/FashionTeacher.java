package com.xworkz.interfaces;

public class FashionTeacher implements FashionDesigner, Teacher {
    public void sketchDesigns() {
        System.out.println("Sketches new fashion designs.");
    }

    public void chooseFabric() {
        System.out.println("Chooses fabrics for designs.");
    }

    public void attendFashionShow() {
        System.out.println("Attends fashion shows to showcase designs.");
    }

    public void teachSubject() {
        System.out.println("Teaches students about fashion design.");
    }

    public void assignHomework() {
        System.out.println("Assigns design-related homework.");
    }

    public void evaluateExam() {
        System.out.println("Evaluates fashion design exams.");
    }
}
