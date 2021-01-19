// Chap4. �ǽ����� 12��
import java.util.*;

class Seat{
	String seats[] = new String[10];
	String rank;
	public Seat(String rank) {
		for(int i=0; i<10; i++) {
			seats[i] = "---";
		}
		this.rank = rank;
	}
	public boolean reserve(int num, String name) {
		if(num>=1 && num<=10) {
			seats[num-1] = name;
			return true;
		}
		System.out.println("�ش��ϴ� �¼���ȣ�� �������� �ʽ��ϴ�.");
		return false;
	}
	public void inquiry() {
		System.out.print(rank+">> ");
		for(int i=0; i<10; i++) {
			System.out.print(seats[i]+" ");
		}
		System.out.println();
	}
	public boolean cancel(String name) {
		for(int i=0; i<10; i++) {
			if(seats[i].equals(name)) {
				seats[i] = "---";
				return true;
			}
		}
		System.out.println("�ش��ϴ� �̸��� �������� �ʽ��ϴ�.");
		return false;
	}
}

class MenuProgram{
	Scanner sc = new Scanner(System.in);
	Seat S = new Seat("S");
	Seat A = new Seat("A");
	Seat B = new Seat("B");
	public boolean reserve() {
		System.out.print("�¼����� S(1), A(2), B(3)>> ");
		int s = sc.nextInt();
		if(s == 1) {
			S.inquiry();
			System.out.print("�̸�>> ");
			String name = sc.next();
			System.out.print("��ȣ>> ");
			int seatNum = sc.nextInt();
			if(!S.reserve(seatNum, name)) return false;
			return true;
		}
		else if(s == 2) {
			A.inquiry();
			System.out.print("�̸�>> ");
			String name = sc.next();
			System.out.print("��ȣ>> ");
			int seatNum = sc.nextInt();
			if(!A.reserve(seatNum, name)) return false;
			return true;
		}
		else if(s == 3) {
			B.inquiry();
			System.out.print("�̸�>> ");
			String name = sc.next();
			System.out.print("��ȣ>> ");
			int seatNum = sc.nextInt();
			if(!B.reserve(seatNum, name)) return false;
			return true;
		}
		else {
			System.out.println("�ش��ϴ� �¼��� �������� �ʽ��ϴ�.");
			return false;
		}
	}
	
	public void inquiry() {
		S.inquiry();
		A.inquiry();
		B.inquiry();
		System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}
	
	public boolean cancel() {
		System.out.print("�¼����� S(1), A(2), B(3)>> ");
		int s = sc.nextInt();
		if(s==1) {
			S.inquiry();
			System.out.print("�̸�>> ");
			String name = sc.next();
			if(!S.cancel(name)) return false;
			return true;
		}else if(s==2) {
			A.inquiry();
			System.out.print("�̸�>> ");
			String name = sc.next();
			if(!A.cancel(name)) return false;
			return true;
		}else if(s==3) {
			B.inquiry();
			System.out.print("�̸�>> ");
			String name = sc.next();
			if(!B.cancel(name)) return false;
			return true;
		}else {
			System.out.println("�ش��ϴ� �¼��� �������� �ʽ��ϴ�.");
			return false;
		}
	}
	
}


public class ReservationSystem {
	MenuProgram menu = new MenuProgram();
	Scanner sc = new Scanner(System.in);
	public void start() {
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		while(true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4 >> ");
			int m = sc.nextInt();
			if(m == 1) {
				if(!menu.reserve()) {
					System.out.println("�ٽ� ������ �����մϴ�.");
					menu.reserve();
				}
			}else if(m == 2) {
				menu.inquiry();
			}else if(m == 3) {
				if(!menu.cancel()) {
					System.out.println("�ٽ� ��Ҹ� �����մϴ�.");
					menu.cancel();
				}
			}else if(m == 4) {
				break;
			}else {
				System.out.println("�޴��� �ٽ� �����Ͻʽÿ�.");
			}
		}
	}
	
	public static void main(String[] args) {
		ReservationSystem rs = new ReservationSystem();
		rs.start();

	}

}
