import driver.*;
import enums.*;
import exceptions.TransportTypeException;
import servicies.*;
import transport.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        DriverB driverB = new DriverB("Bob", true, 15, "B");
        DriverC driverC = new DriverC("Thom", true, 10, "C");
        DriverD driverD = new DriverD("Jack", true, 17, "D");

        Mechanics mechanic1 = new Mechanics("Daniel", "Company1");
        Mechanics mechanic2 = new Mechanics("Paolo", "Company2");
        Mechanics mechanic3 = new Mechanics("Robert", "Company3");
        Mechanics mechanic4 = new Mechanics("Jack", "Company4");
        Mechanics mechanic5 = new Mechanics("Morgan", "Company5");

        List<Mechanics> listOfMechanics = new ArrayList<>();
        listOfMechanics.add(mechanic1);
        listOfMechanics.add(mechanic2);
        listOfMechanics.add(mechanic3);
        listOfMechanics.add(mechanic4);
        listOfMechanics.add(mechanic5);

        System.out.println(listOfMechanics);

        System.out.println();

        Car car1 = new Car("Toyota", "Camry", 2.5, driverB, CarBody.SEDAN, null);
        Car car2 = new Car("Mercedes", "S200", 3.5, driverB, CarBody.SUV, VehicleType.CAR);
        Car car3 = new Car("BMW", "A6", 3.0, driverB, CarBody.COUPE, VehicleType.CAR);
        Car car4 = new Car("Audi", "A6", 3.5, driverB, CarBody.CROSSOVER, VehicleType.CAR);

        Truck truck1 = new Truck("Mercedes", "M100", 5.0, driverC, LoadCapacity.N1, VehicleType.TRUCK);
        Truck truck2 = new Truck("Volvo", "V200", 5.0, driverC, LoadCapacity.N2, VehicleType.TRUCK);
        Truck truck3 = new Truck("GMC", "G300", 5.0, driverC, LoadCapacity.N3, VehicleType.TRUCK);
        Truck truck4 = new Truck("Kamaz", "K400", 5.0, driverC, LoadCapacity.N1, VehicleType.TRUCK);

        Bus bus1 = new Bus("Mercedes", "BM100", 5.5, driverD, Capacity.TINY, VehicleType.BUS);
        Bus bus2 = new Bus("Volvo", "BV200", 5.5, driverD, Capacity.LARGE, VehicleType.BUS);
        Bus bus3 = new Bus("Neoplan", "BN300", 5.5, driverD, Capacity.HUGE, VehicleType.BUS);
        Bus bus4 = new Bus("Icarus", "BI400", 5.5, driverD, Capacity.SMALL, VehicleType.BUS);

        car1.setPerson(mechanic1);
        car1.setPerson(mechanic2);
        car2.setPerson(mechanic1);
        car3.setPerson(mechanic3);
        car4.setPerson(mechanic4);

        truck1.setPerson(mechanic2);
        truck1.setPerson(mechanic5);
        truck2.setPerson(mechanic3);
        truck3.setPerson(mechanic3);
        truck4.setPerson(mechanic4);

        bus1.setPerson(mechanic5);
        bus2.setPerson(mechanic5);
        bus3.setPerson(mechanic5);
        bus4.setPerson(mechanic5);

        List<Mechanics> mechanicsOfCar1 = new ArrayList<>();
        mechanicsOfCar1.add(mechanic1);
        mechanicsOfCar1.add(mechanic2);
        List<Mechanics> mechanicsOfCar2 = new ArrayList<>();
        mechanicsOfCar2.add(mechanic1);
        List<Mechanics> mechanicsOfCar3 = new ArrayList<>();
        mechanicsOfCar3.add(mechanic3);
        List<Mechanics> mechanicsOfCar4 = new ArrayList<>();
        mechanicsOfCar4.add(mechanic4);
        List<Mechanics> mechanicsOfTruck1 = new ArrayList<>();
        mechanicsOfTruck1.add(mechanic2);
        mechanicsOfTruck1.add(mechanic5);
        List<Mechanics> mechanicsOfTruck2 = new ArrayList<>();
        mechanicsOfTruck2.add(mechanic3);
        List<Mechanics> mechanicsOfTruck3 = new ArrayList<>();
        mechanicsOfTruck3.add(mechanic3);
        List<Mechanics> mechanicsOfTruck4 = new ArrayList<>();
        mechanicsOfTruck4.add(mechanic4);
        List<Mechanics> mechanicsOfBus1 = new ArrayList<>();
        mechanicsOfBus1.add(mechanic5);
        List<Mechanics> mechanicsOfBus2 = new ArrayList<>();
        mechanicsOfBus2.add(mechanic5);
        List<Mechanics> mechanicsOfBus3 = new ArrayList<>();
        mechanicsOfBus3.add(mechanic5);
        List<Mechanics> mechanicsOfBus4 = new ArrayList<>();
        mechanicsOfBus4.add(mechanic5);

        Map<Transport, List<Mechanics>> transportAndMechanics = new HashMap<>();
        transportAndMechanics.put(car1, mechanicsOfCar1);
        transportAndMechanics.put(car2, mechanicsOfCar2);
        transportAndMechanics.put(car3, mechanicsOfCar3);
        transportAndMechanics.put(car4, mechanicsOfCar4);
        transportAndMechanics.put(truck1, mechanicsOfTruck1);
        transportAndMechanics.put(truck2, mechanicsOfTruck2);
        transportAndMechanics.put(truck3, mechanicsOfTruck3);
        transportAndMechanics.put(truck4, mechanicsOfTruck4);
        transportAndMechanics.put(bus1, mechanicsOfBus1);
        transportAndMechanics.put(bus2, mechanicsOfBus2);
        transportAndMechanics.put(bus3, mechanicsOfBus3);
        transportAndMechanics.put(bus4, mechanicsOfBus4);

        for (Map.Entry<Transport, List<Mechanics>> vehicle :
                transportAndMechanics.entrySet()) {
            System.out.println("Автомобиль " + vehicle.getKey() + " - Механик(и) " + vehicle.getValue());
        }

        System.out.println();

        try {
            mechanic1.doDiagnostic(car1);
            mechanic2.doDiagnostic(truck1);
            mechanic5.doDiagnostic(bus1);
        } catch (TransportTypeException e) {
            System.err.println("Автобусам не нужна диагностика");
        }

        System.out.println();

        showDriverAndMechanics(car1);
        showDriverAndMechanics(car2);
        showDriverAndMechanics(car3);
        showDriverAndMechanics(car4);

        showDriverAndMechanics(truck1);
        showDriverAndMechanics(truck2);
        showDriverAndMechanics(truck3);
        showDriverAndMechanics(truck4);

        showDriverAndMechanics(bus1);
        showDriverAndMechanics(bus2);
        showDriverAndMechanics(bus3);
        showDriverAndMechanics(bus4);

        System.out.println();

        List<Transport> transport = new ArrayList<>();
        transport.add(car1);
        transport.add(car2);
        transport.add(car3);
        transport.add(car4);
        transport.add(truck1);
        transport.add(truck2);
        transport.add(truck3);
        transport.add(truck4);
        transport.add(bus1);
        transport.add(bus2);
        transport.add(bus3);
        transport.add(bus4);

        System.out.println(transport);

        ServiceStation serviceStationForCar = new ServiceStation();
        ServiceStation serviceStationForTruck = new ServiceStation();

        serviceStationForCar.addIntoQueue(car1);
        serviceStationForCar.addIntoQueue(car2);
        serviceStationForCar.addIntoQueue(car3);
        serviceStationForCar.addIntoQueue(car4);

        serviceStationForTruck.addIntoQueue(truck1);
        serviceStationForTruck.addIntoQueue(truck2);
        serviceStationForTruck.addIntoQueue(truck3);
        serviceStationForTruck.addIntoQueue(truck4);

        serviceStationForCar.doDiagnostic();
        serviceStationForTruck.doDiagnostic();

        showInfo(driverB, driverC, driverD, car1, car2, truck1, truck2, bus1, bus2);
        showInfo(driverB, driverC, driverD, car3, car4, truck3, truck4, bus3, bus4);

        System.out.println();

        driverB.fillCar();
        driverB.start();
        car1.start();

        System.out.println();

        driverC.fillCar();
        driverC.start();
        truck1.start();

        System.out.println();

        driverD.fillCar();
        driverD.start();
        bus1.start();

        System.out.println();

        car1.pitStop();
        truck1.pitStop();
        bus1.pitStop();

        System.out.println();

        car1.stop();
        driverB.stop();

        System.out.println();

        truck1.stop();
        driverC.stop();

        System.out.println();

        bus1.stop();
        driverD.stop();

        System.out.println();

        car1.bestTimeOfCircle();
        truck1.bestTimeOfCircle();
        bus1.bestTimeOfCircle();

        System.out.println();

        car1.maxSpeed();
        truck1.maxSpeed();
        bus1.maxSpeed();

        System.out.println();
    }

    public static void showDriverAndMechanics(Transport transport) {
        System.out.println("Водитель авто " +
                transport.getBrand() +
                " " + transport.getModel() +
                ": " + transport.getDriver().getName() +
                ", механик(и): " + transport.getPerson());
    }

    private static void showInfo(DriverB driverB, DriverC driverC, DriverD driverD, Car car1, Car car2, Truck truck1, Truck truck2, Bus bus1, Bus bus2) {
        System.out.println();
        System.out.println("Водитель с категорией B " + driverB + " управляет автомобилем " + car1 + " и будет учавствовать в заезде");
        System.out.println("Водитель с категорией C " + driverC + " управляет автомобилем " + truck1 + " и будет учавствовать в заезде");
        System.out.println("Водитель с категорией D " + driverD + " управляет автомобилем " + bus1 + " и будет учавствовать в заезде");
        System.out.println();
        System.out.println("Водитель с категорией B " + driverB + " управляет автомобилем " + car2 + " и будет учавствовать в заезде");
        System.out.println("Водитель с категорией C " + driverC + " управляет автомобилем " + truck2 + " и будет учавствовать в заезде");
        System.out.println("Водитель с категорией D " + driverD + " управляет автомобилем " + bus2 + " и будет учавствовать в заезде");
    }
}