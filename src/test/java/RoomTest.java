import enemies.Enemy;
import org.junit.Before;
import org.junit.Test;
import rooms.Room;
import rooms.TreasureType;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Room room;
    private Enemy enemy;

    @Before
    public void before(){
        enemy = new Enemy("Bill");
        room = new Room("Grog", TreasureType.JEWELS, enemy);

    }

    @Test
    public void canGetName() {
        assertEquals("Grog", room.getName());
    }

    @Test
    public void canGetTreasureType() {
        assertEquals(TreasureType.JEWELS, room.getTreasureType());
    }

    @Test
    public void canGetEnemy() {
        assertEquals(enemy, room.getEnemy());
    }
}
