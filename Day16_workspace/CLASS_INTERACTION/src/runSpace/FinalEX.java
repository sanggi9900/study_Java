package runSpace;

import classSpace.Tank;

public class FinalEX {
	public static void main(String[] args) {
		// 상호작용 복습문제
		// 1) 탱크 클래스를 정의하세요.
		// - 필드 : 탱크이름, 탱크체력, 공격력
		// - 메서드 : 대상공격, 상황보고(- 현재정보출력)
		// - 필드는 3개 항목으로 고정입니다.
		// - 메서드는 필요한 만큼만 추가하세요. 이상한 것은 제가 물어봅니다.
		Tank tank1 = new Tank("K2", 150, 15);
		Tank tank2 = new Tank("레오파르드", 200, 10);
		
		// 2) 아래의 내용을 만족하는 코드를 작성하세요.
		// - 상황보고 메서드로 각 객체에 반영되는지 확인하세요.
		// (1) K2가 레오파르드를 공격합니다.
		tank1.attackTo(tank2);
		// (2) K2가 레오파르드에게 공격당합니다.
		tank2.attackTo(tank1);
		// (3) 레오파르드가 K2를 공격합니다.
		tank2.attackTo(tank1);
	}
}
