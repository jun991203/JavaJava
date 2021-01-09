import java.util.*;
public class Chap3_8 {

	public static void main(String[] args) {
		
		System.out.print("정수 몇 개? ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int array [] = new int [num];
		for(int i=0; i<num; i++) {
			array[i] = (int)(Math.random()*100+1);
			for(int j=0; j<i; j++) {
				if(array[j] == array[i]) {
					array[i] = (int)(Math.random()*100+1);
				}
			}
		}
		
		for(int i=0; i<num; i++) {
			if(i%10==0 && i!=0) {
				System.out.println();
			}
			System.out.print(array[i]+" ");
			
		}

	}

}
