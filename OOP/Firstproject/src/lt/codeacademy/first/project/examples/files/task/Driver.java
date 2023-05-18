package lt.codeacademy.first.project.examples.files.task;

public record Driver(String name, String car, String carnumber, int km) {
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s", name, car, carnumber, km);
    }
}
