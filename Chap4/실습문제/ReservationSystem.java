// Chap4. 실습문제 12번
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
		System.out.println("해당하는 좌석번호는 존재하지 않습니다.");
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
		System.out.println("해당하는 이름은 존재하지 않습니다.");
		return false;
	}
}

class MenuProgram{
	Scanner sc = new Scanner(System.in);
	Seat S = new Seat("S");
	Seat A = new Seat("A");
	Seat B = new Seat("B");
	public boolean reserve() {
		System.out.print("좌석구분 S(1), A(2), B(3)>> ");
		int s = sc.nextInt();
		if(s == 1) {
			S.inquiry();
			System.out.print("이름>> ");
			String name = sc.next();
			System.out.print("번호>> ");
			int seatNum = sc.nextInt();
			if(!S.reserve(seatNum, name)) return false;
			return true;
		}
		else if(s == 2) {
			A.inquiry();
			System.out.print("이름>> ");
			String name = sc.next();
			System.out.print("번호>> ");
			int seatNum = sc.nextInt();
			if(!A.reserve(seatNum, name)) return false;
			return true;
		}
		else if(s == 3) {
			B.inquiry();
			System.out.print("이름>> ");
			String name = sc.next();
			System.out.print("번호>> ");
			int seatNum = sc.nextInt();
			if(!B.reserve(seatNum, name)) return false;
			return true;
		}
		else {
			System.out.println("해당하는 좌석은 존재하지 않습니다.");
			return false;
		}
	}
	
	public void inquiry() {
		S.inquiry();
		A.inquiry();
		B.inquiry();
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	
	public boolean cancel() {
		System.out.print("좌석구분 S(1), A(2), B(3)>> ");
		int s = sc.nextInt();
		if(s==1) {
			S.inquiry();
			System.out.print("이름>> ");
			String name = sc.next();
			if(!S.cancel(name)) return false;
			return true;
		}else if(s==2) {
			A.inquiry();
			System.out.print("이름>> ");
			String name = sc.next();
			if(!A.cancel(name)) return false;
			return true;
		}else if(s==3) {
			B.inquiry();
			System.out.print("이름>> ");
			String name = sc.next();
			if(!B.cancel(name)) return false;
			return true;
		}else {
			System.out.println("해당하는 좌석은 존재하지 않습니다.");
			return false;
		}
	}
	
}


public class ReservationSystem {
	MenuProgram menu = new MenuProgram();
	Scanner sc = new Scanner(System.in);
	public void start() {
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
			int m = sc.nextInt();
			if(m == 1) {
				if(!menu.reserve()) {
					System.out.println("다시 예약을 진행합니다.");
					menu.reserve();
				}
			}else if(m == 2) {
				menu.inquiry();
			}else if(m == 3) {
				if(!menu.cancel()) {
					System.out.println("다시 취소를 진행합니다.");
					menu.cancel();
				}
			}else if(m == 4) {
				break;
			}else {
				System.out.println("메뉴를 다시 선택하십시오.");
			}
		}
	}
	
	public static void main(String[] args) {
		ReservationSystem rs = new ReservationSystem();
		rs.start();

	}

}
