/**
 * Парсер выражений
 * На вход получает строку-выражение
 * Возвращает объект класса Expression
 */

public class ExpressionParser {
	
	public Expression parse(String str) throws IncorrectInputException {
		String expression[] = str.split(" ");
		
		//должны получить два операнда и операцию, состоящую из едиственного символа
		if (expression.length!=3 || expression[1].length()!=1) {
			throw new IncorrectInputException("Ошибка ввода");
		}
		RomanConverter converter = new RomanConverter();
		int a, b;
		boolean roman;
		try {
			
			//преобразуем строки, представляющие арабские или римские числа, к типу int
			if (converter.checkRoman(expression[0])) {
				a = converter.toDec(expression[0]);
				b = converter.toDec(expression[2]);
				roman = true;
			}
			else {
				a = Integer.parseInt(expression[0]);
				b = Integer.parseInt(expression[2]);
				roman = false;
			}
			if (a < 1 || a > 10 || b < 1 || b > 10) {
				throw new IncorrectInputException("Операнд не входит в допустимый диапазон");
			}
			else {
				return new Expression(a, b, expression[1].charAt(0), roman);
			}
		}
		catch (NumberFormatException e) {
			throw new IncorrectInputException("Некорректный операнд");
		}
	}

}
