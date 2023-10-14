package part1;

import java.util.Scanner;

public class MethodEX2 {
	// 이를 만족하는 메서드를 정의하세요.
	// 메서드는 입력한 정수까지의 합을 구해서 반환합니다.
	public static int getSum() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("합을 구할 정수 입력 >> ");
		int num = sc.nextInt();
		
		int result = 0;
		for (int i = ((num > 0) ? num : -num) ; i > 0; i -= 1) {
			result += i;
		}
		
		return ((num > 0) ? result : -result);
	}
	
	public static void main(String[] args) {
		int result1 = getSum();
		int result2 = getSum();
		System.out.println("첫번째 합 : " + result1);
		System.out.println("두번째 합 : " + result2);
	}
}
