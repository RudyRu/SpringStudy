package Calculator;

public class MainClass {

	public static void main(String[] args) {
		
		//등호 오른쪽에 생성된 객체의 주소를 저장
		MyCalculator myCalculator = new MyCalculator();
		myCalculator.setCalculator(new Calculator());
		
		myCalculator.setFirstNum(30);
		myCalculator.setSecondNum(5);
		
		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();
	}

}
