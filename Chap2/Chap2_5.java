import java.util.Scanner;
import java.util.*;

public class Chap2_5 {

	public static void main(String[] args) {
		
		System.out.print("���� 3���� �Է��Ͻÿ�>>");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// �ִ밪 ���ϱ�
		int max = a, remain = b+c;
		if(b>max) {
			max = b;
			remain = a+c;
		}
		if(c>max) {
			max = c;
			remain = a+b;
		}
		
		// �ﰢ�� ���ǹ�
		if(max<remain) {
			System.out.println("�ﰢ���� �˴ϴ�");
		}else {
			System.out.println("�ﰢ���� �ȵ˴ϴ�");
		}
	}

}
