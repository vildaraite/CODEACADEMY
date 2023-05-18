package lt.codeacademy.first.project.examples.inheritance.task;

import java.util.Random;

public class PositiveNumber extends Number {

    public PositiveNumber(int maxInterval, int minInterval, int maxGenNumb) {
        super(maxInterval, minInterval, maxGenNumb);
    }

    @Override
    public void generate() {
        Random random = new Random();
        for(int i = 0; i < maxGenNumb; i++) {
            int randNumb = random.nextInt(minInterval, maxInterval + 1);
            numbers.add(randNumb);
        }
    }
}