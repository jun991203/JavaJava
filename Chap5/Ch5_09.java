import java.util.*;

interface Stack{
	int length();
	int capacity();
	String pop();
	boolean push(String val);
}

class StringStack implements Stack{
	private int size;
	private int top;
	String [] stack;
	public StringStack(int size) {
		this.size = size;
		this.top = this.size;
		stack = new String[size];
	}
	@Override
	public int length() {
		return size - top;
	}
	@Override
	public int capacity() {
		return size;
	}
	@Override
	public String pop() {
		int tmp = top;
		top++;
		return stack[tmp];
	}
	@Override
	public boolean push(String val) {
		if(top>0) {
			stack[top-1] = val;
			top--;
			return true;
		}else {
			return false;
		}
	}
}


public class Ch5_09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���ÿ� ���� ������ ũ�� �Է� >> ");
		int capacity = sc.nextInt();
		StringStack stack = new StringStack(capacity);
		while(true) {
			System.out.print("���ڿ� �Է� >> ");
			String val = sc.next();
			
			if(val.equals("�׸�")) {
				int len = stack.length();
				if(len == 0)
					System.out.println("���� ���ÿ� ����� ���ڿ��� �����ϴ�.");
				else {
					System.out.print("���ÿ� ����� ��� ���ڿ� �� : ");
					for(int i = 0; i<len;i++) {
						System.out.print(stack.pop()+" ");
					}
				}
				break;
			}
			else {
				if(!stack.push(val))
					System.out.println("������ �� ���� Ǫ�� �Ұ�!");
			}
		}
	}

}
