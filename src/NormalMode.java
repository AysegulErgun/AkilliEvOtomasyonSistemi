// Strategy: Concrete Strategies
public class NormalMode implements EnergyStrategy{
    @Override
    public void execute() {
        System.out.println("Energy Strategy: Normal mode activated.");
    }
}
