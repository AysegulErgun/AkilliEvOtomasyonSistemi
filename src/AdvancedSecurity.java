//1. Abstract Factory
// Concrete Products
public class AdvancedSecurity implements SecuritySystem{
    @Override
    public void activate() {
        System.out.println("Advanced security system activated with cameras");
    }

    @Override
    public void deactivate() {
        System.out.println("Advanced security system deactivated");
    }
}
