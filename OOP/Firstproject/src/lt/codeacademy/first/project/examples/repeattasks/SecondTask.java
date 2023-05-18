package lt.codeacademy.first.project.examples.repeattasks;

public class SecondTask {
    private boolean isWorkDay;
    private boolean isHoliday;

    public static void main(String[] args) {
        SecondTask task = new SecondTask();

        task.isHoliday = false;
        task.isWorkDay = true;

        System.out.println("Ar galime meigoti " + task.canSleep());

        task.isWorkDay = false;
        System.out.println("Ar galime meigoti " + task.canSleep());
    }

    private boolean canSleep(){
        return !isWorkDay || isHoliday;
    }
}

