class Point{
	private int x, y;
	public Point(int x, int y) { this.x = x; this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	protected void move(int x, int y) { this.x = x; this.y = y; }
}

class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public ColorPoint(int x, int y) {
		super(x, y);
		this.color = "BLACK";
	}
	public ColorPoint() {
		super(0, 0);
		this.color = "BLACK";
	}
	public void setXY(int x, int y) { super.move(x, y); }
	public void setColor(String color) { this.color = color; }
	public String toString() {
		return (color+"���� ("+super.getX()+","+super.getY()+")�� ��");
	}
}

public class Ch5_05 {
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str+"�Դϴ�.");
	}

}
