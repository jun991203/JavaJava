// Chap4. �ǽ����� 8��
import java.util.*;
class Phone{
	private String name, tel;
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
}

class PhoneBook{
	int num;
	Phone book [];
	Scanner sc = new Scanner(System.in);
	public PhoneBook(int num) {
		this.book = new Phone[num];
		for(int i=0; i<num; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� ��ĭ���� �Է�)>> ");
			String name = sc.next();
			String tel = sc.next();
			book[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");
	}
	public void findPerson(String name) {
		boolean check = false;
		for(int i=0; i<this.book.length; i++) {
			if(book[i].getName().equals(name)) {
				System.out.println(name+"�� ��ȣ�� "+book[i].getTel()+" �Դϴ�.");
				check = true;
			}
		}
		if(check == false) {
			System.out.println(name+" �� �����ϴ�.");
		}
	}
	
}

public class chap4_08{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ο���>> ");
		int num = scanner.nextInt();
		
		PhoneBook pb = new PhoneBook(num);
		while(true) {
			System.out.print("�˻��� �̸�>> ");
			String name = scanner.next();
			if(name.equals("�׸�")) break;
			else pb.findPerson(name);
		}
		
		scanner.close();
	}
}