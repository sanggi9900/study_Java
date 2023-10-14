package ifstate;

import java.util.Scanner;

public class If01 {
	public static void main(String[] args) {
		// 조건문 : 선별하여 골라내고 달리 처리하기 위한 제어문
		// - 선형방식은 모든 것을 공평하게 처리하는 것
		// - 하지만 모든 것은 공평하게 처리될 수 없음
		
		// 기본사용방식 : if + else
		// if : 조건식의 결과가 true일 때 실행할 코드를 묶어주기 위한 제어문
		// else : 조건식의 결과가 false일 때 실행할 코드를 묶어주기 위한 제어문
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값의 부호를 판별합니다 >> ");
		int num = sc.nextInt();
		// - 둘 중 하나만 고를 수 있음
		// - 종속코드가 하나뿐이면 중괄호 생략가능
		if (num > 0) System.out.println("이 정수는 양수입니다~");
		else System.out.println("이 정수는 양수가 아닙니다~");
	}
}







