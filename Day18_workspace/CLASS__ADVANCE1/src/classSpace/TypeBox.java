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
}

