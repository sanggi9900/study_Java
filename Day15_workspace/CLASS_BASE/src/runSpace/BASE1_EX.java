package runSpace;

import classSource.Box;

public class BASE1_EX {
	public static void main(String[] args) {
		// 실습
		// - classSource패키지에 Box 클래스를 정의합니다.
		// 속성 : 상자의 이름, 상자의 상태
		// 동작 : 상자열기, 상자닫기
		// 속성과 동작 앞에 전부 public을 붙여주세요.
		// 아래 코드가 실행됩니다.
		Box box1 = new Box();
		box1.name = "태초의 상자";
		box1.state = false;
		// 객체의 메서드는 외부와 상호작용을 하거나..
		// 자기자신을 바꾸는 것이 목적임
		// # 클래스의 메서드의 특징
		// - 자기자신에 대해서 무제한 이용이 가능함
		// - 필드는 만들어진 객체의 필드를 의미함
		box1.open();
		System.out.println(box1.name + " " + box1.state);
		box1.close();
		System.out.println(box1.name + " " + box1.state);
	}
}




