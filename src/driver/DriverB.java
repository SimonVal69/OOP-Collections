package driver;

import utils.Utils;

import java.util.Objects;

public class DriverB extends Driver {
    private String typeOfDriverLicense;

    public DriverB(String name, boolean isDriverLicense, double driveExperience, String typeOfDriverLicense) {
        super(name, isDriverLicense, driveExperience);
        this.typeOfDriverLicense = Utils.checkData(typeOfDriverLicense);
    }

    @Override
    public void start() {
        System.out.println("Водитель с категорией B " + getName() + " начинает движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель с категорией B " + getName() + " остановился");
    }

    @Override
    public void fillCar() {
        System.out.println("Водитель с категорией B " + getName() + " заправляет автомобиль");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DriverB driverB)) return false;
        if (!super.equals(o)) return false;
        return typeOfDriverLicense.equals(driverB.typeOfDriverLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfDriverLicense);
    }
}
