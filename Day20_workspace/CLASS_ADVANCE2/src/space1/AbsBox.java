package space1;

// 클래스에 붙은 abstract 키워드
// 1) 추상클래스를 식별하기 위한 정보
// 2) 객체를 만들 수 없음을 의미함
public abstract class AbsBox {
	protected String name;
	protected boolean isOpen;
	
	public AbsBox() {
		name = "";
		isOpen = false;
	}
	// 메서드에 붙은 abstract 키워드
	// 1) 추상메서드를 만들기 위한 키워드
	// 2) 오버라이딩을 강제하는 용도
	public abstract void open();	// 본문(Body)이 없는
	public abstract void close();	// 이름만 존재하는 메서드
	// 그 외의 선택해서 오버라이딩할 메서드는 똑같이 작성하면 됨
	public void printInfo() {
		System.out.println(name + " : " + isOpen);
	}
}





