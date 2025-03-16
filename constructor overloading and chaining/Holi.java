class Holi 
{
    String festivalName;
    String date;
    String location;
    boolean isPublicHoliday;
    int noOfDays;
    String significance;

    Holi() 
    {
        System.out.println("Holi() constructor called");
    }

    Holi(String festivalName) 
    {
        this.festivalName = festivalName;
        System.out.println("Holi(String festivalName) constructor called");
    }

    Holi(String festivalName, String date) 
    {
        this.festivalName = festivalName;
        this.date = date;
        System.out.println("Holi(String festivalName, String date) constructor called");
    }

    Holi(String festivalName, String date, String location) 
    {
        this.festivalName = festivalName;
        this.date = date;
        this.location = location;
        System.out.println("Holi(String festivalName, String date, String location) constructor called");
    }

    Holi(String festivalName, String date, String location, boolean isPublicHoliday) 
    {
        this(festivalName, date, location);
        this.isPublicHoliday = isPublicHoliday;
        System.out.println("Holi(String festivalName, String date, String location, boolean isPublicHoliday) constructor called");
    }

    Holi(String festivalName, String date, String location, boolean isPublicHoliday, int noOfDays) 
    {
        this(festivalName, date, location, isPublicHoliday);
        this.noOfDays = noOfDays;
        System.out.println("Holi(String festivalName, String date, String location, boolean isPublicHoliday, int noOfDays) constructor called");
    }

    Holi(String festivalName, String date, String location, boolean isPublicHoliday, int noOfDays, String significance) 
    {
        this(festivalName, date, location, isPublicHoliday, noOfDays);
        this.significance = significance;
        System.out.println("Holi(String festivalName, String date, String location, boolean isPublicHoliday, int noOfDays, String significance) constructor called");
    }

    void display() 
    {
        System.out.println("Holi - Festival: " + festivalName + ", Date: " + date + ", Location: " + location 
                           + ", Public Holiday: " + isPublicHoliday + ", Days: " + noOfDays + ", Significance: " + significance);
						   
    }
}