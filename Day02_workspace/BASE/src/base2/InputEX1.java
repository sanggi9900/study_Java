package base2;

import java.util.Scanner;

// ctrl + shift + o : 필요한 import 코드를 자동으로 채워줌

public class InputEX1 {
	public static void main(String[] args) {
		// 실습
		// 국어, 영어, 수학 점수를 하나씩 입력을 받아 저장하고
		// 이를 아래와 같이 출력하세요.
		// 출력예시
		// 국어 점수는 97.0점이고, 영어 점수는 98.2점입니다.
		// 수학은 100.0점입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 > ");
		double score1 = sc.nextDouble();
		System.out.print("영어 점수 > ");
		double score2 = sc.nextDouble();
		System.out.print("수학 점수 > ");
		double score3 = sc.nextDouble();
		System.out.println(
				"국어 점수는 " + score1 + "점이고, 영어 점수는 " + score2 + "점입니다.\n"
				+ "수학은 " + score3+"점입니다."
				);
	}
}








