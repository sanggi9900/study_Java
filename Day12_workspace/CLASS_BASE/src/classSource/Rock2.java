package classSource;

// ĸ��ȭ
public class Rock2 {
	// �⺻��Ģ
	// - �ʵ�� private���� �����ϸ� �о�����
	private String material;
	private String shape;
	private double weight;
	
	// - �޼���� public���� �����ϸ� ��������
	// setter/getter�� �ʵ�� ��� �޼��� ���̿� �غ�����
	// setter���� ��� �غ��ϰ�
	public void setMaterial(String mat) {
		material = mat;	// �⺻����
	}
	public void setShape(String sha) {
		shape = sha;
	}
	public void setWeight(double value) {
		weight = value;
	}
	// getter���� ��� �غ���
	public String getMaterial() {
		return material; // �⺻����
	}
	public String getShape() {
		return shape;
	}
	public double getWeight() {
		return weight;
	}
	// getter / setter : ���û���
	// getter -> �ܺο��� ���� �� �ִ� ����
	// setter -> �ܺο��� �ٲ� �� �ִ� ����
	// # ������ �ʵ� -> ��������� �ȵ�
	
	public void canThrow() {
		System.out.println("�ο���~!");
	}
}












