package whilestate;

import java.util.Scanner;

public class WhileEX2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 1;
		while (true) {
			System.out.print("정수 2개 입력 >> ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if (num1 < num2) System.out.println("첫번째가 작습니다.");
			else break;
		}
		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
	}
}
