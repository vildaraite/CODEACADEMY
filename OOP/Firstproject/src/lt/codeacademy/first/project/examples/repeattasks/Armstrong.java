package lt.codeacademy.first.project.examples.repeattasks;

public class Armstrong {
    private int tempNumber;
    public static void main(String[] args) {
        int a = 100;
        int b = 999;
        Armstrong task = new Armstrong();

        for(int i = a; i <= b;  i++){
            if(task.isArmstrongNumber(i)){
                System.out.printf("%s ", i);
            }
        }
    }
    //100
    private boolean isArmstrongNumber(int number) {
        tempNumber = number;
        //100 == 1^3 + 0^3 + 0^3
        int a = getDigitFromNumber();
        int b = getDigitFromNumber();
        int c = getDigitFromNumber();
        int sum  =(int)( Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));

        return number == sum;
    }

    private int getDigitFromNumber() {
        int result = tempNumber % 10;
        tempNumber = tempNumber / 10;

        return  result;
    }
}

