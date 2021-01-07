
public class pg127_01 {

	public static void main(String[] args) {
		
		// Check Time 127pg p1.
		// print stars using for loops
		int i;
		for(i=5;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// print stars using while loops
		int m = 5;
		while(m>0) {
			int n = m;
			while(n>0) {
				System.out.print("*");
				--n;
			}
			--m;
			System.out.println();
		}
		System.out.println();

		//print stars using do-while loops
		int k = 5;
		do {
			int j = k;
			while(j>0) {
				System.out.print("*");
				--j;
			}
			--k;
			System.out.println();
		}while(k>0);

	}

}
