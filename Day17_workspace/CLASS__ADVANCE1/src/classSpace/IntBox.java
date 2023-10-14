package classSpace;
// ����� �� �� ������ ����
// 1. �θ� Ŭ������ �ڽ� Ŭ������� ������ ������
// - �θ� : ��ӹ��� Ŭ����
// - �ڽ� : �θ� ��ӹ��� Ŭ����
// - �� ���� �������� �־�� ��
//   -> �ڽ��� �θ�� / ������ �ʱⱸ��
// 2. �θ� Ŭ������ �ʵ� ������� �����ؾ� ��
// - ����(default) ~ protected�� �����Ǿ�� ��
// 3. �θ𿡼� �����ϴ� �͵��� �ִ��� Ȱ����
// - �� �� �ʿ��� ���� ���� ����� ���� 
public class IntBox extends Box {
	private int data;
	
	public IntBox() {
		// ��ӿ��� this�� �ڱ��ڽ�(�ش�Ŭ����)�� �ǹ���
		// ���⼭�� IntBox Ŭ������ �ǹ���
		this("��������");
	}
	public IntBox(String name) {
		// super : �θ��� �ʵ�/�޼���/�����ڸ�
		//         �̿��ϱ� ���� Ű����
		// ���⼭�� Box Ŭ������ �ǹ���
		super(name);
		data = 0;
	}
	// # �θ� Ŭ������ �⺻ �����ڰ� ���� ���
	// - �ݵ�� Ư�� �ʵ带 ä���� �Ѵٴ� ������
	// # �θ� Ŭ������ �⺻ �����ڰ� ���� ���
	// - ���� �ٸ� �����ڰ� ���� �˾Ƽ� ä���� �ǹ�
	public IntBox(IntBox that) {
		// super�� �Ⱦ���...
		// �θ��� �⺻ �����ڸ� ������ �ڵ�ȣ���� 
		this.name = new String(that.name);
		this.state = that.state;
		this.data = that.data;
	}
	
 	public void setData(int data) {
 		if (state) this.data = data;
 		else return;
 	}

	public int getData() {
		if (state) return this.data;
		else return 0;
	}
}