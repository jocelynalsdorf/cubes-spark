import org.junit.*;
import static org.junit.Assert.*;

public class CubeTest {

	@Test
	public void volume_determinesTheVolumeOfTheCube_int() {
		Rectangle testRectangle = new Rectangle(30,30);
		Cube testCube = new Cube(testRectangle);
		assertEquals(27000, testCube.volume());
	}

	@Test
	public void surfaceArea_DeterminesSurfaceAreaOfCube_int() {
		Rectangle testRectangle = new Rectangle(30,30);
		Cube testCube = new Cube(testRectangle);
		assertEquals(5400, testCube.surfaceArea());
	}

}