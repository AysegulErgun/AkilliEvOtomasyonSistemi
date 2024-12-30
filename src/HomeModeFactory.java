// Abstract Factory
public interface HomeModeFactory {
    Light createLight();
    Thermostat createThermostat();
    SecuritySystem createSecuritySystem();
}
