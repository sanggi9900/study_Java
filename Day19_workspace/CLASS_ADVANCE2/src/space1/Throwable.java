package space1;

// public abstract class Throwable
public interface Throwable {
	// # �⺻ �����ڴ� ��ӵ� �����̱� ������ �߰�/������ �ȵ�
	// �����ʵ� : ���λ�� public static�� �پ� ����
	// - static Ű���尡 ������, ��ü���� ��� ����
	// - ��ӹ��� Ŭ�������� ����/����ϰ� �ϱ� ����
	//   ���� �����ϴ� �뵵�� ����
	String property = "��ô����";
	// �޼���1 : �߻� �޼��� - ������ �°� �����ϴ� �޼���
	// public abstract void overThrow();
	void overThrow();
	// �޼���2 : �Ϲ� �޼��� - �⺻���� ������ �޼���
	// public void underThow() { ..; }
	default void underThrow() {
		System.out.println("���긶�� ����!");
	}
	// �޼���3 : ���� �޼��� - Static �ʵ带 �ٷ�� ����
	static void checkValue() {
		System.out.println(property);
	}
}



