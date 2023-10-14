package space1;

public class ValueBox extends AbsBox implements Throwable {
	private int front;
	private double back;
	
	public ValueBox(String name, double value) {
		this.name = name;
		// �̰� ���ڿ��̸�...
		// ��ü����, �Ϻη� ���н��� �����ϴ°�
		// ���� ���� ����
		front = (int)value;
		back = value % 1;
	}
	public void open() {
		isOpen = true;
	}
	public void close() {
		isOpen = false;
	}
	public double getValue() {
		if (isOpen) return front + back;
		else return 0;
	}
	public void overThrow() {
		System.out.println("���� �����Ⱦƹ�����!");
	}
}












