import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;
import behaviours.*;

public class DriverTest {

  Driver driver;
  QuadBike quadbike;

  @Before
  public void before() {
    quadbike = new QuadBike (10, "500cc");
    driver = new Driver("Tom", quadbike);
  }

  @Test
  public void driverHasName() {
    assertEquals("Tom", driver.getName());
  }

  @Test 
  public void driverHasVehicle(){
    assertEquals(quadbike, driver.getVehicle());
  }


}