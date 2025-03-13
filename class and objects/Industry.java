class Industry {
    String name;
    int employees;
    double revenue;
    String sector;

    Industry() {
        System.out.println("Industry object created!");
    }

    public static void main(String[] args) {
        Industry i1 = new Industry();
        i1.name = "TechCorp";
        i1.employees = 5000;
        i1.revenue = 2.5;
        i1.sector = "Technology";
        System.out.println(i1.name + "  " + i1.employees + " employees  " + i1.revenue + " billion revenue  " + i1.sector);

        Industry i2 = new Industry();
        i2.name = "AutoMakers";
        i2.employees = 10000;
        i2.revenue = 10.0;
        i2.sector = "Automobile";
        System.out.println(i2.name + "  " + i2.employees + " employees  " + i2.revenue + " billion revenue  " + i2.sector);

        Industry i3 = new Industry();
        i3.name = "Foodies Inc";
        i3.employees = 2000;
        i3.revenue = 1.2;
        i3.sector = "Food Processing";
        System.out.println(i3.name + "  " + i3.employees + " employees  " + i3.revenue + " billion revenue  " + i3.sector);

        Industry i4 = new Industry();
        i4.name = "HealthCare Ltd";
        i4.employees = 8000;
        i4.revenue = 3.8;
        i4.sector = "Healthcare";
        System.out.println(i4.name + "  " + i4.employees + " employees  " + i4.revenue + " billion revenue  " + i4.sector);

        Industry i5 = new Industry();
        i5.name = "GreenEnergy";
        i5.employees = 6000;
        i5.revenue = 4.0;
        i5.sector = "Renewable Energy";
        System.out.println(i5.name + "  " + i5.employees + " employees  " + i5.revenue + " billion revenue  " + i5.sector);

        Industry i6 = new Industry();
        i6.name = "MediaHouse";
        i6.employees = 3500;
        i6.revenue = 2.0;
        i6.sector = "Media & Entertainment";
        System.out.println(i6.name + "  " + i6.employees + " employees  " + i6.revenue + " billion revenue  " + i6.sector);

        Industry i7 = new Industry();
        i7.name = "LogiTrans";
        i7.employees = 12000;
        i7.revenue = 5.5;
        i7.sector = "Logistics & Transportation";
        System.out.println(i7.name + "  " + i7.employees + " employees  " + i7.revenue + " billion revenue  " + i7.sector);

        Industry i8 = new Industry();
        i8.name = "FinanceCorp";
        i8.employees = 7000;
        i8.revenue = 6.2;
        i8.sector = "Finance";
        System.out.println(i8.name + "  " + i8.employees + " employees  " + i8.revenue + " billion revenue  " + i8.sector);

        Industry i9 = new Industry();
        i9.name = "EduTech";
        i9.employees = 4000;
        i9.revenue = 1.8;
        i9.sector = "Education Technology";
        System.out.println(i9.name + "  " + i9.employees + " employees  " + i9.revenue + " billion revenue  " + i9.sector);

        Industry i10 = new Industry();
        i10.name = "RetailWorld";
        i10.employees = 15000;
        i10.revenue = 8.0;
        i10.sector = "Retail";
        System.out.println(i10.name + "  " + i10.employees + " employees  " + i10.revenue + " billion revenue  " + i10.sector);
    }
}
