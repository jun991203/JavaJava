import java.util.*;
public class Chap3_14 {

	public static void main(String[] args) {
		
		String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int score [] = {95, 88, 76, 62, 55};
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("과목 이름>> ");
			String name = sc.next();
			
			if(name.equals("그만")) break;
			
			int sub_score = 0;
			for(int i=0; i<course.length; i++) {
				if(course[i].equals(name)) {
					sub_score = score[i];
					System.out.println(name+"의 점수는 "+sub_score);
				}
			}
			if(sub_score == 0) System.out.println("없는 과목입니다.");
			
		}
		
	}

}
