import java.util.*;

public class Chap2_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int num = sc.nextInt();
		
		int ten = num/10;
		int remainder = num%10;
		
		if(ten == remainder) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}else {
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
		}
	}

}
