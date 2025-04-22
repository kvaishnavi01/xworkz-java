package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.SettingSpray;

public class DewySettingSpray implements SettingSpray {
    public DewySettingSpray() {
        System.out.println("DewySettingSpray created");
    }

    @Override
    public void mist() {
        System.out.println("Misting with DewySettingSpray");
    }
}