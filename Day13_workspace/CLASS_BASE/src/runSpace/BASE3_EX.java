package runSpace;

import classSource.Box3;

public class BASE3_EX {
	public static void main(String[] args) {
		// �ǽ�
		// Box3 Ŭ������ �����ڸ� �߰��ϼ���.
		// - Box�� ���´� "�׻�" ���� �ִ� ���·� ����˴ϴ�.
		// - Box�� ���´� ������ "����"/"�ݱ�"�� ���ؼ��� ����˴ϴ�.
		// - Box�� �̸��� ����ÿ��� "��������"�� �����˴ϴ�.
		// - ������ ��û�ϸ� �̸� �̸��� �ۼ��ؼ� ����� �� �ֽ��ϴ�.
		// - Box�� �̸��� �ս��� �ٲ� �� �ֽ��ϴ�.
		
		// Box3 Ŭ������ setter/getter�� �����ϼ���.
		// - setter�� �ϳ��� Ȯ���ϰ� �ߺ��˴ϴ�.
		// - getter�� �ʿ����� ���θ� �Ǵ��ؼ� �����ϼ���.
		
		Box3 box1 = new Box3();
		Box3 box2 = new Box3("����ũ�� ����");
		box1.open();
		box2.open();
		System.out.println(box1.getName() + " " + box1.getState());
		box1.close();
		System.out.println(box1.getName() + " " + box1.getState());
	}
}