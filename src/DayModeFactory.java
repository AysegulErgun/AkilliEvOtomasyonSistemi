//Abstract Factory: Concrete Factories
public class DayModeFactory implements HomeModeFactory{
    @Override
    public Light createLight() {
        return new DayLight();
    }

    @Override
    public Thermostat createThermostat() {
        return new HomeThermostat();
    }

    @Override
    public SecuritySystem createSecuritySystem() {
        return new BasicSecurity();
    }
}
