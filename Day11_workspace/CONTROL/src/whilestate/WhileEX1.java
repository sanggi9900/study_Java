package whilestate;

import java.util.Scanner;

public class WhileEX1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력받은 값에 대해 따로 판별해서 알려줄 내용이 없으면
		// 제일 효율적으로 작동함
		int num1 = 0;
		while (num1 % 2 == 0) {
			System.out.print("홀수 입력 >> ");
			num1 = sc.nextInt();
		}
		System.out.println("준비된 값 : " + num1);
		
		// 입력받은 값에 대해 판별해서 출력해줄 내용이 있으면
		// 아까우니까 재활용함
		int num2 = 0;
		while (true) {
			System.out.print("홀수 입력 >> ");
			num2 = sc.nextInt();
			if (num2 % 2 != 0) break;
			// else System.out.println("홀수를 입력해주세요 / 잘못 입력되었습니다.");
		}
		System.out.println("준비된 값 : " + num2);
	}
}
