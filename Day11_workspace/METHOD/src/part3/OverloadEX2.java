package part3;

public class OverloadEX2 {
	// �����ε��� ��������
	// 0) �� �޼����� �� ����(����)�� ���ߴ°�?
	// 1) ���� ����� ����� ���°�? ex) ��ģ��
	// 2) ������� ���� �����°�?
	// 3) ������� ������ ��� ������?
	public static int getSum(int limit) {
		int result = 0;
		while (limit != 0) {
			result += limit;
			limit += ((limit > 0) ? -1 : 1);
		} return result;
	}
	public static int getSum(double value){
		System.out.println("����Ұ�");
		return 0;
	}
	public static int getSum(String value){
		System.out.println("����Ұ�");
		return 0;
	}
	public static void main(String[] args) {
		int result1 = getSum(-5);
		int result2 = getSum(15);
		int result3 = getSum(3.14);
		int result4 = getSum("8");
		System.out.println(
				"�� : " + result1
				+"\n�� : " + result2
				+"\n�� : " + result3
				+"\n�� : " + result4
				);
	}
}