class MNCCompany {
    public static void hireEmployee() { 
        System.out.println("Employee hired."); 
    }

    public static void fireEmployee() { 
        System.out.println("Employee fired."); 
    }

    public static void launchProduct() { 
        System.out.println("Product launched."); 
    }

    public static void conductMeeting() { 
        System.out.println("Meeting conducted."); 
    }

    public static void paySalaries() { 
        System.out.println("Salaries paid."); 
    }

    public static void expandBusiness() { 
        System.out.println("Business expanded."); 
    }

    public static void acquireCompany() { 
        System.out.println("Company acquired."); 
    }

    public static void fileTaxes() { 
        System.out.println("Taxes filed."); 
    }

    public static void trainEmployees() { 
        System.out.println("Employees trained."); 
    }

    public static void generateRevenueReport() { 
        System.out.println("Revenue report generated."); 
    }

    public static void main(String[] args) {
        hireEmployee();
        fireEmployee();
        launchProduct();
        conductMeeting();
        paySalaries();
    }
}

class CEO {
    public static void main(String[] args) {
        MNCCompany.expandBusiness();
        MNCCompany.acquireCompany();
        MNCCompany.fileTaxes();
        MNCCompany.trainEmployees();
        MNCCompany.generateRevenueReport();
    }
}