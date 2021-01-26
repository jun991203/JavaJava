class IPTV extends ColorTV{
	String addr;
	public IPTV(String addr, int size, int colors) {
		super(size, colors);
		this.addr = addr;
	}
	public void printProperty() {
		System.out.print("���� IPTV�� "+addr+" �ּ��� ");
		super.printProperty();
	}
}

public class Ch5_02 {
	public static void main(String[] args) {
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}

}
