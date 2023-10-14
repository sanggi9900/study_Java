package runSpace;

import classSpace.Robot;

public class INTERACTION_EX3 {
	public static void main(String[] args) {
		// 상호작용 : 같은 수준의 객체끼리의 상호작용
		Robot rob1 = new Robot();
		Robot rob2 = new Robot();
		rob1.show(); rob2.show();
		
		// rob1 입장
		// -> 상대방에게 10만큼의 데미지를 입혔음
		rob1.punchTo(rob2);
		// rob2 이방
		// -> 상대방으로부터 10만큼의 데미지를 입었음
		
		rob1.show(); rob2.show();
		rob2.punchTo(rob1);
		
		rob1.show(); rob2.show();
	}
}
