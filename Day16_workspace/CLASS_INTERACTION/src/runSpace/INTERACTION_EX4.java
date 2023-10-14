package runSpace;

import classSpace.Box;

public class INTERACTION_EX4 {
	public static void main(String[] args) {
		// 같은 수준의 클래스간의 상호작용2
		// - 동작을 제공하는 객체끼리일 경우
		//   기술로써 사용하는 경우가 많음
		// 복사 생성자(Copy Constructor)
		// - 객체를 복사하여 생성하기 위한 생성자
		// - 필드가 참조형일 경우에는 "공유"됨
		Box box1 = new Box("이삿짐포장용");
		Box box2 = new Box(box1);
		System.out.println(box1.getName());
		System.out.println(box2.getName());
		System.out.println(
				box1.getName() == box2.getName()
				);
	}
}







