package runSapce;

import classSpace.Actor;

public class Inheritance2 {
	public static void main(String[] args) {
		// 상속에서만 사용가능한 기술 - 메서드 오버라이딩
		// - 부모클래스의 메서드가 마음에 안들 수 있음
		// - 메서드를 "재정의"하여 새롭게 작성하는 기술
		// - 반환형, 매개변수, 메서드명이 모두 동일해야 함
		Actor person1 = new Actor("돌쇠");
		person1.greeting();
	}
}
