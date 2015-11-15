/**
 * Created by igoryan on 15.11.15.
 */
public class Main {
    private static double EPSILON = Math.pow(10, -8);
    private static double X;
    private static long K;
    private static double R;

    public static void main(String[] args) {
        Equation equation = new EquationImpl(Math.PI, Math.PI * 3.d / 2.d);
        Solver solver = new NewtonMethod(equation, EPSILON);
        X = solver.getSolution();
        K = solver.getIteration();
        R = equation.getFunctionValue(X);
        System.out.println("x = " + X + " r = " + R + " k = " + K);
    }
}
