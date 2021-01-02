import java.util.*;

public class Chap2_10 {

	public static void main(String[] args) {
		
		System.out.print("첫번째 원의 중심과 반지름 입력>> ");
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int rad1 = sc.nextInt();
		
		System.out.print("두번째 원의 중심과 반지름 입력>> ");
		
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int rad2 = sc.nextInt();
		
		double distance = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
		
		if(distance > rad1+rad2) {
			System.out.println("두 원은 겹치지 않는다.");
		}else {
			System.out.println("두 원은 서로 겹친다.");
		}

	}

}
