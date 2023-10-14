package whilestate;

import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {
		// while반복문 사용법1 : 무한반복
		// - 값의 변화가 랜덤이어야만 반복횟수를 예측할 수 없음
		// - 무조건 입력받아야만 성립함
		// 1) 외부에 관심이 있다 - 반복 종료후
		// - 내가 원하는 값만 골라서 받기 위한 재입력
		// - if만 사용하는 방식으로 접근하여 구성함
		Scanner sc = new Scanner(System.in);
		int num = 1;	// 주의사항 : 변수를 미리 준비할 때, 필요없는 값으로 초기화를 해야 함
		while (num > 0) {
			System.out.print("0이하의 음수만 입력하세요 >> ");
			num = sc.nextInt();
		}
		System.out.println("결과 : " + num);
		
		// 2) 내부에 관심이 있다 - 반복 중
		// - "메뉴"를 구성할 때 사용하는 반복문
		// - 코드 전반을 반복실행하고, 반복이 종료되면 프로그램 종료
		while (true) { // true 상수값 : 반복을 무조건 동작시키기 위한 조건식
			System.out.print("1. 실행 / 2. 종료\n>> ");
			int menu = sc.nextInt();
			if (menu < 1 || menu > 2) System.out.println("잘못된 입력...\n");
			else if (menu == 1) System.out.println("실행!\n");
			else {
				// 보조제어문 break : 반복을 종속문단계에서 종료시키기 위한 제어문
				// - 조건문고 같이 써야 함
				System.out.println("종료...\n");
				break;
			}
		}
	}
}






