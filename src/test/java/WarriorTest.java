import org.junit.Before;
import org.junit.Test;
import players.Healer;
import players.Warrior;
import tools.HealingTool;
import tools.Weapon;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    private HealingTool newHealingTool;
    private Healer doctor;
    private Warrior warrior;
    private Weapon weapon;
    private Weapon weapon2;

    @Before
    public void before(){
        weapon = new Weapon("Bash");
        weapon2 = new Weapon("Bosh");
        warrior = new Warrior("Bob", weapon);
        newHealingTool = new HealingTool("bandaid");
        doctor = new Healer("Greg", newHealingTool);
    }

    @Test
    public void canGetName() {
        assertEquals("Bob", warrior.getName());
    }

    @Test
    public void canGetHealthPoints() {
        assertEquals(100, warrior.getHealthPoints());
    }

    @Test
    public void canGetStrengthPoints() {
        assertEquals(5, warrior.getStrengthPoints());
    }

    @Test
    public void canGetTreasurePoints() {
        assertEquals(0, warrior.getTreasurePoints());
    }

    @Test
    public void canGetDamageReduction() {
        assertEquals(0, warrior.getDamageReduction());
    }

    @Test
    public void canGetWeapon() {
        assertEquals(weapon, warrior.getWeapon());
    }

    @Test
    public void canSetWeapon() {
        warrior.setWeapon(weapon2);
        assertEquals(weapon2, warrior.getWeapon());
    }

    @Test
    public void canSetHealthPoints() {
        warrior.setHealthPoints(90);
        assertEquals(90, warrior.getHealthPoints());
    }

    @Test
    public void canSetStrengthPoints() {
        warrior.setStrengthPoints(90);
        assertEquals(90, warrior.getStrengthPoints());
    }

    @Test
    public void canSetTreasurePoints() {
        warrior.setTreasurePoints(90);
        assertEquals(90, warrior.getTreasurePoints());
    }

    @Test
    public void canSetDamageReduction() {
        warrior.setDamageReduction(90);
        assertEquals(90, warrior.getDamageReduction());
    }

    @Test
    public void canIncreaseHealthPoints() {
        warrior.increaseHealthPoints(90);
        assertEquals(190, warrior.getHealthPoints());
    }

    @Test
    public void canIncreaseStrengthPoints() {
        warrior.increaseStrengthPoints(90);
        assertEquals(95, warrior.getStrengthPoints());
    }

    @Test
    public void canIncreaseTreasurePoints() {
        warrior.increaseTreasurePoints(90);
        assertEquals(90, warrior.getTreasurePoints());
    }

    @Test
    public void canIncreaseDamageReduction() {
        warrior.increaseDamageReduction(90);
        assertEquals(90, warrior.getDamageReduction());
    }

    @Test
    public void canBeHealed(){
        warrior.beHealed(doctor);
        assertEquals(110, warrior.getHealthPoints());
        assertEquals(10, doctor.getTreasurePoints());
    }
}
