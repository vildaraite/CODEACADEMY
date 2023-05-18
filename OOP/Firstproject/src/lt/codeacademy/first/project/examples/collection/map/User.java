package lt.codeacademy.first.project.examples.collection.map;

import java.util.Objects;
// implementuojame parasydami implements Comparable <>
public class User implements Comparable<User>{
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(User o) {
        if(id == o.id){
            return name.compareTo(o.name);
        }
        return id > o.id ? 1 : -1;
    }
}
