package aopex;

public class RecCalculator implements Calculator {
    @Override
    public long factorial(long num) {
        long stime = System.nanoTime();

        if(num < 1L) {
            return 1L;
        }

        return num * factorial(num - 1); // 재귀(Recursive)
    }
}
