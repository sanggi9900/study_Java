package base2;

public class Base4 {
	public static void main(String[] args) {
		// 프로그래밍 언어 : 절차(프로그램)를 작성함
		
		// 기반준비 : 변수 선언/초기화
		// 원시 : 복사만 됨 - 변수 == 값
		boolean isRainy = false;
		char ch = '0';
		int age = 32;
		double height = 176.5;
		// 비원시 : 공유만 됨 - 변수 != 값
		String hobby = "둘리 괴롭히기";
		
		// 자료
		
		// 처리
		
		// 정보 : 화면출력
		System.out.print(isRainy + "\n");
		System.out.println("고길동의 취미 : " + hobby);
		System.out.printf("%c : %d, %.2f\n", ch, age, height);
	}
}
