//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Gündüz Modu
        SmartHomeFacade home = new SmartHomeFacade(new DayModeFactory());
        home.setEnergyStrategy(new NormalMode());
        home.activateMode();
        home.deactivateMode();

        // Gece Modu
        home = new SmartHomeFacade(new NightModeFactory());
        home.setEnergyStrategy(new EcoMode());
        home.activateMode();
        home.deactivateMode();

        // Tatil Modu
        home = new SmartHomeFacade(new VacationModeFactory());
        home.setEnergyStrategy(new EcoMode());
        home.activateMode();
        home.deactivateMode();
    }
}