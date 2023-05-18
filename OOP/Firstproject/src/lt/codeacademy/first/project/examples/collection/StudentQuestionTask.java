package lt.codeacademy.first.project.examples.collection;


import java.util.Arrays;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class StudentQuestionTask {private static final String QUESTIONS = "Kas yra obuolys?,Gyvunas,Medis,Pastatas,Vaisius,4;Ka geria karve?,Piena,Alu,Vandeni,3;Is ko gaminamos pomidoru sultys?,Is morku,Is pomidoru,Is vistienos,2;" +
        "Kas yra vista?,Gyvunas,Pastatas,Vaisius,1;Ka eda jautis?,Siena,Kepsnius,Cipsus,1;Is ko gaminami kiausiniai?,Is vistu,Is pomidoru,Is bulviu,1;" +
        "Kas yra namas?,Gyvunas,Pastatas,Vaisius,2;Ka eda katinas?,Siena,Kepsnius,Cipsus,2;Is ko gaminami megztiniai?,Is vilnos,Is pomidoru,Is bulviu,1;" +
        "Kas yra fosa?,Gyvunas,Pastatas,Vaisius,1;Ka duoda karve?,Piena,Alu,Vandeni,1;Is ko gaminamos morku sultys?,Is morku,Is pomidoru,Is vistienos,1;" +
        "Kas yra bunkeris?,Gyvunas,Pastatas,Vaisius,2;Ka geria antis?,Piena,Alu,Vandeni,3;Is ko gaminami cepelinai?,Is morku,Is pomidoru,Is bulviu,3";

    private final Map<Integer, Question> questions = new HashMap<>();
    public static void main(String[] args) {

        StudentQuestionTask task = new StudentQuestionTask();
        task.fillUpQuestionsMap();
        Set<Question> questionsForUser = task.getQuestionsForUser();

        int mark = task.getStudentMark(questionsForUser);
        task.showMarkResult(mark);
    }

    private void showMarkResult(int mark) {
        if(mark >= 8) {
            System.out.println("Saunuolis, tavo ivertinimas yra: "+ mark);
        }else if(mark < 5) {
            System.out.println("Na blogai, kita karta pasistenk labiau, nes gavai: " + mark);
        } else {
            System.out.println("Neblogai, tavo pazimys yra: " + mark);
        }
    }

    private int getStudentMark(Set<Question> questionsForUser) {
        Scanner sc = new Scanner(System.in);
        int questionCount = 1;
        int mark = 0;
        for(Question q: questionsForUser) {
            System.out.printf("%s. %s%n", questionCount++, q.question());
            int aCount = 1;
            for(String a : q.answers()){
                System.out.printf("\t%s. %s%n", aCount++, a);
            }
            int userAnswer = getCorrectUserAnswer(sc, q.answers().size());
            if(userAnswer == q.correctAnswer()) {
                mark++;
            }
        }

        return mark;
    }

    private int getCorrectUserAnswer(Scanner sc, int length) {
        while(true) {
            try {
                int input = sc.nextInt();
                if(input < 1 || input > length) {
                    System.out.printf("Atsakymas turi buti tarp 1 ir %s%n", length);
                    continue;
                }

                return input;
            } catch(InputMismatchException e) {
                System.out.println("Blogas formatas, pakartokite");
                sc.nextLine();
            }
        }
    }

    private Set<Question> getQuestionsForUser () {
        Set<Question> uniqueQuestions = new LinkedHashSet<>();
        Random random = new Random();

        while(uniqueQuestions.size() < 10) {
            int numb = random.nextInt(15) + 1;
            Question question = questions.get(numb);
            if(question != null) {
                uniqueQuestions.add(question);
            }
        }

        return uniqueQuestions;
    }

    private void fillUpQuestionsMap() {
        String[] questionsSplit = QUESTIONS.split(";");
        int count = 1;
        for(String q: questionsSplit){
            //q -> Kas yra obuolys?,Gyvunas,Medis,Pastatas,Vaisius,4
            String[] qSplit = q.split(",");
            //qSplit -> 0 Kas yra obuolys?
            //1 ->Gyvunas
            //2 ->Medis
            //3 ->Pastatas
            //4 ->Vaisius
            //5 -> 4
            List<String> answers = Arrays.stream(qSplit).toList().subList(1, qSplit.length - 1);

            Question question = new Question(qSplit[0], answers, Integer.parseInt(qSplit[qSplit.length - 1]));
            questions.put(count++, question);
        }
    }
}

