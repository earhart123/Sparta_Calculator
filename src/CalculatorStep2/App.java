package CalculatorStep2;

import java.io.IOException;
import java.util.Scanner;

public class App {

    public static boolean checkInt(String a){
        for (int i = 0; i < a.length(); i++) {
            char temp = a.charAt(i);
            if (!Character.isDigit(temp)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            Calculator calcul = new Calculator();

            //정수 입력 받기
            try{
                System.out.print("첫 번째 정수를 입력하세요: ");
                String a = scanner.next();
                System.out.print("두 번째 정수를 입력하세요: ");
                String b = scanner.next();

                calcul.val1 = calcul.checkInt(a);
                calcul.val2 = calcul.checkInt(b);
            }catch (IOException e){
                System.out.println("※ 올바른 정수를 입력해주세요.\n=============");
                continue;
            }


            double result = 0;
            boolean calStatus = true;

            //사칙 연산 입력 받기
            try{
                System.out.print("사칙 연산을 입력하세요 (+, -, x, /): ");
                calcul.e = scanner.next().charAt(0);
                calcul.calResult(calcul.val1, calcul.val2, calcul.e);
            }catch (IOException e){
                System.out.println("※ 올바른 사칙 연산이 입력되지 않았습니다.");
                continue;
            }catch (ArithmeticException  e){
                System.out.println("※ 0으로 나눌 수 없습니다. 다른 연산을 입력해주세요.");
                continue;
            }

            System.out.print("계속하려면 아무 글자 입력, 종료하려면 exit 입력: ");
            scanner.nextLine();
            String exit = scanner.nextLine();

            if(exit.equals("exit")){
                System.out.println("=======계산기 종료=======");
                break;
            }
            System.out.println("====================");
        }
    }
}
