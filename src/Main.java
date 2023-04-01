import StrategyDesignPattern.SportsVehical;
import StrategyDesignPattern.Vehical;

public class Main {
    public static void main(String[] args) {
        Vehical vehical = new SportsVehical();

        vehical.drive();
    }
}