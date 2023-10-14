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
		System.out.printf("%s이(/가) %s을(/를) 회복시킴\n", this.name, that.name);
	}
	public void status() {
		System.out.printf("%s - (%d, %d)\n", name, hp, mp);
	}
	public void greeting() {
		System.out.println("안녕하세요.");
		System.out.println("추상화 + 접근제거 + 상속 + 오버라이딩 + 업캐스팅 + 다운캐스팅");
		System.out.println("총정리 문제였습니다.");
	}
}
