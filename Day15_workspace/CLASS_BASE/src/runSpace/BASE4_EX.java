package runSpace;

import classSource.Human;

public class BASE4_EX {
	public static void main(String[] args) {
		// �ǽ�1
		// Human Ŭ������ �����ϼ���.
		// Ư�� : �̸�, ����, ����
		// ���� : �λ��ϱ�(greeting), �ൿ�ϱ�(action)
		
		// �ǽ�2
		// ������ Ŭ������ �̿��Ͽ� ��ü�� �����
		// �ش� ��ü�� ����غ�����.
		// ��� ��������� �����Դϴ�.
		Human person1 = new Human();
		Human hong = new Human("ȫ�浿", 28);
		Human go = new Human("���浿", "����", 45);
		person1.greeting();
		hong.greeting();
		go.greeting();
		System.out.printf("%s %s %d\n",
				person1.getName(),
				person1.getRoll(),
				person1.getAge()
				);
		System.out.printf("%s %s %d\n",
				hong.getName(),
				hong.getRoll(),
				hong.getAge()
				);
		System.out.printf("%s %s %d\n",
				go.getName(),
				go.getRoll(),
				go.getAge()
				);
	}
}









