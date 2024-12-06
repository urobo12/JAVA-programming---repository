package ch13;

import java.util.Scanner; 

public class test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		try {
			String input = scanner.nextLine();
			int number = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("숫자 아님!!");
		} finally {
			scanner.close();
		}
		System.out.println("Done...!");
	}
}
