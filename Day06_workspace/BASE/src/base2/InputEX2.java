package base2;

import java.util.Scanner;

public class InputEX2 {
	public static void main(String[] args) {
		// 실습
		// 1) 경역학 개론1, 경영학 개론2, 경영학 원론의
		//    학점등급(A ~ F, +, - 없음)을 입력을 받아 저장합니다.
		// 2) 경영학 원론 학점에 대한 간단한 코멘트를 입력을 받아 저장합니다.
		
		// 3) 입력받은 내용을 아래와 같이 출력하세요.
		
		// # 출력 예시 #
		// 중간고사 결과
		// 경영학 개론1 : F, 경영학 개론2 : A
		// 경영학 원론 : C - 조별과제는 지옥인 것 같네요.
		
		// 참고 : 실제 업무라면, 문자가 필요한 상황인지 아닌지 잘 생각해봐야 함
		Scanner sc = new Scanner(System.in);
		System.out.print("경영학 개론1 학점 > ");
		char rank1 = sc.next().charAt(0);
		System.out.print("경영학 개론2 학점 > ");
		char rank2 = sc.next().charAt(0);
		System.out.print("경영학 원론 학점 > ");
		char rank3 = sc.next().charAt(0);
		System.out.print("원론 코멘트 > ");
		sc.nextLine();
		String comment = sc.nextLine();
		System.out.println(
				"경영학 개론1 : " + rank1 + ", 경영학 개론2 : " + rank2
				+ "\n경영학 원론 : " + rank3 + " - " + comment);
		// 끝났다고 확신이 들 경우에만....
		sc.close();
	}
}






