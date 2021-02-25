import java.lang.Math;

public class Power extends Operation {

    @Override
    public void execute(double a, double b) {

        double result = Math.pow(a, b);

        System.out.println("= " + result);
    }

}
