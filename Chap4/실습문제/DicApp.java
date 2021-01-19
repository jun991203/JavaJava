// Chap4. �ǽ����� 10��
import java.util.*;

class Dictionary{
	private static String [] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String [] eng = {"love", "baby", "money", "future", "hope"};
	public static String kor2Eng(String word) {
		for(int i=0; i<kor.length; i++) {
			if(kor[i].equals(word)) {
				return eng[i];
			}
		}
		return "���� ������ �����ϴ�.";
	}
}

public class DicApp {
	Scanner sc = new Scanner(System.in);
	public void find() {
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		while(true) {
			System.out.print("�ѱ� �ܾ�? ");
			String word = sc.next();
			if(word.equals("�׸�")) break;
			else {
				String result = Dictionary.kor2Eng(word);
				System.out.println(word+"�� "+result);
			}
		}
	}
	public static void main(String[] args) {
		DicApp dic = new DicApp();
		dic.find();
	}

}
