package base2;

import java.util.Scanner;

public class Base5 {
	public static void main(String[] args) {
		// Scanner : 키보드 및 파일을 읽어들여 값을 준비해주는 객체
		// - java.Util 패키지에 존재함
		// - 필요할 때 사용하는 도구이며, 기본제공이 안됨
		// - 불러봐야 하고, import 를 이용해서 지정함
		// - ※ java.System 패키지는 기본으로 불려와서 인식됨
		
		Scanner sc = new Scanner(System.in);	// 키보드 입력을 인식하도록 준비가 됨
		// 입력규칙 : 엔터로 입력종료 / 여러개의 구분은 엔터, 띄어쓰기, 탭
		System.out.print("두 개의 정수를 입력해주세요 >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("결과 : " + num1 + ", " + num2);
		
		System.out.print("실수 한개 입력 >>");
		double value = sc.nextDouble();
		System.out.println("결과 : " + value);
		
		// 문자열은 2가지가 존재함 
		// 단어입력(next) : 규칙이 똑같음
		System.out.print("단어 입력 >> ");
		String word = sc.next();
		
		// 문장입력(nextLine) : 띄어쓰기를 인식하지 않음. 엔터만 인식
		// - 이전에 다른 종류의 입력이 있으면 영향을 받아, 입력이 바로 종료됨
		// - 입력을 종료하기 위해 입력했던 \n이 남아서 발생함
		System.out.print("문장을 입력해주세요 >> ");
		sc.nextLine();	// 다른 입력이 먼저 있을 경우, 한번 그냥 써줌
		String msg = sc.nextLine(); // 본 입력이 작동하게 됨
		
		System.out.printf("#%s#\n#%s#\n", word, msg);
		
		// 논리값 입력은 잘 안받지만, 필요하면 true / false로 인식함
		System.out.print("논리값 >> ");
		boolean result = sc.nextBoolean();
		System.out.println("결과 : " + result);
	}
}








