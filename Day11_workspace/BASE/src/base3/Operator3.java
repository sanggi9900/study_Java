package base3;

import java.util.Scanner;

public class Operator3 {
	public static void main(String[] args) {
		// 관계연산자
		int num1 = 10;
		int num2 = 3;
		System.out.println("결과1 : " + (num1 >  num2));
		System.out.println("결과2 : " + (num1 >= num2));
		System.out.println("결과3 : " + (num1 <  num2));
		System.out.println("결과4 : " + (num1 <= num2));
		System.out.println("결과5 : " + (num1 == num2));
		System.out.println("결과6 : " + (num1 != num2));
		
		// 주의사항1 - 원시자료형만 가능
		System.out.println("A" == "A");
		Scanner sc = new Scanner(System.in);
		String word1 = sc.next();	// 비원시는 메서드를 통해서 비교해야만 함
		String word2 = sc.next();	// 연산자로는 비교할 수 없음
		System.out.println(word1 == word2);
		
		// 주의사항2 - 관계연산자는 연속사용 불가
		// - 실수 예방을 위해 문법점검에서 강제하고 있음
		// int x = 10;
		// System.out.println( 5 < x < 20 );
		
		// 논리연산자 - 논리값을 하나로 합치기 위한 연산자
		
		// 1) 논리곱 && : 조건식들을 만족하는 유일한 것
		// - ex) 가격비교사이트에서, 브랜드와 기타 다른 옵션을 동시에 검색할 때
		int x = 10;
		System.out.println( x > 5 && x < 20 );
		
		// 2) 논리합 || : 조건식들을 하나이상 만족하는 것들
		// - ex) 같은 옵션 내에서 서로 다른 것들을 동시에 검색할 때
		System.out.println( x > 5 || x < 20 );
		
		// 3) 부정연산자 ! : 조건식의 재활용
		boolean result = x > 5 && x < 20;
		System.out.println(result);
		System.out.println(!result); // x <= 5 || x >= 20
	}
}






