package classSpace;

public class Robot {
	private String name;
	private int hp;
	public Robot() {
		name = "�κ�";
		hp = 100;
	}
	// A.B(C,D)
	// -> A�� D���� C�� �̿��ؼ� B�Ѵ�.
	public void rename(String newName, Rock that) {
		that.setName(newName);
	}
	// -> A�� C���� D��� ���� B�Ѵ�.
	public void rename(Rock that, String newName) {
		that.setName(newName);
	}
	// �� �� �ϳ��θ� �غ���
	public void show() {
		System.out.println(name + " " + hp);
	}
	// ���� Ŭ���������� ����� ��뿡 ������ ����
	public void punchTo(Robot that) {
		that.hp -= 10;
	}
}





