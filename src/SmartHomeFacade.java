//3. Facade: Akıllı Ev Kontrolü
class SmartHomeFacade {
    private Light light;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private EnergyStrategy energyStrategy;

    public SmartHomeFacade(HomeModeFactory factory) {
        this.light = factory.createLight();
        this.thermostat = factory.createThermostat();
        this.securitySystem = factory.createSecuritySystem();
    }

    public void setEnergyStrategy(EnergyStrategy strategy) {
        this.energyStrategy = strategy;
    }

    public void activateMode() {
        light.turnOn();
        thermostat.setTemperature(22);
        securitySystem.activate();
        if (energyStrategy != null) {
            energyStrategy.execute();
        }
    }

    public void deactivateMode() {
        light.turnOff();
        securitySystem.deactivate();
    }
}