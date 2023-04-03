package StrategyDesignPattern.strategy;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }

    public static class SportsDriveStrategy implements DriveStrategy{

        @Override
        public void drive() {
            System.out.println("Sport Drive Capability");
        }
    }
}
