package whilestate;

public class While2 {
	public static void main(String[] args) {
		// ���ڿ� "���� �͵�" �� �� : ���(item)�� ��� ������� ��
		String word1 = "ABC";
		String word2 = "ABC";
		/*
		// ���ڿ��� �񱳴� �ε����� �̿��� ���� ��ġ�� �����ؼ� ���ؾ� ��
		// ���ѹݺ� : ������ ������ŭ, �ݺ��� ������
		// ��ȭ���� ������̾�� ��
		int index = 0;
		boolean result = true;
		// length() : ���ڿ� "���� �͵�" �� ũ�Ⱚ�� �ҷ��� �� �ִ� �޼���
		if (word1.length() != word2.length()) result = false;
		else {
			while (index <= 2) {
				result = word1.charAt(index) == word2.charAt(index);
				if (!result) break;
				index += 1;
			}
		}
		*/
		// equals() : ���� ���� ������ ���θ� �˷��ִ� �޼��� 
		boolean result = word1.equals(word2);
		System.out.println(result);
	}
}

