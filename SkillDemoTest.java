import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void productTest() {
        assertEquals(2, SkillDemo.product(1, 2)); // This test fails
    }
}
