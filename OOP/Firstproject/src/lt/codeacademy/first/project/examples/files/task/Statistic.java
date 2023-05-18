package lt.codeacademy.first.project.examples.files.task;

public class Statistic {
    private final int playerNumber;
    private int countFreeThrows;
    private int countTwoPoints;
    private int countThreePoints;
    private int countMissThrows;

    public Statistic(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getTotalPoints() {
        return countThreePoints * 3 + countTwoPoints * 2 + countFreeThrows;
    }

    public double getAccuracy() {
        double totalThrows = countFreeThrows + countTwoPoints + countThreePoints + countMissThrows;

        return (countFreeThrows + countTwoPoints + countThreePoints) * 100 / totalThrows;
    }

    public void addThrowPoints(int throwPoint) {
        switch(throwPoint) {
            case 0 -> countMissThrows++;
            case 1 -> countFreeThrows++;
            case 2 -> countTwoPoints++;
            case 3 -> countThreePoints++;
        }
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public int getCountThreePoints() {
        return countThreePoints;
    }
}