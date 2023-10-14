package ifstate;

import java.util.Scanner;

public class IfEX2 {
	public static void main(String[] args) {
		// 패키지 따로 추가하지 않고 어제 만든 것에
		// 그대로 이어서 작성합니다.
		// 소스파일만 추가하시고
		// PDF 2번 문제 풀어보세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실수값 2개 >> ");
		double value1 = sc.nextDouble();
		double value2 = sc.nextDouble();
		
		int order = 0;
		double max_value = 0;
		double diff = 0;
		// 중복제거시 주의사항 : if와 if끼리는 할 수 없음
		// -> if와 if는 서로 실행될 수도 있고, 안될 수 있음
		if (value1 > value2) {
			order = 1;
			max_value = value1;
			diff = value1 - value2;
		}
		else {
			order = 2;
			max_value = value2;
			diff = value2 - value1;
		}
		System.out.printf("%d번째로 입력한\n"
				+ "%.1f가 %.1f만큼 더 큽니다.\n", order, max_value, diff);
	}
}
