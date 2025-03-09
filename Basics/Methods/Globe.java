class Globe {
    public static void rotate() { 
        System.out.println("Globe rotating."); 
    }

    public static void highlightCountry() { 
        System.out.println("Country highlighted."); 
    }

    public static void showTimeZones() { 
        System.out.println("Time zones shown."); 
    }

    public static void measureDistance() { 
        System.out.println("Distance measured."); 
    }

    public static void displayWeather() { 
        System.out.println("Weather displayed."); 
    }

    public static void showPopulation() { 
        System.out.println("Population shown."); 
    }

    public static void zoomIn() { 
        System.out.println("Zoomed in."); 
    }

    public static void zoomOut() { 
        System.out.println("Zoomed out."); 
    }

    public static void spin() { 
        System.out.println("Globe spinning."); 
    }

    public static void stop() { 
        System.out.println("Globe stopped."); 
    }

    public static void main(String[] args) {
        rotate();
        highlightCountry();
        showTimeZones();
        measureDistance();
        displayWeather();
    }
}

class GeographyTeacher {
    public static void main(String[] args) {
        Globe.showPopulation();
        Globe.zoomIn();
        Globe.zoomOut();
        Globe.spin();
        Globe.stop();
    }
}