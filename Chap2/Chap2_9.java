import java.util.*;

public class Chap2_9 {

	public static void main(String[] args) {
		
		System.out.print("���� �߽ɰ� ������ �Է�>> ");
		
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double radius = sc.nextDouble();
		
		System.out.print("�� �Է�>> ");
		double pointX = sc.nextDouble();
		double pointY = sc.nextDouble();
		
		double distance = Math.sqrt(Math.pow(pointX-x, 2) + Math.pow(pointY-y, 2));
		
		if(distance > radius) {
			System.out.println("�� ("+pointX+","+pointY+")�� �� �ۿ� �ִ�.");
		}else {
			System.out.println("�� ("+pointX+","+pointY+")�� �� �ȿ� �ִ�.");
		}

	}

}
