package driver;

import utils.Utils;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver driver)) return false;
        return isHasDriverLicense() == driver.isHasDriverLicense() && Double.compare(driver.getDriveExperience(), getDriveExperience()) == 0 && getName().equals(driver.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), isHasDriverLicense(), getDriveExperience());
    }
}
