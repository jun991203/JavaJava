// Chap4. 실습문제 5, 6번
import java.util.Scanner;

public class CircleManager {
	
	// 문제 6
	public void largestCircle(Circle c []) {
		int r = c[0].getRadius();
		int index = 0;
		for(int i=1; i<c.length; i++) {
			if(r<c[i].getRadius()) {
				r = c[i].getRadius();
				index = i;
			}
		}
		
		System.out.println("가장 면적이 큰 원은 ("+c[index].getX()+","+c[index].getY()+")"+c[index].getRadius());
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c [] = new Circle[3];
		for(int i=0; i<3; i++) {
			System.out.print("x, y, radius >> ");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int r = scanner.nextInt();
			c[i] = new Circle(x, y, r);
		}
		// for(int i=0; i<c.length; i++) c[i].show(); : 문제 5
		// 문제 6
		CircleManager cm = new CircleManager();
		cm.largestCircle(c);
		
		scanner.close();
	}
}