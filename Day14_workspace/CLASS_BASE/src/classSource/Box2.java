package classSource;

public class Box2 {
	private String name;
	private boolean state;
	
	public void setName(String name) {
		// this 접두사 - 메서드를  이용할려는 객체의
		//             필드를 지정하기 위한 접두사
		this.name = name;
		// 기본적으로는 필드명과 메서드의 매개변수명이 겹칠 때
		// 이를 구분하기 위한 용도로 사용됨
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public boolean getState() {
		return state;
	}
	// setter/getter는 저장/읽기가 목적이기 때문에..
	// 1) 다른 이름으로 설정될 수 있음
	// 2) 필요할 경우에는 일부 코드가 추가될 수 있음
	public void open() {
		if (!state) state = true;
	}
	public void close() {
		if (state) state = false;
	}
}






