package myClass;

public class Patient extends AbsHuman {
	private String symptom;
	public Patient(String name, String symptom) {
		super(name); this.symptom = symptom;
	}
	public void introduce() {
		System.out.println("�� ������ ġ��޾ƾ� �ϴ� ȯ��, "
				+ name + "�Դϴ�.");
	}
	public void report() {
		System.out.println("�� " + symptom + "�� �ΰ� �ֽ��ϴ�.");
	}
}