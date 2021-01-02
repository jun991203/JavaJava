import java.util.*;

public class Chap2_7 {

	public static void main(String[] args) {
		
		System.out.print("점 (x,y)의 좌표를 입력하시오>> ");
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int left_up_x = 100;
		int left_up_y = 100;
		
		int right_down_x = 200;
		int right_down_y = 200;
		
		boolean x_isIn = false;
		boolean y_isIn = false;
		
		if(x>=left_up_x && x<=right_down_x) {
			x_isIn = true;
		}
		
		if(y>=left_up_y && y<=right_down_y) {
			y_isIn = true;
		}
		
		if(x_isIn == true && y_isIn == true) {
			System.out.println("("+x+","+y+")는 사각형 안에 있습니다.");
		}else {
			System.out.println("해당 좌표는 사각형 안에 없습니다.");
		}

	}

}
