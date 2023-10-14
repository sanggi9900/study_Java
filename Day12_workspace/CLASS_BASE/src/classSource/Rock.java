package classSource;

// 추상화(☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆)
// - 대상이 동작을 이용하는지/제공하는지
// - 대상이 가지는 특징(변수)
// - 대상이 할 수 있는 동작(메서드)
public class Rock {
	// 특징부터 작성하고...
	public String material;
	public String shape;
	public double weight;
	// 메서드가 작성됨
	public void canThrow() {
		System.out.println("부우우웅~!");
	}
}
