package part2;

import java.util.Scanner;

public class Method3 {
	// 3) 매개변수가 있는 메서드
	// - 매개변수 자리에는 void를 채울 수 없음. 비워둘 수 있음.
	// - 매개변수는 추가함으로써 필요한 값을 복사받을 수있게 만들 수 있음.
	// - 값을 불러오는 용도가 아니라, 값을 복사받기 위한 메서드의 변수이니 주의.
	public static void test(int num1, int num2) {
		if (num2 == 0) System.out.println("연산불가");
		else System.out.println("결과 : " + (num1 % num2));
	}
	public static void main(String[] args) {
		// 호출 : 메서드명(필요한 값1, 값2, 값3, ...);
		test(10, 4);
		// 매개변수가 있는 메서드는 입력을 거부하는 것이 아니라, 선택할 수 있게 해주는 것
		// -> 자료에 대해서 융통성을 부여하게 됨
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개 입력 >> ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		test(n1 + n2, n1 - n2);
	}
}




