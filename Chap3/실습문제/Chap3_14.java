import java.util.*;
public class Chap3_14 {

	public static void main(String[] args) {
		
		String course [] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�" };
		int score [] = {95, 88, 76, 62, 55};
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� �̸�>> ");
			String name = sc.next();
			
			if(name.equals("�׸�")) break;
			
			int sub_score = 0;
			for(int i=0; i<course.length; i++) {
				if(course[i].equals(name)) {
					sub_score = score[i];
					System.out.println(name+"�� ������ "+sub_score);
				}
			}
			if(sub_score == 0) System.out.println("���� �����Դϴ�.");
			
		}
		
	}

}
