package rs.ac.ni.pmf.oop2;

public class ExpressionCalculator {
    private final int a;
    private final int b;
    private final Expression expression;

    public ExpressionCalculator(int a, int b, Expression expression) {
        this.a = a;
        this.b = b;
        this.expression = expression;
    }

    public int calculate(){
        return expression.calculate(a,b);
    }
}