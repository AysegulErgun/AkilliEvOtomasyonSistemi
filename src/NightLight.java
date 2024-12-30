//1. Abstract Factory
// Concrete Products
public class NightLight implements Light{
    @Override
    public void turnOn() {
        System.out.println("Nightlight: Dimmed lights turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Nightlight: Dimmed lights turned off.");
    }
}
