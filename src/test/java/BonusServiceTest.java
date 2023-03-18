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

        @org.junit.jupiter.api.Test
        void shouldCalculateForUnregisteredAndUnderLimit() {
            BonusService service = new BonusService();

            long price = 12_000;
            boolean registered = false;
            long expected = 120;

            long actual = service.calculate(price, registered);

            assertEquals(expected, actual);
        }

        @org.junit.jupiter.api.Test
        void shouldCalculateForUnregisteredAndOverimit() {
            BonusService service = new BonusService();

            long price = 100_000;
            boolean registered = false;
            long expected = 500;

            long actual = service.calculate(price, registered);

            assertEquals(expected, actual);
        }

        @org.junit.jupiter.api.Test
        void bonusBoundaryValueOver500() {
            BonusService service = new BonusService();

            long price = 16_700;
            boolean registered = true;
            long expected = 500;

            long actual = service.calculate(price, registered);

            assertEquals(expected, actual);
        }

        @org.junit.jupiter.api.Test
        void bonusBoundaryValue500() {
            BonusService service = new BonusService();

            long price = 16_667;
            boolean registered = true;
            long expected = 500;

            long actual = service.calculate(price, registered);

            assertEquals(expected, actual);
        }

        @org.junit.jupiter.api.Test
        void bonusBoundaryValueUnder500() {
            BonusService service = new BonusService();

            long price = 49_960;
            boolean registered = false;
            long expected = 499;

            long actual = service.calculate(price, registered);

            assertEquals(expected, actual);
        }

        @org.junit.jupiter.api.Test
        void negativeCost() {
            BonusService service = new BonusService();

            long price = -13_500;
            boolean registered = false;
            long expected = 0;

            long actual = service.calculate(price, registered);

            assertEquals(expected, actual);
    }
    // последний тест провален, в коде калькулятора не предусмотрена
    // ситуация ввода невалидного (отрицательного) значения в поле стоимости

    }
