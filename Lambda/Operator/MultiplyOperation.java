package Lambda.Operator;

import Lambda.Operator.Operator;

public class MultiplyOperation implements Operator
{
    @Override
    public int toOperate(int a, int b){
        return a * b;
    }

    public int getMultiplication(int a, int b) {
        Operator operator = (x, y) -> toOperate(x, y);
        return operator.toOperate(a, b);
    }
}
