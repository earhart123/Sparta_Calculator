package CalculatorStep3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number>  {
    //속성
    private T val1;
    private T val2;
    private char operator;
    private List<Double> resultList = new ArrayList<>();


    //생성자
    public ArithmeticCalculator() {
    }

    //기능(method)
    // getter
    public double getResult(int index) {
        return resultList.get(index);
    }

    public void calculateResult(T val1, T val2, char operator) throws IllegalArgumentException, ArithmeticException{
        OperatorType op = OperatorType.matchChar(operator);
        double result = op.calculate(val1.doubleValue(), val2.doubleValue());;
        resultList.add(result);
    }

//    private double calResult (char e) throws IllegalArgumentException, ArithmeticException{
//        OperatorType op = OperatorType.matchChar(e);
//        return op.calculate(val1.doubleValue(), val2.doubleValue());
//    }

    public void removeResult(){
        resultList.remove(0);
    }
}