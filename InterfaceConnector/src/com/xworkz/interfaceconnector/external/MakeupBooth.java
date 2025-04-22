package com.xworkz.interfaceconnector.external;

import com.xworkz.interfaceconnector.internal.SettingSpray;

public class MakeupBooth {
    private SettingSpray settingSpray;

    public MakeupBooth(SettingSpray settingSpray) {
        System.out.println("MakeupBooth with SettingSpray created");
        this.settingSpray = settingSpray;
    }

    public void finish() {
        System.out.println("MakeupBooth is using settingSpray");
        if (settingSpray != null) {
            this.settingSpray.mist();
        }
    }
}