// Concrete Products
public class BasicSecurity implements SecuritySystem{
    @Override
    public void activate() {
        System.out.println("Basic security: Security system activated");
    }

    @Override
    public void deactivate() {
        System.out.println("Basic security: Security system deactivated");
    }
}
