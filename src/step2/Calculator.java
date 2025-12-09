package step2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Double> resultHistory = new ArrayList<>();

    public double calculate(double num1, double num2, String op) {
        double result =- 0;

        switch (op) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> {
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    result = num1 / num2;
                }
            }
            default -> System.out.println("정확한 연산자를 입력해주세요");
        }
        resultHistory.add((double) result);
        return result;
    }
    public List<Double> getResultHistory() {
        return new ArrayList<>(resultHistory);  // 방어적 복사
    }

    public void removeResult() {
        if (!resultHistory.isEmpty()) {
            resultHistory.remove(0);
        }
    }


}



