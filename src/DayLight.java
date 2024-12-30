public class DayLight implements Light{
    @Override
    public void turnOn() {
        System.out.println("Daylight: Lights turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Daylight: Lights turned off.");
    }
}
