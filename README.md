# System-Design-Patterns

## Strategy Design Pattern

In the Strategy Design pattern we create strategy so that child classes do not have to repeat logics and codes.

### Conditions to apply this pattern

There is a parent class which has an IS-A relationship with child classes.
Suppose there is a parent class “Vehicle”. It has 3 child classes PassengerVehicle , OffRoadVehicle and SportyVehicle.
Passenger vehicles just need the drive capability which is present in Vehicle class .
OffRoadVehicle and SportyVehicle classes need special drive capabilities. They both need the same special drive capabilities. Both classes have the same code implemented in their own classes.
This situation leads to code duplication and it's not scalable. So we must implement the below solution of Strategy Design Pattern.

### Solution

In order to avoid code duplication in child classes we will implement an interface “DriveStrategy” which will have a “HAS-A” relationship with the parent class “Vehicle”.

2 classes will implement DriveStrategy interface. NormalDriveStrategy and SportsDriveStrategy.

In the parent class “Vehicle” we will have constructor injection where we will pass the type of object which child classes want to create. Refer below the class diagram of the system.

![alt text](https://github.com/PiyushSharma99/System-Design-Patterns/blob/main/StrategyPattern/StrategyDesign.png)








