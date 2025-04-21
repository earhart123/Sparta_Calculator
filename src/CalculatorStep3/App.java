package CalculatorStep3;

import CalculatorStep3.Calculator;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //정수 입력 받기
            CalculatorStep3.Calculator cal;
            try {
                System.out.print("첫 번째 정수를 입력하세요: ");
                String a = scanner.next();
                System.out.print("두 번째 정수를 입력하세요: ");
                String b = scanner.next();

                System.out.print("사칙 연산을 입력하세요 (+, -, x, /): ");
                char e = scanner.next().charAt(0);


                cal = new Calculator(a, b, e);

            } catch (IOException e) {
                System.out.println("※ 올바른 정수를 입력해주세요.\n=============");
                continue;
            } catch (IllegalArgumentException e) {
                System.out.println("※ 올바른 사칙 연산이 입력되지 않았습니다.");
                continue;
            } catch (ArithmeticException e) {
                System.out.println("※ 0으로 나눌 수 없습니다. 다른 연산을 입력해주세요.");
                continue;
            }


            //결과 리스트에 가장 먼저 들어간 결과를 가져오지만, 계산이 끝나면 지워지기 때문에 결과 리스트에는 하나의 결과만 저장되는 상태
            System.out.println("결과: " + cal.getResult().get(0));

            System.out.print("계속하려면 아무 글자 입력, 종료하려면 exit 입력: ");
            scanner.nextLine();
            String exit = scanner.nextLine();
            cal.removeResult();

            if (exit.equals("exit")) {
                System.out.println("=======계산기 종료=======");
                break;
            }
            System.out.println("====================");
        }
    }
}
