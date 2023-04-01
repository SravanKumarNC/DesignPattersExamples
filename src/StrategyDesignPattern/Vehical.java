package StrategyDesignPattern;

public class Vehical {

    DriveStrategy driveObject;

    public Vehical(DriveStrategy driveObject){
        this.driveObject = driveObject;
    }

    public void drive(){
        driveObject.drive();
    }
}
