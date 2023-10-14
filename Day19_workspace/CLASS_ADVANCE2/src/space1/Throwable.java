package space1;

// public abstract class Throwable
public interface Throwable {
	// # 기본 생성자는 약속된 상태이기 때문에 추가/수정이 안됨
	// 공용필드 : 접두사로 public static이 붙어 있음
	// - static 키워드가 붙으면, 객체없이 사용 가능
	// - 상속받은 클래스에게 전달/사용하게 하기 위한
	//   값을 설정하는 용도로 사용됨
	String property = "투척가능";
	// 메서드1 : 추상 메서드 - 사정에 맞게 정의하는 메서드
	// public abstract void overThrow();
	void overThrow();
	// 메서드2 : 일반 메서드 - 기본값이 설정된 메서드
	// public void underThow() { ..; }
	default void underThrow() {
		System.out.println("서브마린 투구!");
	}
	// 메서드3 : 정적 메서드 - Static 필드를 다루기 위함
	static void checkValue() {
		System.out.println(property);
	}
}




