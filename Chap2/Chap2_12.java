import java.util.*;

public class Chap2_12 {

	public static void main(String[] args) {
		
		System.out.print("연산>> ");
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		String operator = sc.next();
		double b = sc.nextDouble();
		
		double result;
		if (operator.equals("+")) {
			result = a+b;
			System.out.println(a+" "+operator+" "+b+"의 계산 결과는 "+result);
		}else if(operator.equals("-")) {
			result = a-b;
			System.out.println(a+" "+operator+" "+b+"의 계산 결과는 "+result);
		}else if(operator.equals("/")) {
			if (b != 0) {
				result = a/b;
				System.out.println(a+" "+operator+" "+b+"의 계산 결과는 "+result);
			}else {
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}else if(operator.equals("*")) {
			result = a*b;
			System.out.println(a+" "+operator+" "+b+"의 계산 결과는 "+result);
		}
	}

}
