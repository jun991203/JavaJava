
public class Chap3_7 {

	public static void main(String[] args) {
		
		int [] array = new int [10];
		int sum = 0;
		
		System.out.print("·£´ýÇÑ Á¤¼öµé : ");
		for(int i=0; i<10; i++) {
			array[i] = (int)(Math.random()*10+1);
			sum += array[i];
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		double avg = sum/10;
		System.out.println("Æò±ÕÀº "+avg);
		
		

	}

}
