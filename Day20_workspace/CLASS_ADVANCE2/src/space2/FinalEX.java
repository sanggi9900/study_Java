package space2;

import space1.Human;

public class FinalEX {
	public static void main(String[] args) {
		// 실습
		// 추상클래스 Body와 인터페이스 Action을 정의하고
		// 이를 상속한 Human 클래스를 정의하세요.
		// Human클래스에 정의할 내용은 실행코드를 보고 유추하세요.
		
		// # Body클래스
		// - 필드 : 이름, 나이
		// - 메서드 : 이름과 나이를 받는 생성자 / setter / getter
		//   - 생성자는 하나만 준비하고, setter,getter는
		//    모든 필드에 대해서 준비하세요.
		// # Action인터페이스
		// - 필드 : 없음
		// - 메서드 : void greeting() / void introduce()
		Human person = new Human("고길동", 23);
		person.greeting(); // 안녕하세요~
		person.introduce(); // 내 이름은 고길동이고, 23세입니다.
	}
}
