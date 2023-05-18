package lt.codeacademy.first.project.examples.inheritance.extend;

public class Student extends Person{
    private final String id;
    private final String university;

    public Student(String name, String surname, String id, String university) {
        super(name, surname);
        this.id = id;
        this.university = university;
    }

    public String getId() {
        return id;
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public String toString(){
        return String.format("id: %s, university: %s", id, university);
    }
}
