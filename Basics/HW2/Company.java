class Company {
    public static String getOwner(String companyName) {
        if (companyName == "Tata") 
            return "Ratan Tata";
        else if (companyName == "Reliance") 
            return "Mukesh Ambani";
        else if (companyName == "Infosys") 
            return "Narayana Murthy";
        else if (companyName == "Wipro") 
            return "Azim Premji";
        else if (companyName == "HCL") 
            return "Shiv Nadar";
        else if (companyName == "Mahindra") 
            return "Anand Mahindra";
        else if (companyName == "Adani") 
            return "Gautam Adani";
        else if (companyName == "Birla") 
            return "Kumar Mangalam Birla";
        else if (companyName == "Paytm") 
            return "Vijay Shekhar Sharma";
        else if (companyName == "Zomato") 
            return "Deepinder Goyal";
        else if (companyName == "Byju's") 
            return "Byju Raveendran";
        else if (companyName == "Ola") 
            return "Bhavish Aggarwal";
        else 
            return "Not found";
    }
    
    public static void main(String[] args) {
        System.out.println(getOwner("Tata"));  
    }
}
