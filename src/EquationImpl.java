/**
 * Created by igoryan on 15.11.15.
 */
public class EquationImpl implements Equation {
    private double down;
    private double high;

    public EquationImpl(double down, double high) {
        this.high = high;
        this.down = down;
    }

    @Override
    public double getFunctionValue(double x) {
        double sin2x = Math.sin(2 * x);
        double cos2x = Math.cos(2 * x);
        return (Math.pow(x, 2) - 25) * sin2x - 2 * cos2x;
    }

    @Override
    public double getDerivative(double x) {
        double firstSum = 2 * x * Math.sin(2 * x);
        double secondSum = 2 * (Math.pow(x, 2) - 25) * Math.cos(2 * x);
        double thirdSum = 4 * Math.sin(2 * x);
        return firstSum + secondSum + thirdSum;
    }

    @Override
    public double getDownBound() {
        return down;
    }

    @Override
    public double getHighBound() {
        return high;
    }
}
