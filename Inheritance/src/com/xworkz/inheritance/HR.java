package com.xworkz.inheritance;

public class HR {
    public void hire(Employee employee){
        employee.attendMeeting();
        employee.logout();
        employee.work();
        employee.submitReport();
        employee.takeBreak();

        if( employee instanceof Manager){
            Manager manager=(Manager) employee;
            manager.scolds();
        }
    }
}
