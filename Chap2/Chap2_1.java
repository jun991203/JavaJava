import java.util.*;

public class Chap2_1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		int money = sc.nextInt();
		
		// �Է� ���� �� ��� ��, double������ ��ȯ
		double dollar = money/1100;
		System.out.println(money+"�� $"+dollar+"�Դϴ�.");
	}

}
