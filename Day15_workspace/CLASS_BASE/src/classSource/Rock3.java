package classSource;

// ������
public class Rock3 {
	private String material;
	private String shape;
	private double weight;
	// �ʵ� �Ʒ�, set/get/��� ��
	// �������� ����
	// 1) �⺻ ������ : �⺻�� ���� / �ʱ�ȭ
	// - ���� ��쿡�� ��ü �����ÿ� �ݵ�� ���� �ֵ��� ������
//	public Rock3() {
//		material = "ȭ����";
//		shape = "���� ���";
//		weight = 0.5;
//	}
//	// 2) �Ϲ� ������ : ȣ���� �� �־��� ���� ������
//	public Rock3(String mat) {
//		material = mat;
//		shape = "���� ���";
//		weight = 1;
//	}
//	public Rock3(String mat, String shape) {
//		material = mat;
//		this.shape = shape;
//		weight = 1;
//	}
//	public Rock3(String mat, String shape, double wei) {
//		material = mat;
//		this.shape = shape;
//		weight = wei;
//	}
	// �����ڴ� �޼����̱� ������ �����ε��� ��
	public Rock3() {
		// this
		// 1) �ʵ�� �Ű������� �ߺ��� ȸ���ϱ� ���� ���λ�
		// 2) �����ڿ����� �ٸ� �����ڸ� ȣ���ϱ� ���� �����
		this("ȭ����", "���� ���", 0.5);
	}
	public Rock3(String mat) {
		this(mat, "���� ���", 1);
	}
	public Rock3(String mat, String shape) {
		this(mat, shape, 1);
	}
	public Rock3(String mat, String shape, double wei) {
		material = mat;
		this.shape = shape;
		weight = wei;
	}
	
	public void setShape(String sha) {
		shape = sha;
	}
	
	public String getMaterial() {
		return material;
	}
	public String getShape() {
		return shape;
	}
	
	public void canThrow() {
		System.out.println("�ο���~!");
	}
}












