package runSapce;

import classSpace.Box;
import classSpace.TypeBox;

public class Generic {
	public static void main(String[] args) {
		// 제네릭 클래스 : 자료형을 임의로 설정하는 클래스
		// 주의사항 - 참조형만 가능
		// 사용시에는 제네릭클래스명<참조형>으로 사용함
		TypeBox<String> box1 = new TypeBox<String>("단어상자","Apple");
		
		// 이후에 객체 사용은 별 차이 없이 사용 가능
		// - 반환되는 것이 null이 될 수 있으니 주의해야 함
		System.out.println(box1.getData());
		box1.open();
		System.out.println(box1.getData());
		
		// # 원시자료형은 못쓰지만 대체품을 준비해서 할 수 있게 해줌
		// - Wrapper Class를 이용함
		// TypeBox<int> box2 = new TypeBox<int>("정수상자", 100);
		// char - Character
		// short - Short
		// int - Integer
		// float - Float
		// double - Double
		// boolean - Boolean
		// - 제네릭의 주 목적은 "객체" 를 다루는 클래스를 정의하는 것임을 기억할 것
		TypeBox<Integer> box2 = new TypeBox<Integer>("정수상자", 55);
		System.out.println(box2.getData());
		box2.open();
		System.out.println(box2.getData());
		
		// 제네릭 클래스의 주의사항 : Up & Down
		// - Up된 것이 Down될 때가 문제이고...연산자를 하나 사용함
		// - instanceof : 해당 클래스의 객체 여부를 체크해주는 연산자 / + 상속관계
		Box box3 = box2;
		System.out.println(box2 instanceof Box);	// 부모클래스의  자식이 되는지 체크 가능
		System.out.println(box3 instanceof TypeBox);// 해당 클래스로 만들어진 객체 여부 체크

		// # 참고 : 제레릭은 다운캐스팅을 받을 때는 자료형을 지정하지 않는다.
		TypeBox box4 = (TypeBox)box3;
		System.out.println("실수(?)상자 :" + box4.getData());
	}
}






