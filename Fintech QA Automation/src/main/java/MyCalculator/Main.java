package MyCalculator;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {

    public static void main(String[] args) {

        String inputExpression;

        System.out.println("This calculator can do binary operations\n" +
                "available operators: +, -, *, /, ^\n");

        inputExpression = getNewExpression();

        while (!inputExpression.equals("q")) {

            if (isCorrect(inputExpression)) {

                String operator;
                double a;
                double b;
                Operation solver;

                String[] parsedExpression = parseExpression(inputExpression);

                a = Double.parseDouble(parsedExpression[0]);
                operator = parsedExpression[1];
                b = Double.parseDouble(parsedExpression[2]);

                solver = getOperation(operator);
                solver.execute(a, b);

            } else {
                System.out.println("Invalid input. Expression pattern must be <num><operation><num>");
            }
            inputExpression = getNewExpression();
        }
    }

    public static String getNewExpression() {

        Scanner in = new Scanner(System.in);

        System.out.println("Type new expression or 'q' to quit");

        return in.nextLine().replace(" ", "");
    }


    public static boolean isCorrect(String expression) {

        Pattern pattern = Pattern.compile("(-?\\d+(\\.\\d+)?)[+*/^-](-?\\d+(\\.\\d+)?)");
        boolean result = false;

        if (pattern.matcher(expression).matches()) {
            result = true;
        }

        return result;
    }

    public static String[] parseExpression(String expression) {

        String[] result = new String[3];
        Pattern pattern = Pattern.compile("\\d[+*/^-](-?\\d)");
        Matcher matcher = pattern.matcher(expression);

        matcher.find();
        int operationPosition = matcher.start() + 1;
        result[0] = expression.substring(0, operationPosition);
        result[1] = expression.substring(operationPosition, operationPosition + 1);
        result[2] = expression.substring(operationPosition + 1);

        return result;
    }

    public static Operation getOperation(String operator) {

        Operation result = null;

        switch (operator) {
            case "*":
                result = new Multiply();
                break;
            case "/":
                result = new Divide();
                break;
            case "+":
                result = new Add();
                break;
            case "-":
                result = new Subtract();
                break;
            case "^":
                result = new Power();
                break;
        }
        return result;
    }
}
