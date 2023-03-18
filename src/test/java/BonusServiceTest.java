import org.example.BonusService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long price = 12_000;
        boolean registered = true;
        long expected = 360;

        long actual = service.calculate(price, registered);

        assertEquals(expected, actual);
    }

        @org.junit.jupiter.api.Test
        void shouldCalculateForRegisteredAndUOverLimit () {
            BonusService service = new BonusService();

            long price = 100_000;
            boolean registered = true;
            long expected = 500;

            long actual = service.calculate(price, registered);

            assertEquals(expected, actual);
        }
    }
