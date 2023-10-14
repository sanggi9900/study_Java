package classSource;

// 생성자
public class Rock3 {
	private String material;
	private String shape;
	private double weight;
	// 필드 아래, set/get/기능 위
	// 생성자의 종류
	// 1) 기본 생성자 : 기본값 설정 / 초기화
	// - 없을 경우에는 객체 생성시에 반드시 값을 넣도록 강제함
//	public Rock3() {
//		material = "화강암";
//		shape = "흔한 모양";
//		weight = 0.5;
//	}
//	// 2) 일반 생성자 : 호출할 때 넣어준 값을 저장함
//	public Rock3(String mat) {
//		material = mat;
//		shape = "흔한 모양";
//		weight = 1;
//	}
//	public Rock3(String mat, String shape) {
//		material = mat;
//		this.shape = shape;
//		weight = 1;
//	}
//	public Rock3(String mat, String shape, double wei) {
//		material = mat;
//		this.shape = shape;
//		weight = wei;
//	}
	// 생성자는 메서드이기 때문에 오버로딩이 됨
	public Rock3() {
		// this
		// 1) 필드와 매개변수의 중복을 회피하기 위한 접두사
		// 2) 생성자에서는 다른 생성자를 호출하기 위한 예약어
		this("화강암", "흔한 모양", 0.5);
	}
	public Rock3(String mat) {
		this(mat, "흔한 모양", 1);
	}
	public Rock3(String mat, String shape) {
		this(mat, shape, 1);
	}
	public Rock3(String mat, String shape, double wei) {
		material = mat;
		this.shape = shape;
		weight = wei;
	}
	
	public void setShape(String sha) {
		shape = sha;
	}
	
	public String getMaterial() {
		return material;
	}
	public String getShape() {
		return shape;
	}
	
	public void canThrow() {
		System.out.println("부우우웅~!");
	}
}













