class PositivePoint extends Point{
	public PositivePoint() {
		super(0, 0);
	}
	public PositivePoint(int x, int y) {
		super(x, y);
		if(x<0 && y<0) super.move(0, 0);
		else if(x<0) super.move(0, y);
		else if(y<0) super.move(x, 0);
	}
	@Override
	protected void move(int x, int y) { 
		if(x<0 || y<0) return;
		else {
			super.move(x, y);
		}
	}
	public String toString() {
		return "("+super.getX()+","+super.getY()+")의 점";
	}
}

public class Ch5_08 {
	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString()+"입니다.");
		
		p.move(-5, 5);
		System.out.println(p.toString()+"입니다.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString()+"입니다.");

	}

}
