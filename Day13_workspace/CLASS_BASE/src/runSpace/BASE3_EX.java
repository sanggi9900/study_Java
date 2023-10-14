package runSpace;

import classSource.Box3;

public class BASE3_EX {
	public static void main(String[] args) {
		// 실습
		// Box3 클래스에 생성자를 추가하세요.
		// - Box의 상태는 "항상" 닫혀 있는 상태로 출고됩니다.
		// - Box의 상태는 오로지 "열기"/"닫기"에 의해서만 변경됩니다.
		// - Box의 이름은 출고시에는 "포장용상자"로 설정됩니다.
		// - 고객이 요청하면 미리 이름을 작성해서 출고할 수 있습니다.
		// - Box의 이름은 손쉽게 바꿀 수 있습니다.
		
		// Box3 클래스의 setter/getter를 조정하세요.
		// - setter는 하나가 확실하게 중복됩니다.
		// - getter는 필요한지 여부를 판단해서 조정하세요.
		
		Box3 box1 = new Box3();
		Box3 box2 = new Box3("케이크용 상자");
		box1.open();
		box2.open();
		System.out.println(box1.getName() + " " + box1.getState());
		box1.close();
		System.out.println(box1.getName() + " " + box1.getState());
	}
}
