/**
 * Created by igoryan on 15.11.15.
 */
public interface Equation {
    double getFunctionValue(double x);

    double getDerivative(double x);

    double getDownBound();

    double getHighBound();
}
