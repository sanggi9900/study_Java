package part2;

public class MethodEX3 {
	// �Ű������� �ִ� �޼��带 �غ��� �� ������ ��
	// - ���������� �Ű������� �غ��ϴ°� ����(�ִ� 5��, ���� 3�� ����)
	public static void showMax(int n1, int n2, int n3) {
		if (n1 == n2 && n2 == n3) System.out.println("���� �����ϴ�.");
		else { // n1 != n2 || n2 != n3 || n1 != n3
			int max = n1;
			if (max < n2) max = n2;
			if (max < n3) max = n3;
			System.out.println("���� ū �� : " + max);
		}
	}
	public static void main(String[] args) {
		showMax(1,2,3);
		showMax(3,2,1);
		showMax(1,3,2);
		showMax(2,2,3);
		showMax(3,2,3);
		showMax(3,3,3);
	}
}