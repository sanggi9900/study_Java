package runSpace;

import classSpace.Human;

public class ActionEX3 {
	public static void main(String[] args) {
		// 실습
		// Human 클래스의 action 메서드를 오버로딩해서
		// 같은 클래스의 객체의 나이를 1씩 증가시키는
		// 메서드를 정의하세요.
		Human orc = new Human("오크","전사",31);
		Human elf = new Human("엘프","궁수",250);
		orc.action(elf);
		orc.action(elf);
		orc.action(elf);
		System.out.println("엘프의 나이 :" + elf.getAge() + "세");
		elf.action(orc);
		elf.action(orc);
		elf.action(orc);
		System.out.println("오크의 나이 :" + orc.getAge() + "세");
	}
}
