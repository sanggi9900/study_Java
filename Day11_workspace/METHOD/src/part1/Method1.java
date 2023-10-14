package part1;

import java.util.Scanner;

public class Method1 {
	// 1) 기본형태의 메서드 : 내부에서 전부 완결됨
	// - 내부에서 뭘 주지도 않고, 외부로부터 받지도 않는 메서드
	public static void HELLO(/*비워둘 것*/) {
		// 필요한 절차를 모두 구성함
		Scanner sc = new Scanner(System.in);
		
		System.out.print("누구한테 인사할까요? ");
		String name = sc.next();
		
		System.out.println("안녕하세요~ " + name + "님");
	}
	
	public static void main(String[] args) {
		// 메서드 : 클래스파일 및 이를 통해 생성되는 객체에 연결되어야만
		//        만들 수 있고, 쓸 수 있는 함수에 대응되는 것
		// 메서드는 코드를 저장하는 변수이고, 대부분의 경우에는 동사를 사용함
		// - 메서드는 변수/값을 공유하지 않음
		// - 비원시(참조)일 경우, 매개변수로 준비했을 경우에만 공유됨
		// - 원시일 경우, 죽었다 깨어나도 공유시킬 수 없음
		
		// 1. 기본형태 메서드의 실행 : 메서드명();
		// - 패키지/소스파일명은 다른 곳에 있을 경우에만 지정해서 불러옴
		// - 같은 소스파일 내에서는 메서드명만 적으면 됨
		HELLO();

	}
}











