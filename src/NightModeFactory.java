//Abstract Factory: Concrete Factories
public class NightModeFactory implements HomeModeFactory {
    @Override
    public Light createLight() {
        return new NightLight();
    }

    @Override
    public Thermostat createThermostat() {
        return new HomeThermostat();
    }

    @Override
    public SecuritySystem createSecuritySystem() {
        return new AdvancedSecurity();
    }
}
