package CalculatorStep1;

import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class App {
    public static int[] insertInt(){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("첫 번째 정수를 입력하세요: ");
            String a = scanner.next();
            System.out.print("두 번째 정수를 입력하세요: ");
            String b = scanner.next();

            boolean isInt1 = true;
            boolean isInt2 = true;

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
            if (isInt1 && isInt2) {
                val[0] = Integer.parseInt(a);
                val[1] = Integer.parseInt(b);
                return val;
            }
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
                    if (b == 0) {
                        System.out.println("0으로 나눌 수 없습니다. 다른 연산을 입력해주세요.");
                        break;
                    }else{
                        result = (double) a / (double) b;
                        calStatus = false;
                        break;
                    }
                default :
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
            boolean calStatus = true;

            //사칙 연산 입력 받기
            result = insertEle(val[0], val[1]);

            System.out.println("결과: " + result);
            System.out.print("계속하려면 아무 글자 입력, 종료하려면 exit 입력: ");
            String exit = scanner.nextLine();

            if(exit.equals("exit")){
                System.out.println("=======계산기 종료=======");
                break;
            }
            System.out.println("====================");
        }
    }
}