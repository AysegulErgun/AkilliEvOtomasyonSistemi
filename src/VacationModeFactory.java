//Abstract Factory: Concrete Factories
public class VacationModeFactory implements HomeModeFactory {
    @Override
    public Light createLight() {
        return new NightLight();
    }

    @Override
    public Thermostat createThermostat() {
        return new VacationThermostat();
    }

    @Override
    public SecuritySystem createSecuritySystem() {
        return new AdvancedSecurity();
    }
}
