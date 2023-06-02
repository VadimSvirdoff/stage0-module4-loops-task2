package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if(multiplyByAndToInclusive != 0) {
            int number = 0;
            int absValue = Math.abs(multiplyByAndToInclusive);

            while (number <= absValue) {
                int result = number * multiplyByAndToInclusive;
                System.out.println(result);
                number++;
            }
        }
    }
}
