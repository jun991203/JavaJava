// Chap4. 실습문제 10번
import java.util.*;

class Dictionary{
	private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(kor[i].equals(word)) {
				return eng[i];
			}
		}
		return "저의 사전에 없습니다.";
	}
}

public class DicApp {
	Scanner sc = new Scanner(System.in);
	public void find() {
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글 단어? ");
			String word = sc.next();
			if(word.equals("그만")) break;
			else {
				String result = Dictionary.kor2Eng(word);
				System.out.println(word+"은 "+result);
			}
		}
	}
	public static void main(String[] args) {
		DicApp dic = new DicApp();
		dic.find();
	}

}
