package lt.code.academy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MyServiceTest {
    @Mock
    private UserService userService;

    @InjectMocks
    private MyService service;

    @BeforeEach
    void setUp() {
        //userService = Mockito.mock(UserService.class);
        //service = new MyService(userService);
    }

    //void test_when_resultIsCorrect() {
    //void test_when_result_is_correct() {
    @Test
    void testWhenResultIsCorrect() {
        double result = Math.pow(3, 3);

        assertEquals(27, result);
    }

    @Test
    void testSum() {
        int sum = service.sum(50, 50);

        assertEquals(100, sum);
    }

    @Test
    void testSumWhenFirstNumbIsNull() {
        int sum = service.sum(null, 50);

        assertEquals(0, sum);
    }

    @Test
    void testSumWhenSecondNumbIsNull() {
        int sum = service.sum(50, null);

        assertEquals(0, sum);
    }

    @Test
    void testSumWhenBothNumbIsCorrect() {
        Integer a = 20;
        Integer b = 20;

        int sum = service.sum(a, b);

        assertEquals(40, sum);
    }

    @Test
    void testUpdateUserWhenUserNotUpdated() {
        when(userService.updateUser(any(User.class))).thenReturn(null);

        boolean result = service.updateUser(new User("", ""));

        assertFalse(result);
    }

    @Test
    void testUpdateUserWhenThrowException() {
        doThrow(RuntimeException.class).when(userService).updateUser(any(User.class));

        assertThrows(RuntimeException.class, () -> service.updateUser(new User("A", "B")));
    }

    @Test
    void testUpdateUserWhenUserUpdated() {
        User user = new User("A", "B");
        when(userService.updateUser(any(User.class))).thenReturn(user);

        boolean isUpdated = service.updateUser(user);

        assertTrue(isUpdated);
    }

    @Test
    void testCreateNewUserWhenNameIsNull() {
        service.createNewUser(new User(null, "B"));

        verify(userService, times(0)).getUser(anyString());
    }

    @Test
    void testCreateNewUserWhenSurnameIsNull() {
        service.createNewUser(new User("A", null));

        verify(userService, times(0)).getUser(eq("A"));
    }

    @Test
    void testCreateNewUserWhenUserExist() {
        User user = new User("A", "B");
        when(userService.getUser(eq("A"))).thenReturn(user);

        assertThrows(IllegalArgumentException.class, () -> service.createNewUser(user));
    }

    @Test
    void testCreateNewUser() {
        User user = new User("Andrius", "B");
        when(userService.getUser(eq("Andrius"))).thenReturn(null);

        service.createNewUser(user);

        verify(userService, times(1)).createUser(any(User.class));
    }
}