import org.junit.*;
import static org.junit.Assert.*;

public class RectangleTest {

	@Test
	public void newRectangle_instantiatesNewRectangle() {
		Rectangle testRectangle = new Rectangle(5,7);
		assertEquals(true, testRectangle instanceof Rectangle);
	}

	@Test
	public void isSquare_ReturnsTrueWheNotSquare() {
		Rectangle testRectangle = new Rectangle(2,4);
		assertEquals(false, testRectangle.isSquare());
	}
}