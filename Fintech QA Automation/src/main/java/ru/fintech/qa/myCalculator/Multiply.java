package ru.fintech.qa.myCalculator;

public class Multiply extends Operation {

    @Override
    public void execute(double a, double b) {

        double result = a * b;

        System.out.println("= " + result);
    }

}
