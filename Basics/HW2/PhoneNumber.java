class PhoneNumber {
    public static String getName(String mobileNo) {
        if (mobileNo == "9876543210") 
			return "Amit";
        else if (mobileNo == "8765432109") 
			return "Raj";
        else if (mobileNo == "7654321098")  
			return "Priya";
        else if (mobileNo == "6543210987")  
			return "Suresh";
        else if (mobileNo == "5432109876")  
			return "Neha";
        else if (mobileNo == "4321098765")  
			return "Vikas";
        else if (mobileNo == "3210987654")  
			return "Anjali";
        else if (mobileNo == "2109876543")  
			return "Manoj";
        else if (mobileNo == "1098765432")  
			return "Pooja";
        else if (mobileNo == "0987654321") 
			return "Ravi";
        else if (mobileNo == "9876501234") 
			return "Kiran";
        else if (mobileNo == "8765402345") 
			return "Meera";
        else if (mobileNo == "7654303456") 
			return "Nitin";
        else if (mobileNo == "6543204567") 
			return "Sunita";
        else if (mobileNo == "5432105678") 
			return "Arjun";
        else if (mobileNo == "4321096789")
			return "Komal";
        else if (mobileNo == "3210987890") 
			return "Sanjay";
        else if (mobileNo == "2109878901") 
			return "Ritika";
        else if (mobileNo == "1098769012") 
			return "Mahesh";
        else if (mobileNo == "0987650123") 
			return "Sneha";
        else if (mobileNo == "9876541234") 
			return "Gaurav";
        else if (mobileNo == "8765432345")  
			return "Swati";
        else if (mobileNo == "7654323456")  
			return "Deepak";
        else
			return "Not found";
    }

    public static void main(String[] args) {
        System.out.println(getName("9876543210"));  
    }
}
