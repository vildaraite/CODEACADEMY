package lt.codeacademy.first.project.examples.inheritance.task.storage;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        Database database = new Database();
        RemoteDisk remoteDisk = new RemoteDisk();

        Info info = new Info(1, "Labas");
        Info secondInfo = new Info(2, "Next info object");

        main.save(database, info);
        main.save(remoteDisk, secondInfo);

        main.find(database, 1);
        main.find(remoteDisk, "info");
    }

    private void save(Storage storage, Info info){
        storage.saveInfo(info);
    }

    private void find(Storage storage, int id) {
        Info info = storage.findInfo(id);
        System.out.println(info);
    }

    private void find(Storage storage, String text) {
        Info info = storage.findInfo(text);
        System.out.println(info);
    }
}