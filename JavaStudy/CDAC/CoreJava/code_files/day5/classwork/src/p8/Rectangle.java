package p8;

public class Rectangle extends Point implements Computable {
	private double width, height;

	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle " + super.toString() + "[width=" + width + ", height=" + height + "]";
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public double calcPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}

}
