package com.xworkz.tostring;

public class Clock {
    private String type;
    private int alarmCount;
    private boolean isDigital;

    public Clock(String type, int alarmCount, boolean isDigital) {
        this.type = type;
        this.alarmCount = alarmCount;
        this.isDigital = isDigital;
    }

    @Override
    public String toString() {
        return "type is " + this.type + " alarm count is " + this.alarmCount + " digital is " + this.isDigital;
    }
}
