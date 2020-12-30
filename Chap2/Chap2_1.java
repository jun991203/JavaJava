import java.util.*;

public class Chap2_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원)>>");
		int money = sc.nextInt();
		
		// 입력 받은 값 계산 후, double형으로 변환
		double dollar = money/1100;
		System.out.println(money+"은 $"+dollar+"입니다.");
	}

}
