import java.util.*;
public class Chap3_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 10개를 입력하시오>> ");
		int [] intArray = new int [10];
		for(int i=0; i<10; i++) {
			intArray[i] = sc.nextInt();
		}
		
		System.out.print("3의 배수는 ");
		for(int i=0; i<10; i++) {
			if(intArray[i]%3 == 0) {
				System.out.print(intArray[i]+" ");
			}
		}

	}

}
