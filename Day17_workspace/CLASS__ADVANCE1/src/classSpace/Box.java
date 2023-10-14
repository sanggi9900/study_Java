package classSpace;

public class Box {
	protected String name;
	protected boolean state;
	
	public Box() {
		this("포장용 상자");
	}
	public Box(String name) {
		this.name = name;
		state = false;
	}
	public Box(Box that) {
		this.name = new String(that.name);
		this.state = that.state;
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






