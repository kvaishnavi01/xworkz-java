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

    @Override
    public int hashCode(){
        return 41;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            System.out.println("ref is not null");
            if(obj instanceof Clock) {
                System.out.println("will compare.....");
                Clock clock = this;
                Clock clock1 = (Clock) obj;
                if(clock.type.equals(clock1.type) && clock.alarmCount == clock1.alarmCount) {
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
