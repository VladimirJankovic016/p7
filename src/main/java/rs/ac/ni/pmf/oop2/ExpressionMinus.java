package rs.ac.ni.pmf.oop2;

public class ExpressionMinus implements Expression{
    @Override
    public int calculate(final int a, final int b){
        return a-b;
    }
}
