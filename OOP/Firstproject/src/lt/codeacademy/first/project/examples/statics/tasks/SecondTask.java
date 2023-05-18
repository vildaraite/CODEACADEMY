package lt.codeacademy.first.project.examples.statics.tasks;

class SecondTask {

    static int count;

    SecondTask(){
        System.out.println("Kintamojo reiksme" + count++);
    }

    static void cleanUp() {
        System.out.println("Pries isvalyma: " + count);
        count = 0;
    }
}
