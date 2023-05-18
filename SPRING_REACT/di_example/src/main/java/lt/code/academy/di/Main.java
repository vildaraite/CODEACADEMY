package lt.code.academy.di;

import lt.code.academy.di.config.ApplicationConfig;
import lt.code.academy.di.repository.InternalMarkDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.javaMarksAverageDI();
        main.springMarksAverageDI();
    }

    private void javaMarksAverageDI() {
        GradeService gradeService = new GradeService(new InternalMarkDao(), new SimpleService(new AnotherService()));
        System.out.printf("java marks average: %s%n", gradeService.getMarkAverage());
    }

    private void springMarksAverageDI() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        GradeService gradeService = applicationContext.getBean(GradeService.class);
        System.out.printf("Spring marks average %s%n", gradeService.getMarkAverage());
    }
}