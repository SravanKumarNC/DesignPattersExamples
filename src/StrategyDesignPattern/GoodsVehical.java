package StrategyDesignPattern;

import StrategyDesignPattern.strategy.NormalDriveStrategy;

public class GoodsVehical extends Vehical{

    public GoodsVehical() {
        super(new NormalDriveStrategy());
    }
}
