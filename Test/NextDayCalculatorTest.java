import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;

public class NextDayCalculatorTest {
    @Test
    @DisplayName("case 1/1/2018")
     public void testDay1Month1year2018() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2-1-2018";
        String result = NextDay.nextDayCalculator(day, month, year);
        assertEquals(result, expected);
    }

}