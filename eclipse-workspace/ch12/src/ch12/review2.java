package ch12;
	import java.util.Scanner;
	public class review2 {
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);

	        // 사용자 입력 받기
	        System.out.print("첫 번째 숫자를 입력하세요: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);

	        System.out.print("두 번째 숫자를 입력하세요: ");
	        double num2 = scanner.nextDouble();

	        // 연산 수행
	        double result = 0;
	        boolean valid = true; // 유효성 체크

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
	                    System.out.println("0으로 나눌 수 없습니다.");
	                    valid = false;
	                }
	                break;
	            default:
	                System.out.println("유효하지 않은 연산자입니다.");
	                valid = false;
	        }

	        // 결과 출력
	        if (valid) {
	            System.out.println("결과: " + result);
	        }

	        // 스캐너 닫기
	        scanner.close();
	    }
	}


