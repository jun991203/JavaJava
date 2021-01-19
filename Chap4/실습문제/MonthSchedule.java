// Chap4. �ǽ����� 7��
import java.util.*;
public class MonthSchedule {
	int date;
	Day schedule [];
	Scanner sc = new Scanner(System.in);
	public MonthSchedule(int date) {
		this.date = date;
		schedule = new Day[date];
		for(int i=0; i<schedule.length; i++) {
			this.schedule[i] = new Day();
		}
	}
	public void input() {
		System.out.print("��¥(1~30)? ");
		int date = sc.nextInt();
		System.out.print("����(��ĭ���� �Է�)? ");
		String work = sc.next();
		schedule[date-1].set(work);
	}
	public void view() {
		System.out.print("��¥(1~30)? ");
		int date = sc.nextInt();
		System.out.print(date+"���� �� ���� ");
		this.schedule[date-1].show();
	}
	public void finish() {
		System.out.println("���α׷��� �����մϴ�.");
	}
	public void run() {
		System.out.println("�̹��� ������ ���� ���α׷�.");
		while(true){
			System.out.print("����(�Է�:1, ����:2, ������:3) >> ");
			int mode = sc.nextInt();
			if(mode == 1) {
				input();
			}
			else if(mode == 2) {
				view();
			}
			else if(mode == 3) {
				finish();
				break;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}

}
