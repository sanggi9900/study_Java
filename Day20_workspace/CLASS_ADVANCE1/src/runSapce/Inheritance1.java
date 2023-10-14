package runSapce;

import classSpace.IntBox;

public class Inheritance1 {
	public static void main(String[] args) {
		// 상속 : 설계도(class)를 이어받아 이용하는 것
		// - "확장"보다는 "구체화"된다.
		// - "범용"에서 "특화"로 바뀐다.
		// - 객체 생성 후 사용보다는 클래스 정의과정에 개입함
		IntBox ibox1 = new IntBox("변수1");
		IntBox ibox2 = new IntBox("변수2");
		IntBox ibox3 = new IntBox(ibox2);
		ibox1.open();
		ibox1.setData(100);
		System.out.println(ibox1.getData());
		// 상속시 주의사항 : 생성자
	}
}
