
import java.util.Stack;
import java.util.StringTokenizer;


public class MyStack {
	
	private StringTokenizer tokens;
	private Stack<Integer> stack = new Stack<Integer>();
	
	public MyStack(String expression) {
		
		tokens = new StringTokenizer(expression);
		
	}
	
	/**
	 * Zahlen werden auf den Stack gelegt und entsprechend zusammengerechnet.
	 */
	public void numbersToStack() {
		
		//Entspricht das Token den zul‰ssigen Rechenoperationen wird eine Hilfsfunktion aufgerufen.
		//Ansonsten werden die Zahlen auf den Stack gelegt.
		while(tokens.hasMoreElements()) {
			String element = tokens.nextToken();
			if(element.equals("+") || element.equals("-") 
					|| element.equals("*") || element.equals("/")) {
				
				operation(element);
				
			} else {
				//Zahlen werden auf den Stack gelegt.
				stack.push(Integer.parseInt(element));
			}
		}
		
	}
	
	/**
	 * Die zwei obersten Stackelemente werden entnommen, verrechnet und anschlieﬂend wieder auf den Stack gelegt.
	 * @param token
	 */
	private void operation(String token){
		
		int operand2 = (int) stack.pop();
		int operand1 = (int) stack.pop();
		int result;
		
		switch (token){
		case "+":
			result = operand1 + operand2;
			stack.push(result);
			break;
			
		case "-":
			result = operand1 - operand2;
			stack.push(result);
			break;
			
		case "*":
			result = operand1 * operand2;
			stack.push(result);
			break;
			
		case "/":
			result = operand1 / operand2;
			stack.push(result);
			break;
		}
		
	}
	
	public int getResult(){
		return (int) stack.peek();
	}
	

}
