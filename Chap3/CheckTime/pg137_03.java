
public class pg137_03 {

	public static void main(String[] args) {
		
		int tenList[] = new int[10];
		
		// put number into array
		for(int i=0;i<tenList.length;i++) {
			tenList[i] = i+1;
		}
		
		// sum all elements
		int sum = 0;
		for (int i=0;i<tenList.length;i++) {
			sum += tenList[i];
		}
		System.out.println(sum);

	}

}
