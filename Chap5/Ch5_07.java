class Point3D extends Point{
	int z;
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	public void moveUp() {
		z += 1;
	}
	public void moveDown() {
		z -= 1;
	}
	public void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	@Override
	public String toString() {
		return "("+super.getX()+","+super.getY()+","+z+")�� ��";
	}
}

public class Ch5_07 {
	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		System.out.println(p.toString()+"�Դϴ�.");
		
		p.moveUp();
		System.out.println(p.toString()+"�Դϴ�.");
		
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString()+"�Դϴ�.");
		
		p.move(100, 200, 300);
		System.out.println(p.toString()+"�Դϴ�.");
	}

}
