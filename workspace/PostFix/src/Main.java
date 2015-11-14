
public class Main {

	public static void main(String[] args) {
		
		String testString1 = "15 42 18 + 61 24 - * 71 + *";

		MyStack test = new MyStack(testString1);
		
		test.numbersToStack();
		System.out.println(test.getResult());
	}

}
