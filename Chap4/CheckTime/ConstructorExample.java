
// 199pg. CheckTime 01
public class ConstructorExample {
	int x;
	public void setX(int x) {this.x = x;}
	public int getX() {return x;}
	public ConstructorExample(int x) {
		this.x = x;
	}
	public static void main(String[] args) {
		
		// ConstructorExample a = new ConstructorExample();
		// 이미 생성자가 선언된 경우, 기본 생성자를 불러올 수 없음
		ConstructorExample a = new ConstructorExample(1);
		int n = a.getX();
	}

}
