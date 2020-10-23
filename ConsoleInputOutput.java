/**
 * Консольный ввод-вывод выражений
 */

import java.util.Scanner;

public class ConsoleInputOutput {
	
	private Scanner in = new Scanner(System.in);
	
	ConsoleInputOutput() {
		System.out.println("Программа \"Калькулятор\". Для выхода введете \"quit\".");
	}
	
	public String input() throws IncorrectInputException {
		System.out.println("Выражение:");
		return in.nextLine();
	}
	
	public void output(String result) {
		System.out.println("Результат:");
		System.out.println(result);
	}
}
