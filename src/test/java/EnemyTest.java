import enemies.Enemy;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    private Enemy enemy;

    @Before
    public void before(){
        enemy = new Enemy("Grog");
    }

    @Test
    public void canGetName() {
        assertEquals("Grog", enemy.getName());
    }

    @Test
    public void canGetDamagePower() {
        assertEquals(10, enemy.getDamagePower());
    }

    @Test
    public void canSetDamagePower() {
        enemy.setDamagePower(5);
        assertEquals(5, enemy.getDamagePower());
    }
}

