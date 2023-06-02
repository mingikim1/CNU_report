package CNU_report;

import java.util.*;

public class CalCulatorTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		try {
			String C = sc.nextLine(); 
			
			// 띄어쓰기에 따라 배열에 넣기
			String [] Cal = C.split(" ");
			
			// 피연산자1
			int op1 = getNumber(Cal[0]);
			
			// 피연산자2
			int op2 = getNumber(Cal[2]);
			int result = calculate(op1 , op2 , Cal[1]);
			System.out.println("==========");
			System.out.println("The resuelt is: " + result);
		} catch (ArithmeticException e1){
			System.out.println("==========");
			System.out.println(e1.getMessage());
		} catch (NoSuchElementException e2) {
			System.out.println("==========");
			System.out.println(e2.getMessage());
		} catch (ArrayIndexOutOfBoundsException e3) {
			System.out.println("==========");
			System.out.println(e3.getMessage());
		} catch (OperatorException e4) {
			System.out.println("==========");
			System.out.println("Not an operator.");
		}
		finally {
			System.out.println("It's Done");
		}		
	}
	
	static int getNumber(String str) {
		
		try {
			return Integer.parseInt(str);
		} catch (Exception e) {
			return str.length();
		}
		
	}
	
	static int calculate(int operand1 , int operand2  , String operator) throws ArithmeticException, OperatorException {
		if (operator.equals("+")) {
			return operand1 + operand2;
		}
		else if (operator.equals("*")) {
			return operand1 * operand2;
		}
		else if (operator.equals("/")) {
			return operand1 / operand2;
		}
		else if (operator.equals("%")) {
			return operand1 % operand2;
		}
		else {
			OperatorException e = new OperatorException(operator);
			throw e;
		}
		
	}

}

class OperatorException extends Exception{
	OperatorException(String msg) {
		super(msg);
	}
}
