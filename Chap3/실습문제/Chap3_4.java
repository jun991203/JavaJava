import java.util.*;
public class Chap3_4 {

	public static void main(String[] args) {
		
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>> ");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c = s.charAt(0);
		
		for(int i=c-'a'; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)('a'+j));
			}
			System.out.println();
		}
		
	}

}
