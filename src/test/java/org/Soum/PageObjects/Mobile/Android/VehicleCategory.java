package org.Soum.PageObjects.Mobile.Android;

public enum VehicleCategory {
    motorCycleOption("//android.widget.TextView[@text='A: Motocycle']"),
    carOption("//android.widget.TextView[@text='B: Véhicule']"),
    truckOption("//android.widget.TextView[@text='C/CE: Camion']"),
    busOption("//android.widget.TextView[@text='D: Bus']");

    public String description;

    VehicleCategory(String desc) {
        this.description = desc;
    }

    public String getVehicles() {
        return description;
    }

}
