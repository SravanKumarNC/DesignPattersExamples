package StrategyDesignPattern;

import StrategyDesignPattern.strategy.NormalDriveStrategy;

public class OffRoadVehical extends Vehical{

    public OffRoadVehical() {
        super(new NormalDriveStrategy.SportsDriveStrategy());
    }
}
