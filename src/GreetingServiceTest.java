import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.mockito.*;

public class GreetingServiceTest {
    @Mock TimeService timeService;
    @InjectMocks GreetingService greetingService;
    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    String getGreetingTest()
    {
        when(timeService.isMorning()).thenReturn(true);

        // Act
        String result = greetingService.getGreeting("Alice");

        // Assert
        assertEquals("Good Morning Alice", result);

        // Verify interaction
        verify(timeService).isMorning();

    }

}
