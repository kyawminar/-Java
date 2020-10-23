/**
 * Вычисляет введенные с клавиатуры выражения в формате
 * a + b, a * b, a - b, a / b
 * для арабских и римских чисел от 1 до 10 
 * */
public class Calculator {
	
	private ConsoleInputOutput consoleInputOutput = new ConsoleInputOutput();
	private ExpressionParser parser = new ExpressionParser();
	private Solver solver = new Solver();
	private RomanConverter converter = new RomanConverter();
	
	public void start() throws IncorrectInputException {
		String inp;
		while(!(inp=consoleInputOutput.input()).equals("quit")) {
			Expression expression = parser.parse(inp);
			int result = solver.solve(expression);
			if (expression.isRoman()) {
				consoleInputOutput.output(converter.toRoman(result));
			}
			else {
				consoleInputOutput.output(Integer.toString(result));
			}
		}
	}
}
