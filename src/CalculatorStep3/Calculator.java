package CalculatorStep3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    //속성
    private int val1;
    private int val2;
    private char e;
    private List<Double> resultList = new ArrayList<Double>();


    //생성자
    public Calculator(String a, String b, char e) throws IOException {
        this.val1 = checkInt(a);
        this.val2 = checkInt(b);
        this.e = e;
    }



    //기능(method)

    public List<Double> getResult() {
        calResult();
        return resultList;
    }

    private void addResult(double result) {
        resultList.add(result);
    }

    private int checkInt (String a) throws IOException{
        for (int i = 0; i < a.length(); i++) {
            char temp = a.charAt(i);
            if (!Character.isDigit(temp)) {
                throw new IOException("올바른 입력값이 아닙니다.");
            }
        }
        return Integer.parseInt(a);
    }

    private void calResult () throws IllegalArgumentException, ArithmeticException{
        double result;

        switch (this.e) {
            case '+':
                result = this.val1 + this.val2;
                break;
            case '-':
                result = this.val1 - this.val2;
                break;
            case 'x':
                result = this.val1 * this.val2;
                break;
            case '/':
                if(this.val2==0) throw new ArithmeticException ("0으로 나눌 수 없습니다");
                result = (double) this.val1 / (double) this.val2;
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