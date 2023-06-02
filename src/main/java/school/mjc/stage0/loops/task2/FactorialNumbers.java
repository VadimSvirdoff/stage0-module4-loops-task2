package school.mjc.stage0.loops.task2;
public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int number = 0;

        while (number <= printToInclusive) {
            long factorial = calculateFactorial(number);
            System.out.println(factorial);

            number++;
        }
    }

    private long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        long factorial = 1;
        int i = 2;

        while (i <= n) {
            factorial *= i;
            i++;
        }

        return factorial;
    }
}

