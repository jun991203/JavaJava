import java.util.*;

public class Chap2_8 {

	public static void main(String[] args) {
		
		System.out.print("�� (x1, y1)�� (x2, y2)�� ��ǥ�� �Է��Ͻÿ�>> ");
		
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		boolean result1 = inRect(x1, y1, 100, 100, 200, 200);
		boolean result2 = inRect(x2, y2, 100, 100, 200, 200);
		
		if(result1==true || result2==true) {
			System.out.println("���ο� ���簢���� ������ ���簢���� �浹�մϴ�.");
		}else {
			System.out.println("���ο� ���簢���� ������ ���簢���� �浹���� �ʽ��ϴ�.");
		}
				
	}
	
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2)) {
			return true;
		}else {
			return false;
		}
	}

}
