import java.util.*;

public class Chap2_11 {

	public static void main(String[] args) {

		System.out.print("���� �Է��ϼ���(1~12) >> ");
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		
		if(month==12 || month==1 || month==2) {
			System.out.println("�ܿ�");
		}else if(month>=3 && month<=5) {
			System.out.println("��");
		}else if(month>=6 && month<=8) {
			System.out.println("����");
		}else if(month>=9 && month<=11) {
			System.out.println("����");
		}else {
			System.out.println("�߸��Է�");
		}

	}

}
