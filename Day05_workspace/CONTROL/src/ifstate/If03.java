package ifstate;

import java.util.Scanner;

public class If03 {
	// ctrl + space : 자동완성목록 출력
	// - 관용구를 설정해, 이를 호출할 수 있음
	// - 1) main : 메인메서드 자동완성 관용구
	// - 2) sysout : Sytem.out.println()
	
	// main 적고 ctrl + space
	public static void main(String[] args) {
		// sysout 적고 ctrl + space
		// System.out.println();
		
		// MAIN MENU - 선택지를 임의로 준비하고, 이를 고를 수 있게 만들어주는 것
		// - 선택지를 고를려면?
		// 1) 정수 : 1, 2, 3 이 입력되었을 때 실행할 내용 조건문으로 구성
		// 2) 문자 : 'A', 'B', 'C' 에 실행할 내용을 구성하는 과정
		// 3) 문자열 : 단어에 따라서 동작을 달리하는 과정
		
		// # 뭘 입력하면 뭐가 되는지 알려줘야 함
		System.out.print("1. 실행 / 2. 종료\n>> ");
		
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		if (menu <= 0 || menu >= 3) System.out.println("잘못된 입력입니다.");
		else {
			if (menu == 1) System.out.println("1을 입력했을 때 실행되는 코드");
			else System.out.println("2를 입력했을 때 실행되는 코드");
		}
	}
}








