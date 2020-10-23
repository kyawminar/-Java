/**
 * Перевод чисел из арабских в римские и наоборот
 * Из арабских в римские перевод осуществляется от 1 до 100
 * Из римских в арабские от 1 до 10 
 */

public class RomanConverter {
	
	final String DEC[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    final String ONE[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
	final String SYM = "IVX";
	
	/** 
	 * Проверяет, что строка может является римским числом
	 */
	public boolean checkRoman(String str) {
		if (SYM.indexOf(str.charAt(0)) != -1)
            return true;
		else 
			return false;
	}
	
	/**
	 * Перевод из римской системы в арабскую 
	 */
    public int toDec(String number) throws NumberFormatException {
		if (number.equals("X")) {
			return 10;
		}
		else {
			for (int i=1; i<DEC.length; i++) {
				if (number.equals(ONE[i])) {
					return i;
				}
			}
		}
		throw new NumberFormatException();
	}
    
    /**
     * Перевод из арабской системы в римскую
     */
	public String toRoman(int number) throws IncorrectInputException {
		String result = "";
		//римские числа могут быть только натуральными
		if (number <= 0) {
			throw new IncorrectInputException("Результат в римской системе счисления "
					+ "отрицательный или ноль");
		}
		if (number==100) {
			result += "C";
		}
		else {
			result += DEC[number/10] + ONE[number%10];
		}
		return result;
	}
}
