//1. Abstract Factory
// Concrete Products
public class VacationThermostat implements Thermostat{
    @Override
    public void setTemperature(int temperature) {
        System.out.println("Vacation mode: Thermostat set to"+temperature+"°C.");
    }
}
