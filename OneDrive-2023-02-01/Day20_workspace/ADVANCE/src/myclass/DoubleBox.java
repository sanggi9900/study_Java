package myclass;

public class DoubleBox extends Box{
		private double data = 0;
		
		public DoubleBox() {
			super("�Ǽ�����0");
		}
		public DoubleBox(String name) {
			super(name);
		}
		public DoubleBox(String name, double data) {
			super(name);
			this.data = data;
		}
		
		public void setData(double data) {
			if (state) {
				this.data = data;
				System.out.println(name + " - ���强��...");
			}
			else {
				System.out.println(name + " - �������...");
			}
		}
		public double getData() {
			if (state) {
				return data;
			}
			else {
				return -1;
			}
		}

		public void showInfo() {
			if (state) {
				System.out.println(name + " : " + data);
			}
			else {
				System.out.println(name+"��(/��) ���� �ֽ��ϴ�.");
			}
		}
}