package runSpace;

import classSource.Bird;

public class BASE12_Review {
	public static void main(String[] args) {
		// 실습
		// Bird 클래스를 정의하세요.
		// 특성 : 이름 / 종류 / 날고 있는지 아닌지 상태
		// 동작 : 이륙 / 날기 / 착륙
		// 아래의 코드가 실행됩니다.
		Bird sparrow = new Bird();
		sparrow.setName("짹짹이");
		sparrow.setSpec("참새");
		sparrow.setStat(false);
		System.out.println(
				sparrow.getName() + " " + sparrow.getStat()
				);	// 짹짹이 false
		sparrow.takeoff();	// 이륙
		sparrow.fly();		// 나는 중
		System.out.println(
				sparrow.getName() + " " + sparrow.getStat()
				);	// 짹쨱이 true
		sparrow.landing();	// 착륙
		sparrow.fly();		// 땅에 앉은 새는 날지 않습니다.
	}
}

