package classSpace;

public class Doctor extends Human {
	private String part;
	
	public Doctor(String name, String part) {
		super(name, "�ǻ�", 0);
		this.part = part;
	}
	// �������̵��� ������ ��ӿ����� ������
	public String getName() {
		return "�ǻ� " + name;
	}
	public String getRoll() {
		return "����о� : " + part;
	}
	// �����ε��� �⺻������ �̸��� ���� ���¿��� �Ű������� �ٸ��� ������
	public void greeting(Human that) {
		System.out.println(that.name + "�� �ȳ��ϼ���. " + name + "�Դϴ�.");
	}
}