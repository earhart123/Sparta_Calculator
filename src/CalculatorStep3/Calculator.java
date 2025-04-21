package CalculatorStep3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    //속성
    int val1;
    int val2;
    private char e;
    private final List<Double> resultList = new ArrayList<Double>();


    //생성자

    //기능(method)
    public List<Double> getResult() {
        return resultList;
    }

    public void addResult(double result) {
        resultList.add(result);
    }

    public int checkInt (String a) throws IOException{
        for (int i = 0; i < a.length(); i++) {
            char temp = a.charAt(i);
            if (!Character.isDigit(temp)) {
                throw new IOException("올바른 입력값이 아닙니다.");
            }
        }
        return Integer.parseInt(a);
    }

    public void calResult (int a, int b, char c) throws IllegalArgumentException, ArithmeticException{
        double result;

        switch (c) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case 'x':
                result = a * b;
                break;
            case '/':
                if(b==0) throw new ArithmeticException ("0으로 나눌 수 없습니다");
                result = (double) a / (double) b;
                break;
            default :
                throw new IllegalArgumentException("잘못된 연산자입니다");
        }
        addResult(result);
    }

    public void removeResult(){
        resultList.remove(0);
    }
}
