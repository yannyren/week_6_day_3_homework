package driver_management;

public class Vehicle {

  public int averageSpeed;

  public Vehicle (int averageSpeed){
    this.averageSpeed = averageSpeed;
  }

  public int driveTime(int distance) {
    return distance/this.averageSpeed;
  }
}