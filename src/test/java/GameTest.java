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
    private Room enemyRoom;
    private Room treasureRoom;
    private Enemy enemy;
    private Weapon weapon;
    private Spell spell;
    private Creature creature;
    private HealingTool healingTool;
    private ArrayList<Room> rooms;

    @Before
    public void before(){
        enemy = new Enemy("Grog");
        enemyRoom = new Room("Hopper", null, enemy);
        treasureRoom = new Room("Sinclair", TreasureType.GOLD, null);
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
        rooms.add(enemyRoom);
        game = new Game(warrior, rooms);
        game.fight(enemyRoom);
        assertEquals(95, warrior.getHealthPoints());
    }

    @Test
    public void magicianCanFight(){
        rooms.add(enemyRoom);
        game = new Game(magician, rooms);
        game.fight(enemyRoom);
        assertEquals(95, magician.getHealthPoints());
    }

    @Test
    public void healerCanFight(){
        rooms.add(enemyRoom);
        game = new Game(healer, rooms);
        game.fight(enemyRoom);
        assertEquals(95, healer.getHealthPoints());
    }

    @Test
    public void warriorCanGetTreasure(){
        rooms.add(treasureRoom);
        game = new Game(warrior, rooms);
        game.getTreasure(treasureRoom);
        assertEquals(10, warrior.getTreasurePoints());
    }

    @Test
    public void magicianCanGetTreasure(){
        rooms.add(treasureRoom);
        game = new Game(magician, rooms);
        game.getTreasure(treasureRoom);
        assertEquals(10, magician.getTreasurePoints());
    }

    @Test
    public void healerCanGetTreasure(){
        rooms.add(treasureRoom);
        game = new Game(healer, rooms);
        game.getTreasure(treasureRoom);
        assertEquals(10, healer.getTreasurePoints());
    }

    @Test
    public void canPassThroughRooms(){
        rooms.add(enemyRoom);
        rooms.add(treasureRoom);
        game = new Game(warrior, rooms);
        game.passThroughRooms();
        assertEquals(95, warrior.getHealthPoints());
        assertEquals(10, warrior.getTreasurePoints());
    }

    @Test
    public void healerCanHeal(){
        warrior.beHealed(healer);
        assertEquals(110, warrior.getHealthPoints());
        assertEquals(10, healer.getTreasurePoints());
    }
}
