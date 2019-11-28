import creatures.Creature;
import enemies.Enemy;
import org.junit.Before;
import org.junit.Test;
import players.Healer;
import players.Magician;
import players.Warrior;
import rooms.Room;
import rooms.TreasureType;
import tools.HealingTool;
import tools.Spell;
import tools.Weapon;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;
    private Warrior warrior;
    private Magician magician;
    private Healer healer;
    private Room room;
    private Enemy enemy;
    private Weapon weapon;
    private Spell spell;
    private Creature creature;
    private HealingTool healingTool;
    private ArrayList<Room> rooms;

    @Before
    public void before(){
        enemy = new Enemy("Grog");
        room = new Room("Hopper", TreasureType.GOLD, enemy);
        weapon = new Weapon("Dyrnwyn");
        spell = new Spell("Gotcha");
        creature = new Creature("Fido");
        healingTool = new HealingTool("Micropore");
        warrior = new Warrior("Alan", weapon);
        magician = new Magician("Paula", spell, creature);
        healer = new Healer("Jim", healingTool);
        rooms = new ArrayList<Room>();
    }

    @Test
    public void warriorCanFight(){
        rooms.add(room);
        game = new Game(warrior, rooms);
        game.fight(room);
        assertEquals(95, warrior.getHealthPoints());
    }
}
