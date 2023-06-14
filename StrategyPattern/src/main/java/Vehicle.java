import Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    //this is known as constructor injection
    Vehicle(DriveStrategy driveObj){
        this.driveStrategy = driveObj;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
