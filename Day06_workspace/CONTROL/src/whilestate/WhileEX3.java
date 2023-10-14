package whilestate;

import java.util.Scanner;

public class WhileEX3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			// 문자열의 일치여부로 메뉴를 선택할 경우
			// - 정확하게 일치하지 않으면 절대로 실행이 되지 않음
			// - 과도하게 쓰면, 내부에서 반복이 작동하기 때문에 느려짐
			System.out.print("뭐할까? ");
			String menu = sc.next();
			if (menu.equals("아침")) {
				System.out.println("Good Morning!");
			}
			else if (menu.equals("점심")) {
				System.out.println("Good Afterning!!");
			}
			else if (menu.equals("저녁")) {
				System.out.println("Good Evening!!!");
			}
			else if (menu.equals("종료")) {
				System.out.println("Bye Bye ~ !");
				break;
			}
			else System.out.println("WRONG INPUT ... ");
		}
	}
}
