package classSpace;

public class Box {
	private String name;
	private boolean state;
	
	public Box() {
		this("����� ����");
	}
	public Box(String name) {
		this.name = name;
		state = false;
	}
	
 	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public boolean getState() {
		return state;
	}

	public void open() {
		if (!state) state = true;
	}
	public void close() {
		if (state) state = false;
	}
}





