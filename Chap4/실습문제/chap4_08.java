// Chap4. 실습문제 8번
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
			System.out.print("이름과 전화번호(이름과 번호는 빈칸없이 입력)>> ");
			String name = sc.next();
			String tel = sc.next();
			book[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
	}
	public void findPerson(String name) {
		boolean check = false;
		for(int i=0; i<this.book.length; i++) {
			if(book[i].getName().equals(name)) {
				System.out.println(name+"의 번호는 "+book[i].getTel()+" 입니다.");
				check = true;
			}
		}
		if(check == false) {
			System.out.println(name+" 이 없습니다.");
		}
	}
	
}

public class chap4_08{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("인원수>> ");
		int num = scanner.nextInt();
		
		PhoneBook pb = new PhoneBook(num);
		while(true) {
			System.out.print("검색할 이름>> ");
			String name = scanner.next();
			if(name.equals("그만")) break;
			else pb.findPerson(name);
		}
		
		scanner.close();
	}
}