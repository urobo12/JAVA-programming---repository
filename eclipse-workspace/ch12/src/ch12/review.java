package ch12;
import java.util.Scanner;


public class review {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[4];
        System.out.println("4개의 정수를 입력하세요:");
        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + "번째 숫자: ");
            numbers[i] = scanner.nextInt();
        }


        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        
        
        
        System.out.println("");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}