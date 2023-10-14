package classSource;

public class Box3 {
	private String name;
	private boolean state;
	
	public Box3() {
		this("포장용 상자");
	}
	public Box3(String name) {
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






