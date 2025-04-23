package CalculatorStep3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            ArithmeticCalculator<Double> cal = new ArithmeticCalculator();

            try {
                //정수 또는 실수 입력 받기
                System.out.print("첫 번째 숫자를 입력하세요: ");
                String a = scanner.next();
                Number val1 = cal.filterNum(a);
                System.out.print("두 번째 숫자를 입력하세요: ");
                String b = scanner.next();
                Number val2 = cal.filterNum(b);

                cal = new ArithmeticCalculator (val1, val2);

                //사칙연산 입력 받기
                System.out.print("사칙 연산을 입력하세요 (+, -, x, /): ");
                char e = scanner.next().charAt(0);
                cal.setOperate(e);


                //결과 리스트에 가장 먼저 들어간 결과를 가져오기
                System.out.println("결과: " + cal.getResult().get(0));

            } catch (NumberFormatException e) { //올바른 숫자가 입력되지 않을 경우 에러 처리
                System.out.println("※ 올바른 숫자를 입력해주세요.\n=============");
                continue;
            } catch (IllegalArgumentException e) { //올바른 사칙연산이 입력되지 않을 경우 에러 처리
                System.out.println("※ 올바른 사칙 연산이 입력되지 않았습니다.");
                continue;
            } catch (ArithmeticException e) { //0으로 나눗셈 할 경우 에러 처리
                System.out.println("※ 0으로 나눌 수 없습니다. 다른 연산을 입력해주세요.");
                continue;
            }


            System.out.print("계속하려면 아무 글자 입력, 종료하려면 exit 입력: ");
            scanner.nextLine();
            String exit = scanner.nextLine();
            cal.removeResult(); //가장 먼저 들어간 계산 결과 제거 (리셋)

            //"exit"가 입력되면 계산기 종료
            if (exit.equals("exit")) {
                System.out.println("=======계산기 종료=======");
                break;
            }
            System.out.println("====================");
        }
    }
}
