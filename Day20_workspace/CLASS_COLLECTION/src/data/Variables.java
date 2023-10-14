package data;

public class Variables implements Comparable<Variables> {
	private int data1;
	private int data2;
	public Variables(int data1, int data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	public void set1(int value) {
		data1 = value;
	}
	public void set2(int value) {
		data2 = value;
	}
	public int get1() {
		return data1;
	}
	public int get2() {
		return data2;
	}
	public String toString() {
		return "("+data1+","+data2+")";
	}
	// compareTo : Comparable �������̽��� �޼���
	// - equals���� �� ���뼺�� ���� �޼���
	// - ��ȯ���� �����̱� ������ �����ؾ� ��
	// - ������� ���� ������ �����Ǹ�, ���ǽ��� ���Ƿ� ������
	public int compareTo(Variables that) {
		// ���� �� ���� ���  -1
		if (this.data1 < that.data1) return -1;
		// ������ 0
		else if (this.data1 == that.data1) return 0;
		// ���� �� ������ 1
		else return 1;
	}
}









