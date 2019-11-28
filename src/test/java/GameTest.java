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

    @Test
    public void magicianCanFight(){
        rooms.add(room);
        game = new Game(magician, rooms);
        game.fight(room);
        assertEquals(95, magician.getHealthPoints());
    }

    @Test
    public void healerCanFight(){
        rooms.add(room);
        game = new Game(healer, rooms);
        game.fight(room);
        assertEquals(95, healer.getHealthPoints());
    }

    @Test
    public void warriorCanGetTreasure(){
        rooms.add(room);
        game = new Game(warrior, rooms);
        game.getTreasure(room);
        assertEquals(10, warrior.getTreasurePoints());
    }

    @Test
    public void magicianCanGetTreasure(){
        rooms.add(room);
        game = new Game(magician, rooms);
        game.getTreasure(room);
        assertEquals(10, magician.getTreasurePoints());
    }

    @Test
    public void healerCanGetTreasure(){
        rooms.add(room);
        game = new Game(healer, rooms);
        game.getTreasure(room);
        assertEquals(10, healer.getTreasurePoints());
    }
}
