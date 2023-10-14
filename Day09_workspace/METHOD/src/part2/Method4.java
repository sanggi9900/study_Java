package part2;

import java.util.Scanner;

public class Method4 {
	// 4) 반환과 매개변수가 있는 메서드 : 반환이 있을 때 주의사항 + 매개변수가 있을 때 주의사항
	// - 제일 많이 만들어 쓰는 메서드
	// - 매개변수는 코드의 동작을 바꾸는 옵션처럼 사용될 수 있음
	// - 반환은 코드의 동작여부를 체크할 수 있는 상태값으로 사용될 수 있음
	public static boolean program(int n1, int n2, boolean option) {
		// option 매개변수에 의한 입력여부 통제
		if (option) {
			Scanner sc = new Scanner(System.in);
			System.out.print("복사한 값을 무시하고 입력 >> ");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
		}
		if (n2 == 0) {
			System.out.println("연산불가");
			return true;	// 문제가 발생해서 true을 반환
		}
		else {
			System.out.println("결과 : " + (n1 / n2));
			return false;	// 문제가 없어서 false를 반환
		}
	}
	
	public static void main(String[] args) {
		program(15, 7, false);
		program(15, 0, false);
		while (true) {
			if (program(0, 0, true)) break;
		}
	}
}
