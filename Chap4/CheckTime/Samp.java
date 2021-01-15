
// 199pg. CheckTime 01
public class Samp {
	
	int id;
	// 생성자는 리턴 타입을 지정할 수 없음
	// 리턴 값이 없다고 해서 void를 리턴 타입으로 지정하면 안됨
	public Samp(int x) {
		this.id = x;
	}
	public Samp() {
		this(0);	// 반드시 생성자의 첫번째 문장이 되어야 함
		System.out.println("생성자 호출");
	}

}
