import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.Vaccination;


public class VaccanationTest {
    @Test
     void testCashVacancion(int income, int expenses, int threshold) {
        Vaccination vaccination = new Vaccination();
        int expected = 3;
        int actual = vaccination.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
