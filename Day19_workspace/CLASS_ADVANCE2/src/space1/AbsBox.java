package space1;

// Ŭ������ ���� abstract Ű����
// 1) �߻�Ŭ������ �ĺ��ϱ� ���� ����
// 2) ��ü�� ���� �� ������ �ǹ���
public abstract class AbsBox {
	protected String name;
	protected boolean isOpen;
	
	public AbsBox() {
		name = "";
		isOpen = false;
	}
	// �޼��忡 ���� abstract Ű����
	// 1) �߻�޼��带 ����� ���� Ű����
	// 2) �������̵��� �����ϴ� �뵵
	public abstract void open();	// ����(Body)�� ����
	public abstract void close();	// �̸��� �����ϴ� �޼���
	// �� ���� �����ؼ� �������̵��� �޼���� �Ȱ��� �ۼ��ϸ� ��
	public void printInfo() {
		System.out.println(name + " : " + isOpen);
	}
}




