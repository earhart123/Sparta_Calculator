package CalculatorStep1;

import java.util.Scanner;

public class App {
    public static int[] insertInt(){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            //정수 입력 받기
            System.out.print("첫 번째 정수를 입력하세요: ");
            String a = scanner.next();
            System.out.print("두 번째 정수를 입력하세요: ");
            String b = scanner.next();

            boolean isInt1 = true;
            boolean isInt2 = true;

            //입력받은 숫자가 정수인지 확인
            for (int i = 0; i < a.length(); i++) {
                char temp = a.charAt(i);
                if (!Character.isDigit(temp)) {
                    isInt1 = false;
                }
            }
            for (int i = 0; i < b.length(); i++) {
                char temp = b.charAt(i);
                if (!Character.isDigit(temp)) {
                    isInt2 = false;
                }
            }
            int[] val = new int[2];
            //입력받은 숫자가 정수면 Integer 형식으로 변환
            if (isInt1 && isInt2) {
                val[0] = Integer.parseInt(a);
                val[1] = Integer.parseInt(b);
                return val;
            }
            //입력받은 숫자가 정수가 아니면 재입력받기
            System.out.println("올바른 정수를 입력해주세요.\n=============");
        }
    };

    public static double insertEle(int a, int b){
        Scanner scanner = new Scanner(System.in);
        boolean calStatus = true;
        double result = 0;

        while(calStatus) {
            System.out.print("사칙 연산을 입력하세요 (+, -, x, /): ");
            char c = scanner.next().charAt(0);
            //입력받은 사칙연산대로 계산 진행
            switch (c) {
                case '+':
                    result = a + b;
                    calStatus = false;
                    break;
                case '-':
                    result = a - b;
                    calStatus = false;
                    break;
                case 'x':
                    result = a * b;
                    calStatus = false;
                    break;
                case '/':
                    if (b == 0) { //0으로 나눗셈 할 경우 에러 처리
                        System.out.println("0으로 나눌 수 없습니다. 다른 연산을 입력해주세요.");
                        break;
                    }else{
                        result = (double) a / (double) b;
                        calStatus = false;
                        break;
                    }
                default : //입력받은 글자가 +,-,x,/가 아닌 경우 재입력받기
                    System.out.println("올바른 사칙 연산이 입력되지 않았습니다.");
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            //정수 2개 입력 받기
            int[] val = insertInt();

            double result = 0;

            //사칙 연산 입력 받기
            result = insertEle(val[0], val[1]);

            System.out.println("결과: " + result);
            System.out.print("계속하려면 아무 글자 입력, 종료하려면 exit 입력: ");
            String exit = scanner.nextLine();

            //"exit"가 입력되면 계산기 종료
            if(exit.equals("exit")){
                System.out.println("=======계산기 종료=======");
                break;
            }
            System.out.println("====================");
        }
    }
}