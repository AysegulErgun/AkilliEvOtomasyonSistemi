//1. Abstract Factory
// Concrete Products
public class HomeThermostat implements Thermostat{
    @Override
    public void setTemperature(int temperature) {
        System.out.println("Home mode: Thermostat set to"+temperature+"°C.");
    }
}
