package runSpace;

import classSource.Rock2;

public class BASE2_Encapsulation {
	public static void main(String[] args) {
		// ĸ��ȭ : ���� ��ȣ �� ��� ����
		Rock2 jjangdol = new Rock2();
		
		// setter - ���� �����ϱ�
		// - �ʵ忡 ���ؼ��� ���Կ����� �ܺο��� ���� ����
		jjangdol.setMaterial("��");
		jjangdol.setShape("�Ų��� ���");
		jjangdol.setWeight(0.5);
		
		// getter - ���� �ҷ�����
		// - �ʵ带 �����ؼ� ���� �ҷ����� ���� ���� ����
		System.out.printf("%s\n%s\n%.1f\n"
				, jjangdol.getMaterial()
				, jjangdol.getShape()
				, jjangdol.getWeight()
				);
	}
}






