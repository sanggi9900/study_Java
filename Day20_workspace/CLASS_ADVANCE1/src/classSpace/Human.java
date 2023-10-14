package classSpace;

public class Human {
	protected String name;
	protected String roll;
	protected int age;
	
	public Human(String name, int age) {
		this(name, "미정", age);
	}
	public Human(String name, String roll, int age) {
		this.name = name;
		this.roll = roll;
		this.age = age;
	}
	
	public void setRoll(String roll) {
		this.roll = roll;
	}
	
	public String getName() {
		return name;
	}
	public String getRoll() {
		return roll;
	}
	public int getAge() {
		return age;
	}
	
	public void greeting() { 
		System.out.println("안녕하세요~");
	}
	public void action(Box that) {
		if (that == null) {
			return;
		}
		else if (that.getState()) {
			that.close();
		}
		else {
			that.open();
		}
	}
	public void action(Box[] these, int index) {
		if (these == null) {
			return;
		}
		else if (index < 0 || index >= these.length) {
			return;
		}
		else {
			action(these[index]);
		}
	}
	public void action(Human that) {
		that.age += 1;
	}
}
