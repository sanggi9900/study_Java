package part1;

import java.util.Scanner;

public class MethodEX1 {
	// 기본 메서드는 예외적으로 명사가 자주 사용됨
	public static void calculator() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력 >> ");
		int n1 = sc.nextInt();
		System.out.print("정수2 입력 >> ");
		int n2 = sc.nextInt();
		
		System.out.println("합 : " + (n1 + n2));
		System.out.println("차 : " + (n1 - n2));
		System.out.println("곱 : " + (n1 * n2));
		
		// 원본
		if (n2 == 0) System.out.println("몫 : 연산불가");
		else System.out.println("몫 : " + (n1 / n2));
		
		// 예시1) 변수 이용하기
		String result = "";
		if (n2 == 0) result = "연산불가";
		else result = result + (n1 / n2);
		System.out.println("몫 : " + result);
		
		// 예시2) 삼항 연산자를 이용함 : 값만 골라서 준비해줌
		System.out.println( "몫 : " + ( (n2 == 0) ? "연산불가": (n1/n2) ) ); 
	}
	public static void main(String[] args) {
		calculator();
	}
}









