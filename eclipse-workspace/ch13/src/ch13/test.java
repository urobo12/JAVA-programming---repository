package ch13;

import java.util.Scanner; 

public class test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է��Ͻÿ�");
		try {
			String input = scanner.nextLine();
			int number = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("���� �ƴ�!!");
		} finally {
			scanner.close();
		}
		System.out.println("Done...!");
	}
}
