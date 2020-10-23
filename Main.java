
public class Main {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		try {
			calc.start();
		} catch (IncorrectInputException e) {
			e.printStackTrace();
		}
	}
}
