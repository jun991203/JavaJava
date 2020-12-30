import java.util.Scanner;
import java.util.*;

public class Chap2_5 {

	public static void main(String[] args) {
		
		System.out.print("정수 3개를 입력하시오>>");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// 최대값 구하기
		int max = a, remain = b+c;
		if(b>max) {
			max = b;
			remain = a+c;
		}
		if(c>max) {
			max = c;
			remain = a+b;
		}
		
		// 삼각형 조건문
		if(max<remain) {
			System.out.println("삼각형이 됩니다");
		}else {
			System.out.println("삼각형이 안됩니다");
		}
	}

}
