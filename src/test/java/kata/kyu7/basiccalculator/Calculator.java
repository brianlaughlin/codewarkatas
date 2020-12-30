package kata.kyu7.basiccalculator;

public class Calculator {
    public static Double calculate(final double numberOne, final String operation, final double numberTwo) {
        double result = 0.0;
        switch (operation.charAt(0)) {
            case '+':
                result = numberOne + numberTwo;
                break;
            case '-':
                result = numberOne - numberTwo;
                break;
            case '*':
                result = numberOne * numberTwo + 0.0;
                break;
            case '/':
                if (numberTwo != 0) result = numberOne / numberTwo;
                else return null;
                break;
            default:
                return null;
        }

        return result;
    }

    public static Double calculateBest(final double x, final String op, final double y) {
        switch (op) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y + 0.0;
            case "/":
                return y == 0 ? null : x / y;
        }
        return null;
    }
}

