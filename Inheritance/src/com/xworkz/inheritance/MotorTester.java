package com.xworkz.inheritance;

public class MotorTester {
    public void testMotor(Motor motor) {
        motor.start();
        motor.increaseSpeed();
        motor.decreaseSpeed();
        motor.checkTemperature();
        motor.stop();

        if (motor instanceof ElectricMotor) {
            ElectricMotor eMotor = (ElectricMotor) motor;
            eMotor.chargeBattery();
        }
    }
}
