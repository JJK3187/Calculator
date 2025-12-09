package step1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            double num1;
            try {
                System.out.println("첫 번째 숫자를 입력하세요: ");
                num1 = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요.");
                sc.nextLine();
                continue;
            }


            double num2;
            try {
                System.out.println("두 번째 숫자를 입력하세요: ");
                num2 = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요.");
                sc.nextLine();
                continue;
            }

            System.out.println("연산자를 입력하세요 (+,-,*,/): ");
            String op = sc.next();

            if (op.equals("/") && num2 == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
                continue;
            }

            double result = 0;

            switch (op) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> result = num1 / num2;
                default -> {
                    System.out.println("정확한 연산자를 입력하세요");
                    continue;
                }
            }

            System.out.println("결과 : " + result);

            System.out.println("계산을 계속하시겠습니까? (Y/N): ");
            String again = sc.next();

            if (again.equalsIgnoreCase("N")) {
                break;
            }

        }

        System.out.println("계산을 종료합니다.");
        sc.close();

    }
}
