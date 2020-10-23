/**
 * Класс Выражение
 * Содержит два операнда, символ операции и тип (арабские или римские числа)
*/
public class Expression {
	
	private int a;
	private int b;
	private char op;
	private boolean roman;
	
	public Expression(int a, int b, char op, boolean roman) {
		this.a = a;
		this.b = b;
		this.op = op;
		this.roman = roman;
	}
	
	public int getFirst() {
		return a;
	}
	
	public int getSecond() {
		return b;
	}
	
	public char getOperation() {
		return op;
	}
	
	public boolean isRoman() {
		return roman;
	}

}
