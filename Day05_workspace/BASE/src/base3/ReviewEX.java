package base3;

import java.util.Scanner;

public class ReviewEX {
	public static void main(String[] args) {
		// 복습문제
		// 1) 화면에 보이는 소스코드를 토대로 패키지 및 소스파일을 생성하세요.
		// 2) 이름과 국어, 영어, 수학 점수를 개별로 입력을 받아 변수에 저장합니다.
		// 3) 저장된 값을 아래 결과예시처럼 출력하세요.
		
		// # 결과예시 - 서식문자를 이용해 칸수를 지정해서 정렬합니다.
		// 성적표 - 고길동
		// 국어 :  98점
		// 영어 : 100점
		// 수학 :   5점
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 > ");
		String name = sc.next();
		System.out.print("국어 성적 > ");
		int kor = sc.nextInt();
		System.out.print("영어 성적 > ");
		int eng = sc.nextInt();
		System.out.print("수학 성적 > ");
		int mat = sc.nextInt();
		
		System.out.printf(
				"성적표 - %s\n"
				+ "국어 : %3d점\n"
				+ "영어 : %3d점\n"
				+ "수학 : %3d점\n",
				name, kor, eng, mat);
		
	}
}











