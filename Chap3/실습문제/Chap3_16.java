import java.util.*;
public class Chap3_16 {

	public static void main(String[] args) {
		
		String game [] = {"가위", "바위", "보"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터와 가위바위보 게임을 합니다.");
		
		while(true) {
			System.out.print("가위 바위 보!>> ");
			String user = sc.next();
			
			if(user.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
			
			int n = (int)(Math.random()*3);
			String now = game[n];
			
			System.out.print("사용자 = "+user+", 컴퓨터 = "+now);
			if(user.equals(now)) {
				System.out.println(", 비겼습니다.");
			}else if(user.equals("가위")) {
				if(now.equals("바위")) System.out.println(", 컴퓨터가 이겼습니다.");
				if(now.equals("보")) System.out.println(", 사용자가 이겼습니다.");
			}else if(user.equals("바위")) {
				if(now.equals("보")) System.out.println(", 컴퓨터가 이겼습니다.");
				if(now.equals("가위")) System.out.println(", 사용자가 이겼습니다.");
			}else if(user.equals("보")) {
				if(now.equals("가위")) System.out.println(", 컴퓨터가 이겼습니다.");
				if(now.equals("바위")) System.out.println(", 사용자가 이겼습니다.");
			}
			
			
		}

	}

}
