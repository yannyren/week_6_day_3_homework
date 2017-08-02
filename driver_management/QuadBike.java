package driver_management;
import behaviours.*;

public class QuadBike implements Driveable {

  private int averageSpeed;
  private double engineCapacity;

  public QuadBike(int averageSpeed, double engineCapacity) {
    this.averageSpeed = averageSpeed;
    this.engineCapacity = engineCapacity;
  }

  public int driveTime(int distance) {
    return distance/this.averageSpeed;
  }



}