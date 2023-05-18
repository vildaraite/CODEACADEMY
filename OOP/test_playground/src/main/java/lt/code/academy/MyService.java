package lt.code.academy;

public class MyService {

    private final UserService userService;

    public MyService(UserService userService) {
        this.userService = userService;
    }

    int sum(int a, int b) {
        return a + b;
    }

    int sum(Integer numb, Integer numb2) {
        if(numb == null || numb2 == null) {
            return 0;
        }

        return numb + numb2;
    }

    boolean updateUser(User user) {
        User updatedUser = userService.updateUser(user);

        return updatedUser != null;
    }

    void createNewUser(User user) {
        if(user.name() == null || user.surname() == null) {
            return;
        }

        User existingUser = userService.getUser(user.name());
        if(existingUser != null) {
            throw new IllegalArgumentException();
        }

        userService.createUser(user);
    }
}