package transport;

import driver.DriverC;
import enums.*;
import interfaces.Competing;

import java.util.Objects;

public class Truck extends Transport<DriverC> implements Competing {

    private final LoadCapacity loadCapacity;
    private VehicleType vehicleType;

    public Truck(String brand, String model, double engineVolume, DriverC driver, LoadCapacity loadCapacity, VehicleType vehicleType) {
        super(brand, model, engineVolume, driver);
        this.loadCapacity = loadCapacity;
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
        System.out.println("Проводим диагностику грузовика " + getBrand() + " " + getModel());
    }

    @Override
    public void start() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " начинает движение");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " заканчивает движение");
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck truck)) return false;
        if (!super.equals(o)) return false;
        return loadCapacity == truck.loadCapacity && getVehicleType() == truck.getVehicleType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity, getVehicleType());
    }
}

