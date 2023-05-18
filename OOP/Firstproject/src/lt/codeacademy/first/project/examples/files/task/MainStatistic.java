package lt.codeacademy.first.project.examples.files.task;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class MainStatistic {
    private static final String PLAYERS_FILE_NAME = "zaidejai.txt";
    private static final String STATISTIC_FILE_NAME = "taskai.txt";
    private static final String REGEX = " ";

    private final Map<Integer, Player> players = new HashMap<>();
    private final Map<Integer, Statistic> statistics = new HashMap<>();

    public static void main(String[] args) {
        MainStatistic main = new MainStatistic();
        main.readFile(PLAYERS_FILE_NAME, 3, main.addPlayer());
        main.readFile(STATISTIC_FILE_NAME, 2, main.addStatistic());

        main.printBestPlayers();
    }

    private void readFile(String fileName, int length, Consumer<String[]> consumer) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while((line = br.readLine()) != null) {
                String[] splits = line.split(REGEX);
                if(splits.length < length) {
                    continue;
                }

                consumer.accept(splits);
            }
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private Consumer<String[]> addPlayer() {
        return splits -> {
            int playerNumber = Integer.parseInt(splits[0]);
            players.put(playerNumber, new Player(playerNumber, splits[1], splits[2]));
        };
    }

    private Consumer<String[]> addStatistic() {
        return splits -> {
            int playNumber = Integer.parseInt(splits[0]);
            Statistic statistic = statistics.get(playNumber);
            if(statistic == null) {
                statistic = new Statistic(playNumber);
                statistics.put(playNumber, statistic);
            }

            statistic.addThrowPoints(Integer.parseInt(splits[1]));
        };
    }

    private void printBestPlayers() {
        Statistic bestTotalPoints = getBestPlayerStatistic(bestTotalPointsPlayer());
        print(bestTotalPoints.getPlayerNumber(), String.format("imete %s tasku", bestTotalPoints.getTotalPoints()));
        Statistic bestThreeThrows = getBestPlayerStatistic(bestThreeThrowsPlayer());
        print(bestThreeThrows.getPlayerNumber(), String.format("pataike %s tritaskiu", bestThreeThrows.getCountThreePoints()));
        Statistic bestAccuracy = getBestPlayerStatistic(bestAccuracyPlayer());
        print(bestAccuracy.getPlayerNumber(), String.format("vidurkis yra:%s", bestAccuracy.getAccuracy()));
    }

    private Statistic getBestPlayerStatistic(BiFunction<Statistic, Statistic, Boolean> function) {
        Statistic statistic = null;
        for(Statistic st: statistics.values()) {
            if(statistic != null && function.apply(statistic, st)) {
                continue;
            }

            statistic = st;
        }

        return statistic;
    }

    private BiFunction<Statistic, Statistic, Boolean> bestTotalPointsPlayer() {
        return (st1, st2) -> st1.getTotalPoints() > st2.getTotalPoints();
    }

    private BiFunction<Statistic, Statistic, Boolean> bestThreeThrowsPlayer() {
        return (st1, st2) -> st1.getCountThreePoints() > st2.getCountThreePoints();
    }

    private BiFunction<Statistic, Statistic ,Boolean> bestAccuracyPlayer() {
        return (st1, st2) -> st1.getAccuracy() > st2.getAccuracy();
    }

    private void print(int playerNumb, String textPattern){
        Player player = players.get(playerNumb);
        if(player != null) {
            System.out.printf("%s %s %s %s%n", player.id(), player.name(), player.surname(), textPattern);
        }
    }

}