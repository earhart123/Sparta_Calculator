package CalculatorStep2;

public class Calculator {
    //속성
    int val1;
    int val2;
    double result;
    char e;

    //생성자


    //기능(method)
    //사칙연산 c가 4개중 하나라는 확인 후에 진행
    void calResult (int a, int b, char c){
        switch (c) {
            case '+':
                this.result = a + b;
                break;
            case '-':
                this.result = a - b;
                break;
            case 'x':
                this.result = a * b;
                break;
            case '/':
                this.result = (double) a / (double) b;
                break;
        }
    }

    boolean checkSymbol (char c){
        if(c=='+' || c=='-' || c=='x' || c=='/'){
            return true;
        }else{
            System.out.println("※ 올바른 사칙 연산이 입력되지 않았습니다.");
            return false;
        }
    }

    boolean checkZero (int b, char c){
        if(b==0 && c == '/'){
            System.out.println("※ 0으로 나눌 수 없습니다. 다른 연산을 입력해주세요.");
            return false;
        }else{
            return true;
        }
    }
}
