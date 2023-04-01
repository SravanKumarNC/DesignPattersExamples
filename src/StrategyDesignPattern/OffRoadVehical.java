package StrategyDesignPattern;

public class OffRoadVehical extends Vehical{

    public OffRoadVehical() {
        super(new SportsDriveStrategy());
    }
}
