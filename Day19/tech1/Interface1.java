package tech1;

abstract class Phone {
	protected String model;
	public abstract void powerOn();
	public abstract void powerOff();
}
// interface 명칭 으로 시작함
interface HowTo {
	// 1. 생성자 준비 불가하니 주의
	// 2. 필드는 공용필드이고, public static이다.
	// 3. abstract를 안붙여도 추상메서드가 됨.
	int count = 0;
	public default void call(String num) {
		System.out.println(num+"에게 전화합니다.");
	}
	public default void sms(String num) {
		System.out.println(num+"에게 문자합니다.");
	}
	public void ai();
	public static void check() {
		System.out.println("통계용 : " + count);
	}
}

class Galaxy extends Phone implements HowTo {
	public Galaxy(String name) {
		model = name;
	}
	public void powerOn() {
		System.out.println("갤럭시로고가 나타남~");
	}
	public void powerOff() {
		System.out.println("갤럭시로고가 사라짐~");
	}
	public void ai() {
		System.out.println("빅스비~!");
	}
}
class IPhone extends Phone implements HowTo {
	public IPhone(String name) {
		model = name;
	}
	public void powerOn() {
		System.out.println("애플로고를 띄우고만 있다가 켜짐~");
	}
	public void powerOff() {
		System.out.println("애플로고를 띄우고만 있다가 꺼짐~");
	}
	public void ai() {
		System.out.println("시리야~!");
	}
}

public class Interface1 {
	public static void main(String[] args) {
		// 추상클래스 - 동일한 필드를 제공하는 것이 주 목적
		//         - 메서드는 필요 최소한의 동일한 동작만 제공
		/*
		Phone p1 = new Galaxy("갤럭시S22");
		Phone p2 = new IPhone("아이폰13 mini");
		p1.powerOn();
		p2.powerOn();
		p1.powerOff();
		p2.powerOff();
		*/
		// 인터페이스 - 동일한 상호작용수단을 추가하기 위한 클래스
		//         - 필드는 최소한으로만 제공하고...
		//           메서드를 동일하게 쓸 수 있게 제공한다.
		Galaxy p1 = new Galaxy("갤럭시S22");
		IPhone p2 = new IPhone("아이폰13 mini");
		p1.call("010-1111-2222");
		p2.call("010-2222-3333");
		p1.sms("김길동");
		p2.sms("고길동");
		p1.ai();
		p2.ai();
		
		// 인터페이스의 static 메서드는 객체에서 못씀
		// - 일반적인 접근제어로 어려운 것을 해결해줌
		HowTo.check();
	}
}


















