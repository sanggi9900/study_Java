package myClass;

// 1. 극단적으로는, 다른 곳을 옮기기 위한 용도로만 써도 됨
// 2. 캡슐화(접근제어)를 더 정교하게, 더 완벽하게 달성한다.
//    -> 사용법이 인터페이스에 준비한 메서드로만 한정된다.
public interface Drivable {
	// 필드는 무조건 public static이다
	String interfaceName = "Drivable";
	// 메서드는 무조건 public abstract이다
	void showInfo();
	void drive();
	void stop();
}
