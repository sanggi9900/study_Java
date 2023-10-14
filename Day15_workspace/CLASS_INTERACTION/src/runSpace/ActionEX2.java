package runSpace;

import classSpace.Box;
import classSpace.Human;

public class ActionEX2 {
	public static void main(String[] args) {
		// 실습
		// Human 클래스의 action 메서드를 정의하세요.
		// 1) 상자의 상태를 읽어서 열거나 닫는 메서드
		// 2) 서랍에 대해 특정 번째의 서랍을 열거나 닫는 메서드
		// 1)과 2)는 오버로딩입니다.
		// 전부 action 메서드라는 이름으로 통일하세요.
		
		// 실행코드
		Human manager = new Human("관리자", "핸들러",31);
		Box box1 = new Box();
		Box[] drawers = new Box[4];
		for (int i = 0; i < drawers.length; i += 1) {
			drawers[i] = new Box((i+1)+"번 상자");
		}
		// box1에 대한 동작결과 점검
		System.out.println(box1.getState());
		manager.action(box1);
		System.out.println(box1.getState());
		manager.action(box1);
		System.out.println(box1.getState());
		
		// drawers 중에서 지정한 대상에 대한 동작 점검
		System.out.println(drawers[2].getState());
		manager.action(drawers, 2);
		System.out.println(drawers[2].getState());
		manager.action(drawers, 2);
		System.out.println(drawers[2].getState());
		
		// 잘못된 동작이니 뭔가 되면 안됨
		manager.action(drawers, 5);
		manager.action(drawers, -1);
		
	}
}






