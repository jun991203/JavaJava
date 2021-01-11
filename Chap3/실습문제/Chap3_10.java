
public class Chap3_10 {

	public static void main(String[] args) {
		
		int [][] array = new int [4][4];
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				array[i][j] = 0;
			}
		}
		
		for(int k=0; k<10; k++) {
			int n = (int)(Math.random()*4);
			int m = (int)(Math.random()*4);
			if(array[n][m] != 0) {
				n = (int)(Math.random()*4);
				m = (int)(Math.random()*4);
			}
			
			int l = (int)(Math.random()*10+1);
			array[n][m] = l;
		}
		
		for(int p=0; p<4; p++) {
			for(int q=0; q<4; q++) {
				System.out.print(array[p][q]+" ");
			}
			System.out.println();
		}

	}

}
