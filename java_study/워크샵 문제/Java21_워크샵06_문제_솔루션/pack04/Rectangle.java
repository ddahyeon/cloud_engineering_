package pack04;
public class Rectangle extends Shape implements Resize {
	public Rectangle() {
	}

	public Rectangle(int width, int height, String colors) {
		super(width, height, colors);
	}

	public double getArea() {
		return (double) getWidth() * getHeight();
	}

	public void setResize(int size) {
		setWidth(getWidth() + size);
	}
}
