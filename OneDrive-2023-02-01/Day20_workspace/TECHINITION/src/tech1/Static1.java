package tech1;

import test.Sample1;

public class Static1 {
	public static void main(String[] args) {
		// static 키워드 : 객체를 만들지 않아도 쓸 수 있는 필드/메서드
		// - 객체의 생성과 별개로 사용되고, 객체끼리 서로 공유하는 것으로 사용됨
		// static 멤버변수(필드)
		// - 각 객체의 메서드에서 이용하는데 아무런 문제없음
		// - 값의 변경을 해야 할 때는 주의해야 한다.
		// static 멤버메서드(메서드)
		// - static 필드를 이용하기 위한 메서드
		// - static 멤버가 아닌 것은 사용하면 안됨
		Sample1 sam1 = new Sample1(100);
		Sample1.check();
		Sample1 sam2 = new Sample1(150);
		Sample1.check();
		Sample1 sam3 = new Sample1(150);
		Sample1.check();
	}
}
