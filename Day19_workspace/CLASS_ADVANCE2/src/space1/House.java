package space1;

public class House extends AbsBox {
	private String[] space;
	
	public House(String name, int size) {
		this.name = name;
		space = new String[size];
	}
	
	public void in(String person) {
		for (int i = 0; i < space.length; i += 1) {
			if (space[i] == null) {
				space[i] = person;
				System.out.printf("%s�� %d�� �ֽ��ϴ�.\n",person, i);
				return;
			}
		}
		System.out.println("��á���!");
	}
	public void open() { isOpen = true; }
	public void close() { isOpen = false; }
}
