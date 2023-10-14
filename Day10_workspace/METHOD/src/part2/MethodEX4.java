package part2;

public class MethodEX4 {
	public static int getQuot(int n1, int n2) {
		// ���� ���길 �ϴ� �޼��忡�� 0�� ũ�� 2������ �ǹ���
		// 1) �������� ��¥�� 0�� ����
		// 2) �� ������ ������ �� ���� ������ ����
		if (n2 == 0) return 0;
		else return n1 / n2;
	}
	public static int getExpo(int n1, int n2) {
		// �ŵ������� ����� ����ҷ��� �Ǽ����� ���� ����
		if (n2 < 0) return 0;
		else {
			int result = 1;
			while (n2 > 0) {
				result *= n1;
				n2 -= 1;
			}
			return result;
		}
	}
	public static void main(String[] args) {
		// �����ڵ�
		int result1 = getQuot(10, 3);
		int result2 = getQuot(10, 0);
		int result3 = getExpo(2, 3);
		int result4 = getExpo(2, -1);
		System.out.println("��1 : " + result1);
		System.out.println("��2 : " + result2);
		System.out.println("�ŵ�����1 : " + result3);
		System.out.println("�ŵ�����2 : " + result4);
	}
}