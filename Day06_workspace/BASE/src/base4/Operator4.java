package base4;

public class Operator4 {
	public static void main(String[] args) {
		// ���Կ����� : ������ ������ �������ִ� ������
		// - ������ ���, �� �ڷ����� ũ�⸦ �������� �� Ŀ���ų� ���� ũ���
		//   �����Ͽ� ������ �� ����
		// 1 Byte(boolean)
		// 2 Byte(short, char, byte)
		// 4 Byte(int, float)
		// 8 Byte(long, double)
		int num1 = 100;
		long num2 = num1;	// �� ū �����̴� ����
		float fnum1 = num1;	// �Ǽ��� �������� �� ŭ
		
		// - ū ���� ���� �����δ� ����ȯ���̴� �� �� ����
		double fnum2 = 3.14;
		// long num3 = fnum2; ����ȯ �ʿ� -> long num3 = (long)fnum2;
		// int num3 = fnum2; ����ȯ �ʿ� -> int num3 = (int)fnum2;
		// - ����ô� ���Կ������δ� ������� ������ ����
		//   �ҷ��� �޼��带 �̿��ؾ߸� ������
		
		// ���մ��Կ����� : Ư�� ������ ������� �ٿ� ���� ������
		// - �����뵵�θ� ����ϰ� ��
		// - ���� = ���� + @ -> ���� += @
		// - ������ �����ϸ� ���� �ܿ��� ���� ����� ���� �ʿ䰡 ����
		int num4 = 100;
		num4 += 5; // num4 = (int)(num4 + 5);
		System.out.println("num4 : " + num4);
		// �տ� ����ȯ�� �پ� ������ ����
		num4 += 3.14; // num4 = (int)(num4 + 3.14);
		System.out.println("num4 : " + num4);
		
		// ���������� : 1�� ����/�����ϴ� ������
		num4++; // num4 += 1 -> num4 = num4 + 1
		System.out.println("num4 : " + num4);
		num4--; // num4 -= 1 -> num4 = num4 - 1
		System.out.println("num4 : " + num4);
		
		// ���� �뵵 : �ٸ� ����Ŀ� ����� ���뿬�� �뵵
		int result1 = num4++ +5; // ��ġ : �ٸ� ������� �����ϰ� ����
		System.out.printf("%d, %d\n", result1, num4);
		int result2 = ++num4 +5; // ��ġ : ���� ������ �ٸ� ���� ����
		System.out.printf("%d, %d\n", result2, num4);
		
	}
}





