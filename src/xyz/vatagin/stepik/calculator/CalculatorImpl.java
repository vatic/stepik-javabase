package xyz.vatagin.stepik.calculator;

public class CalculatorImpl implements Calculator{
    @Override
    public double calculate(String expr) {
        throw new CalculatorException(
                "Unsupported operator found");
    }
}
