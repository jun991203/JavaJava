import java.util.*;

public class Chap2_9 {

	public static void main(String[] args) {
		
		System.out.print("원의 중심과 반지름 입력>> ");
		
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double radius = sc.nextDouble();
		
		System.out.print("점 입력>> ");
		double pointX = sc.nextDouble();
		double pointY = sc.nextDouble();
		
		double distance = Math.sqrt(Math.pow(pointX-x, 2) + Math.pow(pointY-y, 2));
		
		if(distance > radius) {
			System.out.println("점 ("+pointX+","+pointY+")는 원 밖에 있다.");
		}else {
			System.out.println("점 ("+pointX+","+pointY+")는 원 안에 있다.");
		}

	}

}
