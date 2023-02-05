package transport;

import driver.DriverD;
import enums.*;
import exceptions.TransportTypeException;
import interfaces.Competing;

import java.util.Objects;

public class Bus extends Transport<DriverD> implements Competing {

    private final Capacity capacity;
    private VehicleType vehicleType;

    public Bus(String brand, String model, double engineVolume, DriverD driver, Capacity capacity, VehicleType vehicleType) {
        super(brand, model, engineVolume, driver);
        this.capacity = capacity;
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
    public void diagnoseVehicle() throws TransportTypeException {
        throw new TransportTypeException("Автобусам не нужна диагностика");
    }

    @Override
    public void start() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " начинает движение");
    }

    @Override
    public void stop() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " заканчивает движение");
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
        if (!(o instanceof Bus bus)) return false;
        if (!super.equals(o)) return false;
        return capacity == bus.capacity && getVehicleType() == bus.getVehicleType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), capacity, getVehicleType());
    }
}
