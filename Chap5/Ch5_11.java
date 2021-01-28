import java.util.Scanner;
abstract class Calc{
	protected int a, b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	abstract int calculate();
}

class Add extends Calc{
	public Add(int a, int b) {
		super.setValue(a, b);
	}
	@Override
	int calculate() {
		return a+b;
	}
}

class Sub extends Calc{
	public Sub(int a, int b) {
		super.setValue(a, b);
	}
	@Override
	int calculate() {
		return a-b;
	}
}

class Mul extends Calc{
	public Mul(int a, int b) {
		super.setValue(a, b);
	}
	@Override
	int calculate() {
		return a*b;
	}
}

class Div extends Calc{
	public Div(int a, int b) {
		super.setValue(a, b);
	}
	@Override
	int calculate() {
		if(b==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return 0;
		}
		return a/b;
	}
}


public class Ch5_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		String c = sc.next();
		
		if(c.equals("+")) {
			Add add = new Add(a, b);
			System.out.println(add.calculate());
		}
		else if(c.equals("-")) {
			Sub sub = new Sub(a, b);
			System.out.println(sub.calculate());
		}
		else if(c.equals("*")) {
			Mul mul = new Mul(a, b);
			System.out.println(mul.calculate());
		}
		else if(c.equals("/")) {
			Div div = new Div(a, b);
			if(div.calculate() != 0)
				System.out.println(div.calculate());
		}

	}

}
