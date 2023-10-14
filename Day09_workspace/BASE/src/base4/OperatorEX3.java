package base4;

import java.util.Scanner;

public class OperatorEX3 {
	public static void main(String[] args) {
		// 실습문제3
		// - 오늘 실습에 사용할 패키지를 생성하고, 소스파일을 준비하세요.
		
		Scanner sc = new Scanner(System.in);
		
		// 1) 정수 2개를 입력을 받아서 첫번째로 입력한 정수가 두번째로 입력한 정수보다
		//   더 큰게 맞는지 여부를 출력하세요.
		System.out.print("정수 2개 입력 >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("결과1 : " + (num1 > num2));

		// 2) 문자 2개를 입력을 받아서 두 문자가 서로 같은 문자인지 여부를 출력하세요.
		System.out.print("문자1 입력 >> ");
		char ch1 = sc.next().charAt(0);
		System.out.print("문자2 입력 >> ");
		char ch2 = sc.next().charAt(0);
		System.out.println("결과2 : " + (ch1 == ch2));
		
		// 3) 실수값을 하나 입력을 받아 정수부와 실수부로 나눠서 저장하고
		//    정수부와 실수부의 곱이 1보다 작거나 같은지 여부를 출력하세요.
		System.out.print("실수값 > ");
		double value = sc.nextDouble();
		System.out.println("결과3 : " + ((int)value * (value % 1)  <= 1));
		
		sc.close();
	}
}






