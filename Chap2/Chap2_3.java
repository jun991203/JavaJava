import java.util.*;

public class Chap2_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = sc.nextInt();
		
		while(true) {
			if(money >= 50000) {
				System.out.println("�������� "+money/50000+"��");
				money = money-(money/50000)*50000;
			}else {
				if(money >= 10000) {
					System.out.println("������ "+money/10000+"��");
					money = money-(money/10000)*10000;
				}else {
					if(money >= 1000) {
						System.out.println("õ���� "+money/1000+"��");
						money = money-(money/1000)*1000;
					}else {
						if(money >= 100){
							System.out.println("��� "+money/100+"��");
							money = money-(money/100)*100;
						}else {
							if(money >= 50) {
								System.out.println("���ʿ� "+money/50+"��");
								money = money-(money/50)*50;
							}else {
								if(money >= 10) {
									System.out.println("�ʿ� "+money/10+"��");
									money = money-(money/10)*10;
									System.out.println("�Ͽ� "+money+"��");
									break;
								}else {
									System.out.println("�Ͽ� "+money+"��");
									break;
								}
							}
						}
					}
				}
			}
		}
		
	}

}
