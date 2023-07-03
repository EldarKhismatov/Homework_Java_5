import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.Vaccination;


public class VaccanationTest {
    @Test
     void testCashVacancion(int expected, int income, int expenses, int threshold) {
        Vaccination vaccination = new Vaccination();
        expected = 3;
        income = 10_000;
        expenses = 3_000; // обязательные месячные траты
        threshold = 20_000; // есть возможность отдохнуть
        int actual = vaccination.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
