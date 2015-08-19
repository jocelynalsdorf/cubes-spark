public class Cube{
//all rectangle methods and vars will be available to cube now
Rectangle mFace;

	public Cube(Rectangle rectangle) {
		mFace = rectangle;
	}

	public int volume() {
		//can call rectangle methods as long as you callit on the rectangle instance object
		int length = mFace.getLength();
		return length * length * length;
	}

	public int surfaceArea() {
		return mFace.area() * 6;
	}
}