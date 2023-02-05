package driver;

public class DriverC extends Driver {
    private String typeOfDriverLicense;

    public DriverC(String name, boolean isDriverLicense, double driveExperience, String typeOfDriverLicense) {
        super(name, isDriverLicense, driveExperience);
        this.typeOfDriverLicense = typeOfDriverLicense;
    }

    @Override
    public void start() {
        System.out.println("Водитель с категорией C " + getName() + " начинает движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель с категорией C " + getName() + " остановился");
    }

    @Override
    public void fillCar() {
        System.out.println("Водитель с категорией C " + getName() + " заправляет автомобиль");
    }
}
