package StrategyDesignPattern;

import StrategyDesignPattern.strategy.NormalDriveStrategy;

public class SportsVehical extends Vehical{

    public SportsVehical() {
        super(new NormalDriveStrategy.SportsDriveStrategy());
    }
}
