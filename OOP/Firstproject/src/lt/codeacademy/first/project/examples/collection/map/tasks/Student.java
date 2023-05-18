package lt.codeacademy.first.project.examples.collection.map.tasks;

public record Student(String name, String surname, String university) {
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", university='" + university + '\'' +
                '}';
    }
}
