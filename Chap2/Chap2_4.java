import java.util.*;

public class Chap2_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 3개 입력>>");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int mid;
		
		if(a>=b) {
			if(b>=c) {
				mid = b;
			}else {
				// c>b and a>=b
				if(a>=c) {
					mid = c;
				}else {
					mid = a;
				}
			}
		}else {
			// b>a
			if(b<c) {
				mid = b;
			}else {
				// b>a and b>=c
				if(a>=c) {
					mid = a;
				}else {
					mid = c;
				}
			}
		}
		
		System.out.println("중간 값은 "+mid);
	}

}
