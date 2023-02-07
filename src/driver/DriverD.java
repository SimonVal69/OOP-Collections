package driver;

import java.util.Objects;

public class DriverD extends Driver {
    private String typeOfDriverLicense;

    public DriverD(String name, boolean isDriverLicense, double driveExperience, String typeOfDriverLicense) {
        super(name, isDriverLicense, driveExperience);
        this.typeOfDriverLicense = typeOfDriverLicense;
    }

    @Override
    public void start() {
        System.out.println("Водитель с категорией D " + getName() + " начинает движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель с категорией D " + getName() + " остановился");
    }

    @Override
    public void fillCar() {
        System.out.println("Водитель с категорией D " + getName() + " заправляет автомобиль");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DriverD driverD)) return false;
        if (!super.equals(o)) return false;
        return typeOfDriverLicense.equals(driverD.typeOfDriverLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfDriverLicense);
    }
}
