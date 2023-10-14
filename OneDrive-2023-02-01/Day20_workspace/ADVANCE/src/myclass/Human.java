package myclass;

public class Human {
	private String name;
	private int age;
	private double height;
	private double weight;
	
	public Human() { this("���", 0, 0, 0); }
	public Human(String name) { this(name, 0, 0 ,0); }
	public Human(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() { return name; }
	public int getAge() { return age; }
	public double getHeight() { return height; }
	public double getWeight() { return weight; }
	
	public void introduce() { System.out.println("�� "+name+"�̾�!"); }
	public void showInfo() {
		System.out.printf("%s( %d, %.1f %.1f )\n", name, age, height, weight);
	}
	public void actionTo(Box that) {
		// ���� ����/�ݱ� ����� ������ ���� ����
		if (that.getStatus()) that.close();
		else that.open();
	}
	public void actionTo(Human that) {
		that.age += 1;
		System.out.println(that.name+"�� ���� ����!");
	}
	public boolean openOneBox(Box[] boxArray, String name) {
		// �� �޼��尡 �۵��ؼ�, �� ���·� ����°� �����̸�...
		// actionTo�� ȣ���ϸ� �ȵ�
		// -> actionTo�� ���¿� ���� ���ų� �ݱ� ���� �޼����.
		for (int i = 0; i<boxArray.length; i += 1) {
			if (name.compareTo(boxArray[i].getName()) == 0) {
				actionTo(boxArray[i]);	//boxArray[i].open();
				return true; // �ݺ��� �Բ� ����
			}
		}
		System.out.println(name + "��(/��) �����ϴ�.");
		return false;
	}
	public boolean openOneBox(Box[] boxArray, int index) {
		if (index < 0 || index > boxArray.length) {
			System.out.println((index+1)+"��° ������(/��) �����ϴ�.");
			return false;
		}
		else {
			actionTo(boxArray[index]);	// �޼��� �̿� ����
			return true;
		}
	}
	
	public void openAll(Box[] boxArray) {
		for (int i = 0;i<boxArray.length;i+=1) {
			actionTo(boxArray[i]);
		}
	} 
	
	public void greetingTo(Human that) {
		System.out.printf("�ȳ�, %s��!\n", that.name);
	}
}







