package character;

public class Warrior extends Playable {
	public Warrior(String name, int hp) {
		super(name, hp);
	}
	public void attack(Playable that) {
		that.hp -= 15;
		super.attack(that);
	}
	public void jump() {
		System.out.println("มกวมมกวม!");
	}
}