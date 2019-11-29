import org.junit.Before;
import org.junit.Test;
import tools.Weapon;

import static org.junit.Assert.assertEquals;

public class WeaponTest {

    private Weapon weapon;

    @Before
    public void before(){
        weapon = new Weapon("Grog");
    }

    @Test
    public void canGetName() {
        assertEquals("Grog", weapon.getName());
    }

    @Test
    public void canGetPower() {
        assertEquals(5, weapon.getPower());
    }

    @Test
    public void canSetPower() {
        weapon.setPower(3);
        assertEquals(3, weapon.getPower());
    }
}
