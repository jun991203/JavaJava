// Chap4. �ǽ����� 5, 6��
public class Circle {
	private double x, y;
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
	
	// ���� 6
	public int getRadius() {
		return this.radius;
	}
	public double getX() {
		return this.x;
	}
	public double getY() {
		return this.y;
	}
}


