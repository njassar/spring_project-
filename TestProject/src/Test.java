public class Test {
	public static void main(String[] args) {
		System.out.println("test");
		Test test = new Test();
		int a = test.getValue();
		System.out.println(a);
	}

	private int getValue() {
		try {
			throw new Exception();
		} catch (Exception e) {
			return 10;
		} finally {
//			System.out.println(20);
			return 20;
		}
	}
}
