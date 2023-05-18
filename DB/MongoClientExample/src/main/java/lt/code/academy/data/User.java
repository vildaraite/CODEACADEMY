package lt.code.academy.data;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

public class User {
    private ObjectId id;
    private String name;
    private String surname;
    private int age;
    @BsonProperty("email")
    private String userEmail;
    private String phone;

    public User() {}

    public User(ObjectId id, String name, String surname, int age, String email, String phone) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.userEmail = email;
        this.phone = phone;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + userEmail + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}