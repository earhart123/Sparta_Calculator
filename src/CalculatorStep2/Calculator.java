package CalculatorStep2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    //속성
    int val1;
    int val2;
    double result;
    char e;
    List<Double> resultList = new ArrayList<Double>();


    //생성자


    //기능(method)
    //사칙연산 c가 4개중 하나라는 확인 후에 진행
    public void calResult (int a, int b, char c) throws IOException, ArithmeticException{
        if(!(c=='+' || c=='-' || c=='x' || c=='/')){
            throw new IOException("올바른 입력값이 아닙니다.");
        }
        if(b==0 && c == '/'){
            throw new ArithmeticException ("0으로 나눌 수 없습니다");
        }

        switch (c) {
            case '+':
                this.result = a + b;
                resultList.add(this.result);
                System.out.println("결과: " + resultList);
                break;
            case '-':
                this.result = a - b;
                resultList.add(this.result);
                System.out.println("결과: " + resultList);
                break;
            case 'x':
                this.result = a * b;
                resultList.add(this.result);
                System.out.println("결과: " + resultList);
                break;
            case '/':
                this.result = (double) a / (double) b;
                resultList.add(this.result);
                System.out.println("결과: " + resultList);
                break;
        }
    }

    public void checkSymbol (char c) throws IOException{
        if(c=='+' || c=='-' || c=='x' || c=='/'){
            throw new IOException("올바른 입력값이 아닙니다.");
        }
    }

    public void checkZero (int b, char c) throws ArithmeticException  {
        if(b==0 && c == '/'){
            throw new ArithmeticException ("0으로 나눌 수 없습니다");
        }
    }

    public void removeResult(){
        resultList.remove(0);
    }
}
