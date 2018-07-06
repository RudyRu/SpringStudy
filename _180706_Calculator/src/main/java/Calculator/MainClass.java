package Calculator;

public class MainClass {

	public static void main(String[] args) {
		
		//등호 오른쪽에 생성된 객체의 주소를 저장
		Calculator calculator = new Calculator();
		
		calculator.setFirstNum(10);
		calculator.setSecondNum(2);
		
		calculator.addition();
		calculator.substraction();
		calculator.multiplication();
		calculator.division();
	}

}
