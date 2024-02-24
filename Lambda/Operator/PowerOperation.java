package Lambda.Operator;

import Lambda.Operator.Operator;

public class PowerOperation implements Operator
{
    @Override
    public int toOperate(int a, int b){
        return (int) Math.pow(a, b);
    }

    public int getPower(int a, int b) {
        Operator operator = (x, y) -> toOperate(x, y);
        return operator.toOperate(a, b);
    }
}
