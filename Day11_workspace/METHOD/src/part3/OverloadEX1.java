package part3;

public class OverloadEX1 {
	// �����ε��� ������ ��ġ�� ���
	// 1) �Ű������� ����
	// - ������ �ٸ��� �ڷ����� �޶� �ٸ� �޼���� ������
	// 2) �Ű������� �ڷ���
	// - �ڷ����� �ٸ��� ������ ���Ƶ� �ٸ� �޼���� ���е�
	// 3) ��ȯ���� ���⿡ �������� ������ ����
	
	// +@) �����ε��� �����ڵ尡 �����Ѱ� ���ɾ���, ���� ����� ������ ���� �߿���
	public static int function(int n1, int n2) {
		return n1 + n2;
	}
	public static String function(String s1, String s2) {
		return s1 + s2;
	}
	// +@) ������� �޸������� ���� �����ε����� ��ġ�ø� �ȵ�
	public static int function(int n1, int n2, int n3) {
		return n1 * n2 * n3;
	}
	
	public static void main(String[] args) {
		int result1 = function(10,20);
		String result2 = function("A","B");
		int result3 = function(3,4,5);
		System.out.println(
				"�� ������ �� : " + result1
				+"\n�� ���ڿ��� �� : " + result2
				+"\n�� ������ �� : " + result3
				);
	}
}