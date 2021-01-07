
public class pg127_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int sum = 0;
		for(i=1;i<=100;i++) {
			if(i%3==0) {
				sum += i;
			}
		}
		
		System.out.println("3의 배수의 합 : "+sum);
	}

}
