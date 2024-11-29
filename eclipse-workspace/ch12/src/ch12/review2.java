package ch12;
	import java.util.Scanner;
	public class review2 {
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);

	        // ����� �Է� �ޱ�
	        System.out.print("ù ��° ���ڸ� �Է��ϼ���: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("�����ڸ� �Է��ϼ��� (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);

	        System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
	        double num2 = scanner.nextDouble();

	        // ���� ����
	        double result = 0;
	        boolean valid = true; // ��ȿ�� üũ

	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                break;
	            case '-':
	                result = num1 - num2;
	                break;
	            case '*':
	                result = num1 * num2;
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                } else {
	                    System.out.println("0���� ���� �� �����ϴ�.");
	                    valid = false;
	                }
	                break;
	            default:
	                System.out.println("��ȿ���� ���� �������Դϴ�.");
	                valid = false;
	        }

	        // ��� ���
	        if (valid) {
	            System.out.println("���: " + result);
	        }

	        // ��ĳ�� �ݱ�
	        scanner.close();
	    }
	}


