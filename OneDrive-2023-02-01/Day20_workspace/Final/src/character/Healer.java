package character;

public class Healer extends Playable {
	private int mp;
	public Healer(String name, int hp, int mp) {
		super(name, hp);
		this.mp = mp;
	}
	public void attack(Playable that) {
		that.hp += 20;
		this.mp -= 5;
		System.out.printf("%s��(/��) %s��(/��) ȸ����Ŵ\n", this.name, that.name);
	}
	public void status() {
		System.out.printf("%s - (%d, %d)\n", name, hp, mp);
	}
	public void greeting() {
		System.out.println("�ȳ��ϼ���.");
		System.out.println("�߻�ȭ + �������� + ��� + �������̵� + ��ĳ���� + �ٿ�ĳ����");
		System.out.println("������ ���������ϴ�.");
	}
}