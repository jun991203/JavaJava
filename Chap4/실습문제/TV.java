// Chap4. 실습문제 1번
public class TV {
	String madeby;
	int year;
	int size;
	public TV(String made, int year, int size) {
		madeby = made;
		this.year = year;
		this.size = size;
	}
	public void show() {
		System.out.println(madeby+"에서 만든 "+year+"년형 "+size+"인치 TV");
	}
	
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
		
	}

}
