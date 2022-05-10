public class BonusServiceTest {
    //import static org.junit.jupiter.api.Assertions .*;
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);
        //assertEquals (expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        //assertEquals (expected, actual);

    }

    @org.junit.jupiter.api.Test
        // Граничное значение: 0 Для зарегистрированных
    void shouldCalculateForRegisteredZeroBonus() {
        BonusService service = new BonusService();
        long amount = 1500;
        boolean registered = true;
        long expected = 0;
        long actual = service.calculate(amount, registered);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000_60;
        boolean registered = false;
        long expected = 500;
        long actual = service.calculate(amount, registered);
        //assertEquals (expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000_60;
        boolean registered = false;
        long expected = 30;
        long actual = service.calculate(amount, registered);
        //assertEquals (expected, actual);
    }
}