// Chap4. 실습문제 7번
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
		System.out.print("날짜(1~30)? ");
		int date = sc.nextInt();
		System.out.print("할일(빈칸없이 입력)? ");
		String work = sc.next();
		schedule[date-1].set(work);
	}
	public void view() {
		System.out.print("날짜(1~30)? ");
		int date = sc.nextInt();
		System.out.print(date+"일의 할 일은 ");
		this.schedule[date-1].show();
	}
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
	}
	public void run() {
		System.out.println("이번달 스케쥴 관리 프로그램.");
		while(true){
			System.out.print("할일(입력:1, 보기:2, 끝내기:3) >> ");
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
