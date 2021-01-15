
public class pg210_1 {
	
	public double arraySum(double[] arr) {
		double sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		double [] arr = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9};
		pg210_1 a = new pg210_1();
		
		double result = a.arraySum(arr);
		System.out.println("°á°ú´Â "+result);
	}

}
