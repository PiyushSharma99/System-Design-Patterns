import Strategy.DriveStrategy;
import Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
