package StrategyDesignPattern;

public class SportsVehical extends Vehical{

    public SportsVehical() {
        super(new SportsDriveStrategy());
    }
}
