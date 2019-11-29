import org.junit.Before;
import org.junit.Test;
import tools.HealingTool;

import static org.junit.Assert.assertEquals;

public class HealingToolTest {

    private HealingTool healingTool;

    @Before
    public void before(){
        healingTool = new HealingTool("Grog");
    }

    @Test
    public void canGetName() {
        assertEquals("Grog", healingTool.getName());
    }

    @Test
    public void canGetPower() {
        assertEquals(3, healingTool.getPower());
    }

    @Test
    public void canSetPower() {
        healingTool.setPower(5);
        assertEquals(5, healingTool.getPower());
    }
}
