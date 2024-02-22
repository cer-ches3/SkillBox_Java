/**
 * Simple class for calculator
 * @author sergey
 */
public class Calculator {
    /**
     * Total count of operations, that Calculator can perform
     */
    public static final int OPERATION_COUNT =  4;

    /**
     * Performs division one number by another
     * @param a First value
     * @param b Seconds value
     * @return Division result
     * @throws ArithmeticException if at attempt is mode to divide by zero
     */
    public double divide (double a, double b) throws ArithmeticException{
        if (b == 0) {
            new ArithmeticException();
        }
        return a/b;
    }

}
