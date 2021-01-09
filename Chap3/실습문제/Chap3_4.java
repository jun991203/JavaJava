import java.util.*;
public class Chap3_4 {

	public static void main(String[] args) {
		
		System.out.print("소문자 알파벳 하나를 입력하시오>> ");
		
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
