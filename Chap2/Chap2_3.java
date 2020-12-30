import java.util.*;

public class Chap2_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오>>");
		int money = sc.nextInt();
		
		while(true) {
			if(money >= 50000) {
				System.out.println("오만원권 "+money/50000+"매");
				money = money-(money/50000)*50000;
			}else {
				if(money >= 10000) {
					System.out.println("만원권 "+money/10000+"매");
					money = money-(money/10000)*10000;
				}else {
					if(money >= 1000) {
						System.out.println("천원권 "+money/1000+"매");
						money = money-(money/1000)*1000;
					}else {
						if(money >= 100){
							System.out.println("백원 "+money/100+"개");
							money = money-(money/100)*100;
						}else {
							if(money >= 50) {
								System.out.println("오십원 "+money/50+"개");
								money = money-(money/50)*50;
							}else {
								if(money >= 10) {
									System.out.println("십원 "+money/10+"개");
									money = money-(money/10)*10;
									System.out.println("일원 "+money+"개");
									break;
								}else {
									System.out.println("일원 "+money+"개");
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
