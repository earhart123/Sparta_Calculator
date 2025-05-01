package CalculatorStep3;
import java.util.function.DoubleBinaryOperator;

public enum OperatorType {
    PLUS('+', (x, y) -> x + y),
    MINUS('-', (x, y) -> x - y),
    MULTI('*', (x, y) -> x * y),
    DIVIDE('/', (x, y) -> {
        if (y == 0) throw new ArithmeticException("0으로 나눌 수 없습니다");
        return x / y;
    });

    private final DoubleBinaryOperator op;

    //필드와 생성자
    private final char operator;

    OperatorType(char operator, DoubleBinaryOperator op) {
        this.operator = operator;
        this.op = op;
    }

    public double calculate(Number x, Number y){
        return op.applyAsDouble(x.doubleValue(), y.doubleValue());
    }

    // 입력받은 c가 enum 상수에 있는 값인지 확인
    public static OperatorType matchChar(char c){
        for(OperatorType type : values()){
            if(type.operator == c) return type;
        }
        throw new IllegalArgumentException("유효하지 않은 연산자입니다.");
    }
}
