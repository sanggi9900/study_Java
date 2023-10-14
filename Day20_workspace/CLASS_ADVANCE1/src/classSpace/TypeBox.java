package classSpace;

// 제네릭 클래스 정의방법
// - 정의하는 클래스의 이름 옆에 <E>를 추가함
// - E : 자료형을 식별하기 위한 태그
public class TypeBox<E> extends Box {
	// 적용방법 : 자료형에 몽땅 투입함
	private E data;
	
	public TypeBox(String name, E data) {
		super(name);
		this.data = data;
	}
	
	public void setData(E data) {
		if (state) this.data = data;
	}
	public E getData() {
		// 주의사항 : 반환형이 제네릭이면,
		//          고정된 자료형으로 반환시킬 수 없음
		if (state) return data;
		// 공통된 반환값이 필요하면 null 처리로 대응함
		else return null;
		// - 아니면 반환값의 종류를 하나로 통일시켜버림
	}
	// Object 클래스의 메서드를 오버라이딩1
	public String toString() {
		if (state) return "" + data;
		else return "Unreadable";
	}
	// Object 클래스의 메서드를 오버라이딩2
	public boolean equals(Object that) {
		if (that instanceof TypeBox) {
			TypeBox<Integer> box = (TypeBox<Integer>)that;
			// getData()는 해당 박스가 open되어 있지 않으면 불가
			// data는 제네릭이면 참조형이기에 equals로 비교함
			if (data.equals(box.data)) return true;
			else return false;
		}
		else return false;
	}
}








