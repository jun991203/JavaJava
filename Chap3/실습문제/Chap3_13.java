
public class Chap3_13 {

	public static void main(String[] args) {
		
		for(int i=1; i<=99; i++) {
			int ten = i/10;
			int il = i-(i/10)*10;
			
			int cnt = 0;
			if(ten%3==0 && ten!=0) ++cnt;
			if(il%3==0 && il!=0) ++cnt;
			
			if(cnt == 2) System.out.println(i+" ¹Ú¼ö Â¦Â¦");
			if(cnt == 1) System.out.println(i+" ¹Ú¼ö Â¦");
		}

	}

}
