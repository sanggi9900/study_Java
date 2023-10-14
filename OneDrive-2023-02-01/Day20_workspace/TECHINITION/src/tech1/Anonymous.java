package tech1;

class Rock {
	protected String name;
	public Rock() { name = "돌"; }
	public String toString() { return name; }
}
interface Action {
	void shoot();
}
abstract class ActionClass {
	protected Rock rock;
	public ActionClass(Rock rock) {
		this.rock = rock;
	} 
	public abstract void shoot();
}

public class Anonymous {
	public static void EX1() {
		Action rock = new Action() {
			// 1. 필드 추가 가능. 취급은 private.
			String name = "돌";
			public void shoot() {
				System.out.println(name + "을 던졌습니다!");
			}
			// 2. 메서드 추가 가능. 취급은 private.
			// - 오버로딩 취급이 안됨
			// - 쓸려면 다른 메서드에서 호출해야 함
			/*
			public void shoot(int num) {
				System.out.println("슛!!!!");
				System.out.println(data1);
				System.out.println(data2);
			}
			*/
		};
		rock.shoot();
	}
	public static void EX2() {
		Rock uglyRock = new Rock() {
			// 생성자는 추가할 수 없음
			// 이름이 없는 ★자식 클래스★를 실시간으로
			// 생성하기 때문에 접근제어를 그대로 따라간다.
			public String toString() {
				return "못생긴 " + name;
			}
		};
		System.out.println(uglyRock);
	}
	public static void main(String[] args) {
		// 인터페이스는 융통성이 떨어지니 간혹 추상클래스를
		// 인터페이스처럼 만들어서 쓰는 경우도 있다.
		Rock uglyRock = new Rock();
		
		ActionClass rock = new ActionClass(uglyRock) {
			public void shoot() {
				System.out.println(rock + "을 던졌어요!");
			}
		};
		rock.shoot();
	}
}












