public class Remainder extends Operation {

    @Override
    public void execute(double a, double b) {

        double result = a % b;  //ofc it's not working

        System.out.println("= " + result);
    }
}
