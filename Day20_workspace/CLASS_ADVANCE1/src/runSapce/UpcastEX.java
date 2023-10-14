package runSapce;

import classSpace.Box;
import classSpace.Human;
import classSpace.IntBox;
import classSpace.WordBox;

public class UpcastEX {
	public static void main(String[] args) {
		// 실습
		// 1) Box 클래스로 "개념으로만 구성된 상자"
		//    라는 이름으로 객체를 생성하세요.
		// 2) IntBox 클래스로 "정수를 보관하는 상자"
		//    라는 이름으로 객체를 생성하세요.
		//    - IntBox는 생성자를 통해 값이
		//      보관이 안됩니다. 주의하세요.
		// 3) WordBox 클래스로 "단어를 보관하는 상자"
		//    라는 이름으로 객체를 생성하세요.
		//    - WordBox는 생성자를 통해 보관할
		//      값을 넣어야만 합니다. 주의하세요.
		// 4) Human 클래스로 "김개폐" 라는 "박스관리자" 객체를
		//    생성하세요.
		// 5) Human 클래스 객체로 모든 상자를 열여서 열렸는지
		//    확인하세요.
		Box box1 = new Box("개념으로만 구성된 상자");
		IntBox box2 = new IntBox("정수를 보관하는 상자");
		WordBox box3 = new WordBox("단어를 보관하는 상자", "Apple");
		Human manager = new Human("김개폐","박스관리자", 0);
		
		manager.action(box1); // 원래 Box인 객체를 다루는 것 - 아무런 변화 없음 
		manager.action(box2); // 원래 IntBox인 것을 Box로써 다룸 -> 업캐스팅
		manager.action(box3); // 원래 WordBox인 것을 Box로써 다룸 -> 업캐스팅
		
		// 팁 : 상속으로 만들어진 객체를 이용할 때는..
		//    부모 클래스를 잘 이용해야, 개별 메서드가 감소함
		System.out.println(box1.getState());
		System.out.println(box2.getState());
		System.out.println(box3.getState());
	}
}






