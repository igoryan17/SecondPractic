/**
 * Created by igoryan on 15.11.15.
 */
public class NewtonMethod implements Solver {
    private Equation equation;
    private double epsilon;
    private long iteration = 0;

    public long getIteration() {
        return iteration;
    }

    public NewtonMethod(Equation equation, double epsilon) {
        this.equation = equation;
        this.epsilon = epsilon;
        iteration = 0;
    }

    @Override
    public double getSolution() {
        double x = equation.getDownBound();
        double f = equation.getFunctionValue(x);
        while (Math.abs(f) > epsilon) {
            x = x - f / equation.getDerivative(x);
            f = equation.getFunctionValue(x);
            ++iteration;
        }
        return x;
    }
}
