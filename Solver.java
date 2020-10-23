/**
 * Вычисляет математическое выражение, представленное
 * объектом класса Expression для операций +, -, *, /
 */

public class Solver {
	public int solve(Expression exp) throws IncorrectInputException {
		switch (exp.getOperation()) {
		case '+' : 
			return exp.getFirst()+exp.getSecond();
		case '-' : 
			return exp.getFirst()-exp.getSecond();
		case '*' : 
			return exp.getFirst()*exp.getSecond();
		case '/' : 
			return exp.getFirst()/exp.getSecond();
		default:
			throw new IncorrectInputException("Некорректная операция");
		}
	}
}
