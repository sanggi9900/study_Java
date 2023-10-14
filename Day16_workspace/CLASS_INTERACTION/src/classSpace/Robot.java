package classSpace;

public class Robot {
	private String name;
	private int hp;
	public Robot() {
		name = "로봇";
		hp = 100;
	}
	// A.B(C,D)
	// -> A가 D에게 C를 이용해서 B한다.
	public void rename(String newName, Rock that) {
		that.setName(newName);
	}
	// -> A가 C에게 D라는 것을 B한다.
	public void rename(Rock that, String newName) {
		that.setName(newName);
	}
	// 둘 중 하나로만 준비함
	public void show() {
		System.out.println(name + " " + hp);
	}
	// 같은 클래스끼리는 멤버의 사용에 제한이 없음
	public void punchTo(Robot that) {
		that.hp -= 10;
	}
}






