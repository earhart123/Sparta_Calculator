import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class CalculatorStep1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //boolean status = true;

        while(true) {
            int val1;
            int val2;
            //정수 2개 입력 받기
            while(true) {
                System.out.print("첫 번째 정수를 입력하세요: ");
                String a = scanner.next();
                System.out.print("두 번째 정수를 입력하세요: ");
                String b = scanner.next();

                boolean isInt1 = true;
                boolean isInt2 = true;

                for(int i=0; i<a.length(); i++){
                    char temp = a.charAt(i);
                    if(!Character.isDigit(temp)){
                        isInt1 = false;
                    }
                }
                for(int i=0; i<b.length(); i++){
                    char temp = b.charAt(i);
                    if(!Character.isDigit(temp)){
                        isInt2 = false;
                    }
                }
                if(isInt1 && isInt2) {
                    val1 = Integer.parseInt(a);
                    val2 = Integer.parseInt(b);
                    break;
                }
                System.out.println("올바른 정수를 입력해주세요.\n=============");
            }

            double result = 0;
            boolean calStatus = true;

            //사칙 연산 입력 받기
            while(calStatus) {
                System.out.print("사칙 연산을 입력하세요 (+, -, x, /): ");
                char c = scanner.next().charAt(0);
                    switch (c) {
                        case '+':
                            result = val1 + val2;
                            calStatus = false;
                            break;
                        case '-':
                            result = val1 - val2;
                            calStatus = false;
                            break;
                        case 'x':
                            result = val1 * val2;
                            calStatus = false;
                            break;
                        case '/':
                            if (val2 == 0) {
                                System.out.println("0으로 나눌 수 없습니다. 다른 연산을 입력해주세요.");
                                break;
                            }else{
                                result = (double) val1 / (double) val2;
                                calStatus = false;
                                break;
                            }
                        default :
                            System.out.println("올바른 사칙 연산이 입력되지 않았습니다.");
                            break;
                    }
                }
            System.out.println("결과: " + result);
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