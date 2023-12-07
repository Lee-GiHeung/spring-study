package exam04;

public class SimpleCalculator extends Calculator {
    int num = 10;

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }
}