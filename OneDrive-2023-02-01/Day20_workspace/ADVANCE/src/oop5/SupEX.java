package oop5;

import myclass.Box;
import myclass.GenBox;

public class SupEX {
	public static void main(String[] args) {
		// Box 클래스에 대해서 진행하세요.
		// - toString을 오버라이딩을 하여 아래의 코드가 성립하도록 만드세요.
		Box box1 = new Box("상자에 넣을 상자");
		GenBox<Box> box2 = new GenBox<Box>("상자를 담는 상자");
		
		System.out.println("box1 : " + box1);	// box1 : 상자에 넣을 상자
		System.out.println("box2 : " + box2);	// box2 : 상자를 담는 상자
		
		box2.open();		// 상자를 담는 상자을(/를) 열었습니다.
		box2.setData(box1);	// 상자를 담는 상자 - 저장성공...
		box2.showInfo();	// 상자를 담는 상자 : 상자에 넣을 상자
	}
}
