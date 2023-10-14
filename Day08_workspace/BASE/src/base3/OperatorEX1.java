package base3;

import java.util.Scanner;

public class OperatorEX1 {
	public static void main(String[] args) {
		// 실습1
		// 3개의 실수를 입력을 받아 저장하고
		// 3개의 실수값들의 평균을 출력하세요.
		// 소수점 2자리까지만 출력합니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("3개의 실수 > ");
		double value1 = sc.nextDouble();
		double value2 = sc.nextDouble();
		double value3 = sc.nextDouble();
		
		System.out.println( "평균 : " + ((value1 + value2 + value3) / 3) );
		
		// printf : 서식문자 기반으로 변환후 출력
		System.out.printf( "평균 : %.2f\n", (value1 + value2 + value3) / 3 );
		
		// Math.round : 반올림메서드
		double avg = (value1 + value2 + value3) / 3;
		System.out.println( "평균 : " +  (Math.round(avg * 100)/100.0) );
		
		// String.format : 서식문자를 기반으로 변환된 문자열을 준비하는 메서드
		System.out.println( "평균 : " +  String.format("%.2f", avg) );
			
	}
}
