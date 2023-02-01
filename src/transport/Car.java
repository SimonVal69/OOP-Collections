package transport;

import driver.DriverB;
import enums.*;
import interfaces.Competing;

public class Car extends Transport<DriverB> implements Competing {

    private CarBody carBody;
    private VehicleType vehicleType;

    public Car(String brand, String model, double engineVolume, DriverB driver, CarBody carBody, VehicleType vehicleType) {
        super(brand, model, engineVolume, driver);
        this.carBody = carBody;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public void printType() {
        if (vehicleType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип транспортного средства: " + vehicleType.getTypeTranslate());
        }
    }

    @Override
    public void diagnoseVehicle() {
        System.out.println("Проводим диагностику легкового автомобиля " + getBrand() + " " + getModel());
    }

    @Override
    public void start() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " начинает движение");
    }

    @Override
    public void stop() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " заканчивает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп для " + getBrand() + " " + getModel());
    }

    @Override
    public void bestTimeOfCircle() {
        System.out.println("Лучшее время круга для " + getBrand() + " " + getModel() + "...");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость для " + getBrand() + " " + getModel() + "...");
    }

}
