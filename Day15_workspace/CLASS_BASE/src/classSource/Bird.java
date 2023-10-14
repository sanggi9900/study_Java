package classSource;

public class Bird {
	private String name;
	private String species;
	private boolean isFlying;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setSpec(String spec) {
		species = spec;
	}
	public void setStat(boolean state) {
		isFlying = state;
	}
	public String getName() {
		return name;
	}
	public boolean getStat() {
		return isFlying;
	}
	
	public void takeoff() {
		if (!isFlying) isFlying = true;
	}
	public void landing() {
		if (isFlying) isFlying = false;
	}
	public void fly() {
		if (isFlying) {
			System.out.println(name+"가 날고 있어요!");
		}
		else {
			System.out.println(name+"는 땅에 앉아있습니다.");
		}
	}
}
