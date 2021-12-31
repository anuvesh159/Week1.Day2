package week1.day2;

public class Calculator {
	
	public int sub(int num1, int num2) {
		
		return num1-num2;
		
	}
	
		public int multiply(int num1, int num2) {
			
				return num1*num2;
		
	}
	
		public int divide(int num1, int num2) {
				return num1/num2;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		int sub = calc.sub(20, 10);
		int multiply = calc.multiply(20, 10);
		int divide = calc.divide(20, 10);
		
		System.out.println(sub);
		System.out.println(multiply);
		System.out.println(divide);

	}

}
