package lt.codeacademy.first.project.examples.repeat;

class StringRepeatExample {

    int countLettersInText(String text){
        return text.length();
    }

    String replaceCharInText(String text){
        return text.replace("s", "!");
    }

    void printText(String text){
        String newText = replaceCharInText(text);
        int lenght = countLettersInText(text);
        System.out.printf("%s -> %s%n", newText, lenght);
    }

}
