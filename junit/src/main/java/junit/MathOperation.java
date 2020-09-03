package junit;


public class MathOperation {

	public static void main(String[] args) {

		Calculator calc = new Calculator();

		System.out.println(calc.getPlus(15, 23));
		System.out.println(calc.getMinus(47, 26));
		System.out.println(calc.getMultiple(5, 11));
		System.out.println(calc.getDivide(26, 4));

	}

}
