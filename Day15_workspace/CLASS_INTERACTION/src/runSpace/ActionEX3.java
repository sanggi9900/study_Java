package runSpace;

import classSpace.Human;

public class ActionEX3 {
	public static void main(String[] args) {
		// �ǽ�
		// Human Ŭ������ action �޼��带 �����ε��ؼ�
		// ���� Ŭ������ ��ü�� ���̸� 1�� ������Ű��
		// �޼��带 �����ϼ���.
		Human orc = new Human("��ũ","����",31);
		Human elf = new Human("����","�ü�",250);
		orc.action(elf);
		orc.action(elf);
		orc.action(elf);
		System.out.println("������ ���� :" + elf.getAge() + "��");
		elf.action(orc);
		elf.action(orc);
		elf.action(orc);
		System.out.println("��ũ�� ���� :" + orc.getAge() + "��");
	}
}