package part3;

public class OverloadEX3 {
	// �����ε��� �Ű��������� �޼��带 �����ϴ� �뵵�� ���⿡
	// ���� �̸��� ���� �Ű������� ȣ���ϴ°� �ƴϸ� ���� �ٸ�
	// �޼���� ���еǾ� �νĵ�
	
	// �ڹ��� �޼��� �ߺ�������� : �����ε��� �̿���, �������ֱ�
	// - ��� �����ڵ�� �Ŵ��� �����ڵ忡�� �����ϴ� ��
	// - �������� �־��� �� �̿� ���� ���������� �߰�����
	public static void showNumber(int n1) {
		showNumber(1, n1);
	}
	public static void showNumber(int n1, int n2) {
		showNumber(n1, n2, 1);
	}
	public static void showNumber(int n1, int n2, int n3) {
		for (int a = n1; a <= n2; a += n3) {
			System.out.print( " " + a );
		} System.out.println(" �������");
	}
	
	public static void main(String[] args) {
		showNumber(6); // showNumber( 1,  6, 1 );
		showNumber(2, 7); // showNumber( 2,  7, 1 );
		showNumber( 1, 12, 2 );
	}
}