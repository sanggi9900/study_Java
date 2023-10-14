package classSpace;

public class Tank {
	private String name;
	private int hp;
	private int atk;
	
	public Tank(String name, int hp, int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}
	
	public String getName() { return name; }
	public int getHP() { return hp; }
	public int getAtk() { return atk; }
	
	// setName �н� : ���� ��ũ�� ���� ���� �𸣰� ��
	// setHp �н� : attackTo�� ���ϵ��� �ҷ��� ��
	// setAtk �н� : �Һ��ϴ� ���̶�� ������
	
	public void attackTo(Tank that) {
		if (that == null) return;
		else {
			// �ܼ��� ������ ����� ���� �����ߴٰ� �ƴ�
			// -> ���� ������ ���������� �ǹ���
			that.hp -= this.atk;
			if (that.hp < 0) that.hp = 0;
			// �� �Ŀ� �ʿ��� ����Ʈ/ȿ��/����� �ʿ��ϸ� ������ش�.
			System.out.println(this.name+"��/�� " + that.name+"��/�� �����߽��ϴ�.");
		}
	}
	public void report() {
		if (hp <= 0) System.out.println(name + " : �ı���");
		else System.out.println(name + " : " + hp);
	}
}


