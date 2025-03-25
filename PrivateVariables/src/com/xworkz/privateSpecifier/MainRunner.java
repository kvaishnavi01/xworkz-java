package com.xworkz.privateSpecifier;

public class MainRunner {
    public static void main(String[] args) {
        JailService jailService = new JailService();
        jailService.initJailLocally();

        SatelliteService satelliteService = new SatelliteService();
        satelliteService.initSatelliteLocally();

        IdCardService idCardService = new IdCardService();
        idCardService.initIdCardsLocally();

        AlienService alienService = new AlienService();
        alienService.initAliensLocally();

        CameraServices cameraService = new CameraServices();
        cameraService.initCameraLocally();
    }
}
