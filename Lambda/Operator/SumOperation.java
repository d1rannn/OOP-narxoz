package Lambda.Operator;

import Lambda.Operator.Operator;

public class SumOperation implements Operator
{
    @Override
    public int toOperate(int a, int b){
        return a + b;
    }

    public int getSum(int a, int b) {
        Operator operator  = (x, y) -> toOperate(x, y);
        return operator.toOperate(a, b);
    }
}
