package lt.codeacademy.first.project.examples.inheritance.task;

import java.util.ArrayList;
import java.util.List;

public abstract class Number {
    protected final List<Integer> numbers;
    protected final int maxInterval;
    protected final int minInterval;
    protected final int maxGenNumb;

    public Number(int maxInterval, int minInterval, int maxGenNumb) {
        this.maxInterval = maxInterval;
        this.minInterval = minInterval;
        this.maxGenNumb = maxGenNumb;
        numbers = new ArrayList<>();
    }

    public abstract void generate();

    public int sum() {
        //int sum = numbers.stream().reduce(0, Integer::sum);
        int sum = 0;
        for(Integer numb: numbers) {
            sum+= numb;
        }

        return sum;
    }
}
