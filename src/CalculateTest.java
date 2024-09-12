import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculateTest
{
    @Test
    public void summa()
    {
        Calculate calculate = new Calculate();
        int result = calculate.summa(1,2);
        assertEquals(3,result);
    }
}