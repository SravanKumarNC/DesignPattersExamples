package StrategyDesignPattern.strategy;

public class OffRoadDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Off Road Drive Capability");
    }
}
