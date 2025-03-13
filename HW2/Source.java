class Source {
    public static int getPrice(String source) {
        if (source == "Mumbai") 
            return 500;
        else if (source == "Delhi") 
            return 700;
        else if (source == "Bangalore") 
            return 600;
        else if (source == "Chennai") 
            return 650;
        else if (source == "Kolkata") 
            return 550;
        else if (source == "Hyderabad") 
            return 620;
        else if (source == "Pune") 
            return 580;
        else if (source == "Ahmedabad") 
            return 490;
        else if (source == "Jaipur") 
            return 510;
        else if (source == "Lucknow") 
            return 530;
        else if (source == "Chandigarh") 
            return 520;
        else if (source == "Bhopal") 
            return 540;
        else if (source == "Indore") 
            return 560;
        else if (source == "Nagpur") 
            return 590;
        else if (source == "Goa") 
            return 680;
        else if (source == "Surat") 
            return 570;
        else if (source == "Visakhapatnam") 
            return 600;
        else if (source == "Patna") 
            return 610;
        else if (source == "Ranchi") 
            return 620;
        else if (source == "Guwahati") 
            return 630;
        else 
            return -1;
    }
    
    public static void main(String[] args) {
        System.out.println(getPrice("Mumbai"));  
    }
}