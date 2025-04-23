package CalculatorStep3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number>  {
    //속성
    private T val1;
    private T val2;
    private char e;
    private List<Double> resultList = new ArrayList<Double>();


    //생성자
    public ArithmeticCalculator() {
    }

    public ArithmeticCalculator (T a, T b) {
        this.val1 = a;
        this.val2 = b;
    }


    //기능(method)
    public void setOperate(char e){
        this.e = e;
    }
    public List<Double> getResult() {
        double result = calResult(e);
        addResult(result);
        return resultList;
    }

    private void addResult(double result) {
        resultList.add(result);
    }

    private double calResult (char e) throws IllegalArgumentException, ArithmeticException{
        OperatorType op = OperatorType.matchChar(e);
        return op.calculate(val1.doubleValue(), val2.doubleValue());
    }

    public void removeResult(){
        resultList.remove(0);
    }

    // 입력받은 숫자 필터링
    public Number filterNum(String num) throws NumberFormatException {
        if(num.contains(".")){
            return Double.parseDouble(num);
        }else{
            return Integer.parseInt(num);
        }
    }
}