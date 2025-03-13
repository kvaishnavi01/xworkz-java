class Names {
    public static String isAlive(String name) {
        if (name == "Amit") 
            return "Alive";
        else if (name == "Raj") 
            return "Dead";
        else if (name == "Priya") 
            return "Alive";
        else if (name == "Suresh") 
            return "Dead";
        else if (name == "Neha") 
            return "Alive";
        else if (name == "Vikas") 
            return "Dead";
        else if (name == "Anjali") 
            return "Alive";
        else if (name == "Manoj") 
            return "Dead";
        else 
            return "Unknown";
    }
    
    public static void main(String[] args) {
        System.out.println(isAlive("Amit"));  
    }
}