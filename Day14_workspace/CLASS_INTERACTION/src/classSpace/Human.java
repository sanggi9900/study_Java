package classSpace;

public class Human {
	private String name;
	private String roll;
	private int age;
	
	public Human(String name, int age) {
		this(name, "미정", age);
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
	
	public void greeting() { System.out.println("안녕하세요~"); }
	public void action() { System.out.println("행동합니다~"); }
}
