package Lambda.Operator;

import Lambda.Operator.Operator;

public class SubtractOperation implements Operator
{
    @Override
    public int toOperate(int a, int b){
        return a - b;
    }

    public int getSubtraction(int a, int b) {
        Operator operator = (x, y) -> toOperate(x, y);
        return operator.toOperate(a, b);
    }
}
