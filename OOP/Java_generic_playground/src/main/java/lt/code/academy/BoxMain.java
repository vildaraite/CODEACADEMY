package lt.code.academy;

public class BoxMain {
    public static void main(String[] args) {
        Box box = new Box();
        box.setOb(500);

        if(box.getOb() instanceof Integer intValue) {
            System.out.println(intValue);
        }
        //int value = (int) box.getOb();

        box.setOb("500");

        if(box.getOb() instanceof String stringValue) {
            System.out.println(stringValue);
        }
        //value = (int) box.getOb();

        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        integerGenericBox.setObj(555);
        integerGenericBox.setObj(500);
        //integerGenericBox.setObj("500");

        GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.setObj("5800");
        stringGenericBox.setObj("labas");
        //stringGenericBox.setObj(5000);

        GenericBox<User> userGenericBox = new GenericBox<>();
        userGenericBox.setObj(new User("aaaaa"));

        Pair<Integer, String> pair = new CustomPair<>(10, "Petras");
        Pair<Integer, Integer> pair2 = new CustomPair<>(10, 50);
        Pair<String, GenericBox<User>> pair1 = new CustomPair<>("1", new GenericBox<>());

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

        GenericBox raw = new GenericBox();

        raw.setObj(10);
        int val = (int) raw.getObj();

        raw.setObj("1000");
        //val = (int) raw.getObj(); //class cast exception
    }
}
