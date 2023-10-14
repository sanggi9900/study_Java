package runSpace;

import classSpace.Robot;
import classSpace.Rock;

public class INTERACTION_EX2 {
	public static void main(String[] args) {
		// A.B(C) -> A가 C에게 B를 한다.
		String word = "Apple";
		System.out.println(word.compareTo("ABC"));
		
		Robot robot = new Robot();
		Rock rock = new Rock();
		
		// A.B(C,D)
		// -> A가 D에게 C를 이용해서 B한다.
		robot.rename("모난돌", rock);
		
		// -> A가 C에게 D라는 것을 B한다.
		robot.rename(rock, "보석");
	}
}
