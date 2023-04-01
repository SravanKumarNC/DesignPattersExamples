package StrategyDesignPattern;

public class GoodsVehical extends Vehical{

    public GoodsVehical() {
        super(new NormalDriveStrategy());
    }
}
