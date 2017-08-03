package driver_management;
import behaviours.*;

public class QuadBike extends Vehicle implements Driveable {

  public int averageSpeed;
  private String engineCapacity;

  public QuadBike(int averageSpeed, String engineCapacity) {
    super(averageSpeed);
    this.engineCapacity = engineCapacity;
  }




}