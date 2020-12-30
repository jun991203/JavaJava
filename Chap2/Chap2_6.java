import java.util.*;

public class Chap2_6 {
	
	public static void main(String[] args) {
		
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int dec = num/10;
		int remain = num%10;
		
		if(dec%3==0 && remain%3==0) {
			System.out.println("박수짝짝");
		}else if(dec%3==0 || remain%3==0) {
			System.out.println("박수짝");
		}
	}
}
