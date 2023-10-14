package classSpace;
// 상속을 할 때 주의할 사항
// 1. 부모 클래스와 자식 클래스라는 개념이 존재함
// - 부모 : 상속받을 클래스
// - 자식 : 부모를 상속받은 클래스
// - 이 둘은 연관성이 있어야 함
//   -> 자식은 부모다 / 볼펜은 필기구다
// 2. 부모 클래스의 필드 접근제어를 조정해야 함
// - 생략(default) ~ protected로 설정되어야 함
// 3. 부모에서 제공하는 것들은 최대한 활용함
// - 그 중 필요한 것은 새로 만들어 보충 
public class IntBox extends Box {
	private int data;
	
	public IntBox() {
		// 상속에서 this는 자기자신(해당클래스)를 의미함
		// 여기서는 IntBox 클래스를 의미함
		this("정수상자");
	}
	public IntBox(String name) {
		// super : 부모의 필드/메서드/생성자를
		//         이용하기 위한 키워드
		// 여기서는 Box 클래스를 의미함
		super(name);
		data = 0;
	}
	// # 부모 클래스에 기본 생성자가 없을 경우
	// - 반드시 특정 필드를 채워야 한다는 강제용
	// # 부모 클래스에 기본 생성자가 있을 경우
	// - 보통 다른 생성자가 없고 알아서 채우라는 의미
	public IntBox(IntBox that) {
		// super를 안쓰면...
		// 부모의 기본 생성자를 무조건 자동호출함 
		this.name = new String(that.name);
		this.state = that.state;
		this.data = that.data;
	}
	
 	public void setData(int data) {
 		if (state) this.data = data;
 		else return;
 	}

	public int getData() {
		if (state) return this.data;
		else return 0;
	}
}