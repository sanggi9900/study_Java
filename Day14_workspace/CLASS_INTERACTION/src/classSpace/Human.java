package classSpace;

public class Human {
	private String name;
	private String roll;
	private int age;
	
	public Human(String name, int age) {
		this(name, "����", age);
	}
	public Human(String name, String roll, int age) {
		this.name = name;
		this.roll = roll;
		this.age = age;
	}
	
	public void setRoll(String roll) { this.roll = roll; }
	
	public String getName() { return name; }
	public String getRoll() { return roll; }
	public int getAge()     { return age;  }
	
	public void greeting() { System.out.println("�ȳ��ϼ���~"); }
	public void action() { System.out.println("�ൿ�մϴ�~"); }
}