public class IntDivide extends Operation {

    @Override
    public void execute(double a, double b) {

        double result = (int) a / b;

        System.out.println("= " + result);
    }

}
