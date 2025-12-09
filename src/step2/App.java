package step2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

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


            double result = calc.calculate(num1, num2, op);
            System.out.println("결과 : " + result);

            System.out.println("지금까지의 계산 결과: " + calc.getResultHistory());

            System.out.println("결과를 삭제하시겠습니까? (Y/N): ");
            String delete = sc.next();

            if (delete.equalsIgnoreCase("Y")) {
                calc.removeResult();
                System.out.println("결과가 삭제되었습니다.");
                System.out.println("남은 결과: " + calc.getResultHistory());
            } else {
                System.out.println("결과가 유지됩니다.");
            }

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
