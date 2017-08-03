package driver_management;
import behaviours.*;

public class Driver{

    private String name;
    private Driveable vehicle;

  public Driver(String name, Driveable vehicle) {
    this.name = name;
    this.vehicle = vehicle;
  }

  public String getName(){
    return this.name;
  }

  public Driveable getVehicle(){
    return this.vehicle;
  }

  public void driveTime(int distance) {
     this.vehicle.driveTime(distance);
  }

  public void changeVechicle (Driveable vehicle) {
     this.vehicle = vehicle;
  }
}