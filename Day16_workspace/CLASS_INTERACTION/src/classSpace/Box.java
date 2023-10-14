package classSpace;

public class Box {
	private String name;
	private boolean state;
	
	public Box() {
		this("����� ����");
	}
	public Box(String name) {
		this.name = name;
		state = false;
	}
	// ���� ������
	// - �ʵ忡 �������� ���� ���
	//   �ش� �ʵ带 �����Ͽ� ���� ��������
	//   ���� �ٸ� ��ü�� ������ ����
	// - ������ �ʵ�� �����Ǹ� ��ġ������ ����
	public Box(Box that) {
		this.name = new String(that.name);
		this.state = that.state;
	}
	
 	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public boolean getState() {
		return state;
	}

	public void open() {
		if (!state) state = true;
	}
	public void close() {
		if (state) state = false;
	}
}





