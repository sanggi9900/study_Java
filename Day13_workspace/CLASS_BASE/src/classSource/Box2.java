package classSource;

public class Box2 {
	private String name;
	private boolean state;
	
	public void setName(String name) {
		// this ���λ� - �޼��带  �̿��ҷ��� ��ü��
		//             �ʵ带 �����ϱ� ���� ���λ�
		this.name = name;
		// �⺻�����δ� �ʵ���� �޼����� �Ű��������� ��ĥ ��
		// �̸� �����ϱ� ���� �뵵�� ����
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public boolean getState() {
		return state;
	}
	// setter/getter�� ����/�бⰡ �����̱� ������..
	// 1) �ٸ� �̸����� ������ �� ����
	// 2) �ʿ��� ��쿡�� �Ϻ� �ڵ尡 �߰��� �� ����
	public void open() {
		if (!state) state = true;
	}
	public void close() {
		if (state) state = false;
	}
}





