package whilestate;

public class While2 {
	public static void main(String[] args) {
		// 문자열 "같은 것들" 의 비교 : 요소(item)을 모두 비교해줘야 함
		String word1 = "ABC";
		String word2 = "ABC";
		/*
		// 문자열의 비교는 인덱스를 이용해 같은 위치를 지정해서 비교해야 함
		// 유한반복 : 정해진 범위만큼, 반복을 수행함
		// 변화량은 상수값이어야 함
		int index = 0;
		boolean result = true;
		// length() : 문자열 "같은 것들" 의 크기값을 불러올 수 있는 메서드
		if (word1.length() != word2.length()) result = false;
		else {
			while (index <= 2) {
				result = word1.charAt(index) == word2.charAt(index);
				if (!result) break;
				index += 1;
			}
		}
		*/
		// equals() : 대상과 서로 같은지 여부를 알려주는 메서드 
		boolean result = word1.equals(word2);
		System.out.println(result);
	}
}


