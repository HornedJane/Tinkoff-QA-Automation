import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String inputExpression;
        String operator;
        double a;
        double b;
        Operation solver;

        System.out.println("This calculator can do binary operations\n" +
                "available operators: +, -, *, /, ^, //\n");

        inputExpression = getNewExpression();

        while (!inputExpression.equals("q")) {

            String[] lex;

            lex = inputExpression.split(" ");   // KLUDGE!
            a = Double.parseDouble(lex[0]);
            b = Double.parseDouble(lex[2]);
            operator = lex[1];

            solver = getOperation(operator);
            solver.execute(a, b);

            inputExpression = getNewExpression();
        }
    }

    public static String getNewExpression() {

        Scanner in = new Scanner(System.in);

        System.out.println("Type new expression or 'q' to quit");

        return in.nextLine();
    }

    public static Boolean isCorrect(String expression) {       // KLUDGE!

        boolean result = false;

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
            case "//":
                result = new IntDivide();
                break;
            //case "%":
            //    result = new Remainder();
            //    break;
        }
        return result;
    }
}
