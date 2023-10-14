package main;

import character.Healer;
import character.Playable;
import character.Warrior;
import character.Wizard;

public class FinalEX {
	public static void main(String[] args) {
		Playable pc1 = new Playable("마을주민", 100);
		Playable pc2 = new Warrior("전사", 200);
		Playable pc3 = new Wizard("마법사", 100, 200);
		Playable pc4 = new Healer("신관", 50, 300);
		pc1.status(); // 마을주민 - (100)
		pc2.status(); // 전사 - (200)
		pc3.status(); // 마법사 - (100, 200)
		pc4.status(); // 신관 - (50, 300)
		pc1.attack(pc4); // 마을주민이(/가) 신관을(/를) 공격
		pc4.attack(pc3); // 신관이(/가) 마법사을(/를) 회복시킴
		pc3.attack(pc2); // 마법사이(/가) 전사을(/를) 공격
		pc2.attack(pc1); // 전사이(/가) 마을주민을(/를) 공격
		pc1.status(); // 마을주민 - (80)
		pc2.status(); // 전사 - (175)
		pc3.status(); // 마법사 - (120, 190)
		pc4.status(); // 신관 - (45, 295)
		Warrior war1 = (Warrior)pc2;
		Wizard wiz1 = (Wizard)pc3;
		Healer hea1 = (Healer)pc4;
		war1.jump();
		wiz1.meditation();
		hea1.greeting();
	}
}