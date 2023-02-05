package servicies;

import exceptions.TransportTypeException;
import transport.Transport;

public class Mechanics {
    private String name;
    private String company;

    public Mechanics(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public void doDiagnostic(Transport transport) throws TransportTypeException {
        transport.diagnoseVehicle();
    }

    public void repairCar(Transport transport) {
        System.out.println("починить машину " + transport);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return name + '\'' + company + '\'';
    }
}
