package driver;

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
}
