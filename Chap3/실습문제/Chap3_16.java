import java.util.*;
public class Chap3_16 {

	public static void main(String[] args) {
		
		String game [] = {"����", "����", "��"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���������� ������ �մϴ�.");
		
		while(true) {
			System.out.print("���� ���� ��!>> ");
			String user = sc.next();
			
			if(user.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}
			
			int n = (int)(Math.random()*3);
			String now = game[n];
			
			System.out.print("����� = "+user+", ��ǻ�� = "+now);
			if(user.equals(now)) {
				System.out.println(", �����ϴ�.");
			}else if(user.equals("����")) {
				if(now.equals("����")) System.out.println(", ��ǻ�Ͱ� �̰���ϴ�.");
				if(now.equals("��")) System.out.println(", ����ڰ� �̰���ϴ�.");
			}else if(user.equals("����")) {
				if(now.equals("��")) System.out.println(", ��ǻ�Ͱ� �̰���ϴ�.");
				if(now.equals("����")) System.out.println(", ����ڰ� �̰���ϴ�.");
			}else if(user.equals("��")) {
				if(now.equals("����")) System.out.println(", ��ǻ�Ͱ� �̰���ϴ�.");
				if(now.equals("����")) System.out.println(", ����ڰ� �̰���ϴ�.");
			}
			
			
		}

	}

}
