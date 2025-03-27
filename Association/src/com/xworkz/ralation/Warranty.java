package com.xworkz.ralation;

public class Warranty {
    private String startDate;
    private String endDate;

    public Warranty(String startDate, String endDate){
        this.endDate=endDate;
        this.startDate=startDate;

    }

    public void showWarranty(){
        System.out.println("running func inside Warranty");
    }

}
