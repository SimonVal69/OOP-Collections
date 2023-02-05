package driver;

import utils.Utils;

public abstract class Driver {
    private String name;
    private boolean hasDriverLicense;
    private double driveExperience;

    public Driver(String name, boolean hasDriverLicense, double driveExperience) {
        this.name = Utils.checkData(name);
        this.hasDriverLicense = hasDriverLicense;
        this.driveExperience = Utils.checkData(driveExperience);
    }

    public void start() {
        System.out.println("Начать движение");
    }

    public void stop() {
        System.out.println("Остановиться");
    }

    public void fillCar() {
        System.out.println("Заправить авто");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public double getDriveExperience() {
        return driveExperience;
    }
}
