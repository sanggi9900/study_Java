package runSpace;

import classSpace.Human;

public class INTERACTION_EX1 {
	public static void main(String[] args) {
		// �ڽ��� �̰� ��� �����ϸ� ������ / ȭ��ĭ�̶�鼭 �̿� ����
		
		// ����� ������ ��/��Ƽ/ä�ù�/�¼��� ��
		Human[] car_seat = new Human[4];
		System.out.println(car_seat[0]);	// �迭�� ���� ���Ŀ��� �������
		// ���� ���� - ��������� ������, ����� ���� ����
		// ���������� null - ���������ü�� ����
		
		// ��ü�� ����1. �ٷ� ���� �� ����
		car_seat[0] = new Human("�达", 23);
		car_seat[2] = new Human("����", 28);
		car_seat[3] = new Human("�ݾ�", 22);

		// ��ü�� ����2. �ܺο� �ִ� ���� ���η� ������
		Human go = new Human("����", 25);
		car_seat[1] = go;
		// - ���ǻ��� : �ܺο� �ִ� ���� ���ܵ��� ���θ� �����ؾ� ��
		go = null; // �¼��� �ɾ����� �ٱ��� ���� ����
		
		// ��ü�� ��� -> null üũ�� �ϸ鼭 �ݺ��ϸ� ��
		for (int i = 0; i <car_seat.length; i += 1) {
			// �ݵ�� null üũ�� ����� ��
			if (car_seat[i] != null) {
				System.out.println((i + 1) + "�� �¼� : " + car_seat[i].getName());
			}
			else {
				System.out.println((i + 1) + "�� �¼��� ��� �ֽ��ϴ�!");
			}
		}
		
	}
}







