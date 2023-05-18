package lt.codeacademy.first.project.examples.inheritance.task;

import java.util.Random;

public class OddNumber extends Number {
    public OddNumber(int maxInterval, int minInterval, int maxGenNumb) {
        super(maxInterval, minInterval, maxGenNumb);
    }

    @Override
    public void generate() {
        Random random = new Random();
        while(numbers.size() <= maxGenNumb) {
            int randNumb = random.nextInt(minInterval, maxInterval + 1);
            if(randNumb % 2 != 0) {
                numbers.add(randNumb);
            }
        }
    }
}