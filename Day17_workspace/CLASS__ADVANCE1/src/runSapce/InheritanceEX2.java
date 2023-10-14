package runSapce;

import classSpace.Doctor;
import classSpace.Human;

public class InheritanceEX2 {
	public static void main(String[] args) {
		// 실습
		// - Human 클래스를 상속해서 Doctor 클래스를 정의하세요.
		// 0) age 필드는 0으로 저장하고, roll 필드는 "의사"로 고정됩니다.
		// 1) 필드로 "진료과목"이 추가됩니다.
		//    변수명은 못정하겠으면 part라고 하세요.
		// 2) getName은 오버라이딩해서 <의사 XXX> 형태로 반환합니다.
		// 3) getRoll은 오버라이딩해서 <진료과목 : XXX> 형태로 반환합니다.
		// 4) greeting은 오버로딩해서 Human 객체를 받아서 그 이름을 읽어서
		//    인사를 하도록 정의하세요.
		Doctor kim = new Doctor("김사부", "일반외과");
		Human pat = new Human("부용주", "환자", 59);
		kim.greeting(); // 안녕하세요~
		kim.greeting(pat); // 부용주님 안녕하세요. 김사부입니다.
		System.out.println(kim.getName()); // 의사 김사부
		System.out.println(kim.getRoll()); // 진료과목 : 일반외과
	}
}
