// Chap4. �ǽ����� 1��
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
		System.out.println(madeby+"���� ���� "+year+"���� "+size+"��ġ TV");
	}
	
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
		
	}

}
