import java.util.*;
public class Chap3_3 {

	public static void main(String[] args) {
		
		System.out.print("정수를 입력하시오>> ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=num;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
