package rs.ac.ni.pmf.oop2;

public class Main {
    public static void main(String[] args) {
        final ExpresssionPlus exp = new ExpresssionPlus();
        final ExpressionCalculator calculator = new ExpressionCalculator(4,6,exp);
        System.out.println(calculator.calculate());

        class ExpressionSquareSum implements Expression {
            @Override
            public int calculate(int a, int b) {
                return (a + b) * (a + b);
            }
        }
        ExpressionSquareSum ess = new ExpressionSquareSum();
        final ExpressionCalculator otherCalc =
                new ExpressionCalculator(15,10,ess);


        final ExpressionCalculator otherCalc2 =
                new ExpressionCalculator(10, 10, new Expression() {
                    @Override
                    public int calculate(int a, int b) {
                        return a*a - b*b;
                    }
                });
    }
}