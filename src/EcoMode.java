public class EcoMode implements EnergyStrategy{
    @Override
    public void execute() {
       System.out.println("Energy Strategy: Eco mode activated. Saving energy.");
    }
}
