import java.util.*;

public class Chap2_12 {

	public static void main(String[] args) {
		
		System.out.print("����>> ");
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		String operator = sc.next();
		double b = sc.nextDouble();
		
		double result;
		if (operator.equals("+")) {
			result = a+b;
			System.out.println(a+" "+operator+" "+b+"�� ��� ����� "+result);
		}else if(operator.equals("-")) {
			result = a-b;
			System.out.println(a+" "+operator+" "+b+"�� ��� ����� "+result);
		}else if(operator.equals("/")) {
			if (b != 0) {
				result = a/b;
				System.out.println(a+" "+operator+" "+b+"�� ��� ����� "+result);
			}else {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
		}else if(operator.equals("*")) {
			result = a*b;
			System.out.println(a+" "+operator+" "+b+"�� ��� ����� "+result);
		}
	}

}
