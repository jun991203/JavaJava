import java.util.*;

public class Chap2_8 {

	public static void main(String[] args) {
		
		System.out.print("점 (x1, y1)과 (x2, y2)의 좌표를 입력하시오>> ");
		
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		boolean result1 = inRect(x1, y1, 100, 100, 200, 200);
		boolean result2 = inRect(x2, y2, 100, 100, 200, 200);
		
		if(result1==true || result2==true) {
			System.out.println("새로운 직사각형과 이전의 직사각형은 충돌합니다.");
		}else {
			System.out.println("새로운 직사각형과 이전의 직사각형은 충돌하지 않습니다.");
		}
				
	}
	
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2)) {
			return true;
		}else {
			return false;
		}
	}

}
