import java.util.*;

public class Chap2_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(10~99)>>");
		int num = sc.nextInt();
		
		int ten = num/10;
		int remainder = num%10;
		
		if(ten == remainder) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}else {
			System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
		}
	}

}
