// Chap4. �ǽ����� 2��
import java.util.*;
public class Grade {
	int math, science, english;
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	public double average() {
		return (this.math+this.science+this.english)/3;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>> ");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("����� "+me.average());
		
		scanner.close();
		
	}

}
