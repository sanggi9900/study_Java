package space1;

// # Ŭ���� ������ ���� - ������ ������ �и�
// ������ ����ϴ� �߻�Ŭ������
// �̸� �̿��ϴ� �������̽��� ������ �������� ��
public class Human extends Body implements Action {
	public Human(String name, int age) {
		super(name, age);
	}
	public void greeting() {
		System.out.println("�ȳ��ϼ���~");
	}
	public void introduce() {
		System.out.printf("�� �̸��� %s�̰�, ���̴� %d���Դϴ�.\n",name,age);
	}
}