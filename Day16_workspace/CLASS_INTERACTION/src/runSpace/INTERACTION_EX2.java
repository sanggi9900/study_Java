package runSpace;

import classSpace.Robot;
import classSpace.Rock;

public class INTERACTION_EX2 {
	public static void main(String[] args) {
		// A.B(C) -> A�� C���� B�� �Ѵ�.
		String word = "Apple";
		System.out.println(word.compareTo("ABC"));
		
		Robot robot = new Robot();
		Rock rock = new Rock();
		
		// A.B(C,D)
		// -> A�� D���� C�� �̿��ؼ� B�Ѵ�.
		robot.rename("�𳭵�", rock);
		
		// -> A�� C���� D��� ���� B�Ѵ�.
		robot.rename(rock, "����");
	}
}