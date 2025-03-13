class Camera {
    String brand;
    String model;
    double resolution;
    boolean hasZoom;

    Camera() {
        System.out.println("Camera object created!");
    }

    public static void main(String[] args) {
        Camera c1 = new Camera();
        c1.brand = "Canon";
        c1.model = "EOS R5";
        c1.resolution = 45.0;
        c1.hasZoom = true;
        System.out.println(c1.brand + "  " + c1.model + "  " + c1.resolution + "MP  " + (c1.hasZoom ? "Has Zoom" : "No Zoom"));

        Camera c2 = new Camera();
        c2.brand = "Nikon";
        c2.model = "Z9";
        c2.resolution = 45.7;
        c2.hasZoom = true;
        System.out.println(c2.brand + "  " + c2.model + "  " + c2.resolution + "MP  " + (c2.hasZoom ? "Has Zoom" : "No Zoom"));

        Camera c3 = new Camera();
        c3.brand = "Sony";
        c3.model = "Alpha A7R IV";
        c3.resolution = 61.0;
        c3.hasZoom = true;
        System.out.println(c3.brand + "  " + c3.model + "  " + c3.resolution + "MP  " + (c3.hasZoom ? "Has Zoom" : "No Zoom"));

        Camera c4 = new Camera();
        c4.brand = "Fujifilm";
        c4.model = "X-T4";
        c4.resolution = 26.1;
        c4.hasZoom = false;
        System.out.println(c4.brand + "  " + c4.model + "  " + c4.resolution + "MP  " + (c4.hasZoom ? "Has Zoom" : "No Zoom"));

        Camera c5 = new Camera();
        c5.brand = "Panasonic";
        c5.model = "Lumix S1R";
        c5.resolution = 47.3;
        c5.hasZoom = true;
        System.out.println(c5.brand + "  " + c5.model + "  " + c5.resolution + "MP  " + (c5.hasZoom ? "Has Zoom" : "No Zoom"));

        Camera c6 = new Camera();
        c6.brand = "Leica";
        c6.model = "Q2";
        c6.resolution = 47.3;
        c6.hasZoom = false;
        System.out.println(c6.brand + "  " + c6.model + "  " + c6.resolution + "MP  " + (c6.hasZoom ? "Has Zoom" : "No Zoom"));

        Camera c7 = new Camera();
        c7.brand = "Olympus";
        c7.model = "OM-D E-M1 Mark III";
        c7.resolution = 20.4;
        c7.hasZoom = true;
        System.out.println(c7.brand + "  " + c7.model + "  " + c7.resolution + "MP  " + (c7.hasZoom ? "Has Zoom" : "No Zoom"));

        Camera c8 = new Camera();
        c8.brand = "Pentax";
        c8.model = "K-1 Mark II";
        c8.resolution = 36.4;
        c8.hasZoom = true;
        System.out.println(c8.brand + "  " + c8.model + "  " + c8.resolution + "MP  " + (c8.hasZoom ? "Has Zoom" : "No Zoom"));

        Camera c9 = new Camera();
        c9.brand = "GoPro";
        c9.model = "Hero 10";
        c9.resolution = 23.0;
        c9.hasZoom = false;
        System.out.println(c9.brand + "  " + c9.model + "  " + c9.resolution + "MP  " + (c9.hasZoom ? "Has Zoom" : "No Zoom"));

        Camera c10 = new Camera();
        c10.brand = "Samsung";
        c10.model = "NX1";
        c10.resolution = 28.2;
        c10.hasZoom = true;
        System.out.println(c10.brand + "  " + c10.model + "  " + c10.resolution + "MP  " + (c10.hasZoom ? "Has Zoom" : "No Zoom"));
    }
}
