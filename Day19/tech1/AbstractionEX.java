package tech1;

import test.Doctor;
import test.Patient;

public class AbstractionEX {
	public static void main(String[] args) {
		// 추상클래스를 상속받았다고 해서, 상속받은 클래스를 쓸 때
		// 쓸려는 곳에 불러올 필요는 없으니 주의...
		// 추상클래스는 각 클래스에서 사용된다.
		Doctor doc1 = new Doctor("김치료", "내과");
		Patient pat1 = new Patient("이환자", "감기");
		doc1.introduce();
		doc1.report();
		pat1.introduce();
		pat1.report();
		// 업캐스팅이 필요할 때는 반드시 import로 불러와야 한다.
	}
}
