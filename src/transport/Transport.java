package transport;

import driver.Driver;
import exceptions.TransportTypeException;
import servicies.Mechanics;
import utils.Utils;
import java.util.ArrayList;
import java.util.List;

public abstract class Transport<T extends Driver> {
    private String brand;
    private String model;
    private double engineVolume;
    private T driver;
    private List<Mechanics> person;

    public Transport(String brand, String model, double engineVolume, T driver) {
        this.brand = Utils.checkData(brand);
        this.model = Utils.checkData(model);
        this.engineVolume = Utils.checkData(engineVolume);
        this.driver = driver;
        this.person = new ArrayList<>();
    }

    public abstract void printType();
    public void diagnoseVehicle() throws TransportTypeException {}

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public List<Mechanics> getPerson() {
        return person;
    }

    public void setPerson(Mechanics mechanic) {
        this.person.add(mechanic);
    }

    public void start() {
        System.out.println("Начать движение");
    }

    public void stop() {
        System.out.println("Закончить движение");
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public T getDriver() {
        return driver;
    }


}
