package part3;

public class Overload1 {
	public static int getExpo(int n1, int n2) {
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
	public static double getExpo(double n1, int n2) {
		if (n2 < 0) return 0;
		else {
			double result = 1;
			while (n2 > 0) {
				result *= n1;
				n2 -= 1;
			}
			return result;
		}
	}
	public static void main(String[] args) {
		// # �⺻���� �޼��� �������
		// �޼����� ��ȯ���� �Ű������� �ڷ�����
		// 1) �������� ���Ƽ� ����
		//   -> �ش� ������ ���� ������ �ȵǱ� ������
		//      ����ȯ �Ǵ� �� �̻��� ���� ó������� ��
		// 2) ������ �ȵ� ��쿡�� �ٸ� �޼���� �غ� ����� ��
		//   -> �޼��尡 �þ�� ������ ã�Ƽ� ����ϱ� �������
		// - �̷��� �������� ó���� ����� �غ��� ���� �� ������ �ȵ�
		System.out.println("���1 : " + getExpo(2, 3));
		System.out.println("���2 : " + getExpo(4.2, 3));
	}
}