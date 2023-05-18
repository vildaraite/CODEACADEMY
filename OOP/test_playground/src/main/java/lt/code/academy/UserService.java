package lt.code.academy;

public class UserService {

    public User getUser(String name) {
        return new User(name, "Baltrunas");
    }

    public void deleteUser(User user) {

    }

    /**
     * throws {@link RuntimeException} exception if cannot connect to bla bla ....
     * @param user
     * @return
     */
    public User updateUser(User user) {
        return user;
    }

    public void createUser(User user) {
    }
}