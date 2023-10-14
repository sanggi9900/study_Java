package etc;

import java.util.Scanner;

public class SwitchEX {
	public static void main(String[] args) {
		// 스위치 제어문 : 선택에 극단적으로 집중된 제어문
		// - if를 기반으로 한 선택의 문제 : 선택지가 많아지면 느리다.
		// - 선택지가 많아져도 빠르게 동작할 수 있는 선택을 위한 제어문을 준비함.
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("1, 2, 3, 4 >> ");
			int menu = sc.nextInt();
			// 스위치의 주의사항 : 일치여부를 기반으로 체크함
			// - 선택지를 여러개 만들 수 있는 값 그자체를 요구함
			//   문자 / 정수를 주로 사용함
			if (menu== 4) {
				System.out.println("종료!!!!");
				break;
			}
			else {
				// 반드시 외부에, 종료를 위한 조건문/장치를 준비하셔야 함
				switch(menu) {
				
				case 1:		// 약속된 표현. 코드를 시작할 위치를 표기하기 위한 태그
					System.out.println("1번 출력!");
					break;	// 스위치를 중간에 종료시키는 제어문으로 사용됨
				case 2:
					System.out.println("2번 출력!!");
					break;
				case 3:
					System.out.println("3번 출력!!!");
					break;
				default:
					// default는 case에서 일치하는 것들이 없을 때의 선택지이며..
				    // 어디에 있어도 별 상관없음
					System.out.println("잘못된 선택!!!!");
					break;
					// break는 왠만하면 항상 붙일 것
				}
			}
		}
	}
}
