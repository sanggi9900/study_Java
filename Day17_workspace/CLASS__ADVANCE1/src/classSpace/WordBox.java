package classSpace;

public class WordBox extends Box {
	// ���ǻ��� - ���ڿ��� �������Դϴ�.
	private String data;
	// 1) �����ڴ� �󸶳� ��� �ʿ��ұ�?
	// -> �⺻������ - ���� ��� ������� ��ü�� ����ڴ�
	// -> ��������� - ��ü ������ �ʿ��� ��Ȳ�� �� �غ��ϰ� ��
	public WordBox(String name, String data) {
		super(new String(name));
		this.data = new String(data);
	}
	// 2) �޼���� �⺻���� ���� Box���� ������
	// -> data�� �����ϴ� �޼��常 �غ���
	public void setData(String word) {
		if (state) data = word;
	}
	public String getData() {
		if (state) return data;
		else return "Unreadable";
	}
}