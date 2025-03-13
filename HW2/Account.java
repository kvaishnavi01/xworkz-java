class Account {
    public static int getBalance(String accountNumber) {
        if (accountNumber == "123456789012") 
            return 50000;
        else if (accountNumber == "234567890123") 
            return 75000;
        else if (accountNumber == "345678901234") 
            return 62000;
        else if (accountNumber == "456789012345") 
            return 89000;
        else if (accountNumber == "567890123456") 
            return 102000;
        else if (accountNumber == "678901234567") 
            return 34000;
        else if (accountNumber == "789012345678") 
            return 45000;
        else if (accountNumber == "890123456789") 
            return 120000;
        else if (accountNumber == "901234567890") 
            return 97000;
        else if (accountNumber == "012345678901") 
            return 15000;
        else if (accountNumber == "112233445566") 
            return 68000;
        else if (accountNumber == "223344556677") 
            return 53000;
        else if (accountNumber == "334455667788") 
            return 76000;
        else if (accountNumber == "445566778899") 
            return 83000;
        else if (accountNumber == "556677889900") 
            return 92000;
        else if (accountNumber == "667788990011") 
            return 110000;
        else if (accountNumber == "778899001122") 
            return 49500;
        else 
            return -1;
    }
    
    public static void main(String[] args) {
        System.out.println(getBalance("123456789012"));  
    }
}
