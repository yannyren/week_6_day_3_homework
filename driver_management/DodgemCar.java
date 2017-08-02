package driver_management;
import behaviours.*;

public class DodgemCar implements Driveable {

  private int averageSpeed;
  private int numSeat;

public DodgemCar(int averageSpeed, int numSeat) {
  this.averageSpeed = averageSpeed;
  this.numSeat = numSeat;

}

  public int driveTime(int distance) {
    return distance/this.averageSpeed;
  }


}