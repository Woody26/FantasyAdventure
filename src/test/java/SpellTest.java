import org.junit.Before;
import org.junit.Test;
import tools.Spell;

import static org.junit.Assert.assertEquals;

public class SpellTest {

    private Spell spell;

    @Before
    public void before(){
        spell = new Spell("Grog");
    }

    @Test
    public void canGetName() {
        assertEquals("Grog", spell.getName());
    }

    @Test
    public void canGetPower() {
        assertEquals(2, spell.getPower());
    }

    @Test
    public void canSetPower() {
        spell.setPower(3);
        assertEquals(3, spell.getPower());
    }
}
