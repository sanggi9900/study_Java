package base2;

public class OutputEX2 {
	public static void main(String[] args) {
		// �ǽ� - ���Ĺ��� �����غ���
		// %5.3f
		// 5 : 5ĭ Ȯ���� ��������, ������ȣ�� ������ ��������.
		// .3 : �Ҽ��� 3�ڸ� �ݿø�ó��. ���ڿ��̸� ���ڼ� ����.
		// f : ����� �ν�(�ؼ�)�ϴ� ���
		String word = "ApplePie";
		double value = 3.345678;
		// �ǽ� ���� �������� �̿��� �Ʒ��� ���� ����ϼ���.
		// �� ���Ĺ��ڰ� ���������ڸ� �� Ȱ���ϼ���.
		
		// #    Apple#
		System.out.printf("#%9.5s#\n", word);
		// #Apple    #
		System.out.printf("#%-9.5s#\n", word);
		// #    3.346#
		System.out.printf("#%9.3f#\n", value);
		// #3.35     #
		System.out.printf("#%-9.2f#\n", value);
		// #3.3   App#
		System.out.printf("#%-6.1f%.3s#\n", value, word);
		System.out.printf("#%.1f%6.3s#\n", value, word);
	}
}







