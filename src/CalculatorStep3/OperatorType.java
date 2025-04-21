package CalculatorStep3;

public enum OperatorType{
    PLUS ('+'){
        public double calculate(double x, double y) {return x + y;}
    },
    MINUS ('-'){
        public double calculate(double x, double y) {return x - y;}
    },
    MULTI ('x'){
        public double calculate(double x, double y) {return x * y;}
    },
    DIVIDE ('/'){
        public double calculate(double x, double y) {return x / y;}
    };

    OperatorType(char c) {
        //생성자
    }

    public abstract double calculate(double x, double y);
}
