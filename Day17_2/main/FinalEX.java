package main;

import character.Healer;
import character.Playable;
import character.Warrior;
import character.Wizard;

public class FinalEX {
	public static void main(String[] args) {
		Playable pc1 = new Playable("�����ֹ�", 100);
		Playable pc2 = new Warrior("����", 200);
		Playable pc3 = new Wizard("������", 100, 200);
		Playable pc4 = new Healer("�Ű�", 50, 300);
		pc1.status(); // �����ֹ� - (100)
		pc2.status(); // ���� - (200)
		pc3.status(); // ������ - (100, 200)
		pc4.status(); // �Ű� - (50, 300)
		pc1.attack(pc4); // �����ֹ���(/��) �Ű���(/��) ����
		pc4.attack(pc3); // �Ű���(/��) ��������(/��) ȸ����Ŵ
		pc3.attack(pc2); // ��������(/��) ������(/��) ����
		pc2.attack(pc1); // ������(/��) �����ֹ���(/��) ����
		pc1.status(); // �����ֹ� - (80)
		pc2.status(); // ���� - (175)
		pc3.status(); // ������ - (120, 190)
		pc4.status(); // �Ű� - (45, 295)
		Warrior war1 = (Warrior)pc2;
		Wizard wiz1 = (Wizard)pc3;
		Healer hea1 = (Healer)pc4;
		war1.jump();
		wiz1.meditation();
		hea1.greeting();
	}
}