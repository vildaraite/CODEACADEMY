package lt.codeacademy.first.project.examples.statics.tasks;

class FirstTask {
    private int i;

    void setValue(int i){
        System.out.println(i);

        this.i= i;
    }

    static void staticMethod(int j) {
        //i = j; priskirti reiksmes negalime
        System.out.println(j);
    }
}
