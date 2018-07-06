package Calculator;

public class Calculator {
	
	private int firstNum;
	private int secondNum;
	
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}	
	
	public void addition() {
		System.out.println("addition");
		int result = firstNum + secondNum;
		System.out.println(result);
	}
	
	public void substraction() {
		System.out.println("substraction");
		int result = firstNum - secondNum;
		System.out.println(result);
	}
	
	public void multiplication() {
		System.out.println("multiplication");
		int result = firstNum * secondNum;
		System.out.println(result);
	}
	
	public void division() {
		System.out.println("division");
		int result = firstNum / secondNum;
		System.out.println(result);
	}
}
