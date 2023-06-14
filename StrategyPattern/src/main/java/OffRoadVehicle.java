import Strategy.DriveStrategy;
import Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
