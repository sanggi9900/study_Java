package classSpace;

// ���׸� Ŭ���� ���ǹ��
// - �����ϴ� Ŭ������ �̸� ���� <E>�� �߰���
// - E : �ڷ����� �ĺ��ϱ� ���� �±�
public class TypeBox<E> extends Box {
	// ������ : �ڷ����� ���� ������
	private E data;
	
	public TypeBox(String name, E data) {
		super(name);
		this.data = data;
	}
	
	public void setData(E data) {
		if (state) this.data = data;
	}
	public E getData() {
		// ���ǻ��� : ��ȯ���� ���׸��̸�,
		//          ������ �ڷ������� ��ȯ��ų �� ����
		if (state) return data;
		// ����� ��ȯ���� �ʿ��ϸ� null ó���� ������
		else return null;
		// - �ƴϸ� ��ȯ���� ������ �ϳ��� ���Ͻ��ѹ���
	}
	// Object Ŭ������ �޼��带 �������̵�1
	public String toString() {
		if (state) return "" + data;
		else return "Unreadable";
	}
	// Object Ŭ������ �޼��带 �������̵�2
	public boolean equals(Object that) {
		if (that instanceof TypeBox) {
			TypeBox<Integer> box = (TypeBox<Integer>)that;
			// getData()�� �ش� �ڽ��� open�Ǿ� ���� ������ �Ұ�
			// data�� ���׸��̸� �������̱⿡ equals�� ����
			if (data.equals(box.data)) return true;
			else return false;
		}
		else return false;
	}
}







