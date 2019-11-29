import creatures.Creature;
import org.junit.Before;
import org.junit.Test;
import players.Healer;
import players.Magician;
import tools.HealingTool;
import tools.Spell;

import static org.junit.Assert.assertEquals;

public class MagicianTest {
    
        private HealingTool newHealingTool;
        private Healer doctor;
        private Magician magician;
        private Spell spell;
        private Spell spell2;
        private Creature creature;
        private Creature creature2;

        @Before
        public void before(){
            creature = new Creature ("Grog");
            spell = new Spell("Gotcha");
            magician = new Magician("Mike", spell, creature);
            newHealingTool = new HealingTool("bandaid");
            doctor = new Healer("Greg", newHealingTool);
        }

        @Test
        public void canGetName() {
            assertEquals("Mike", magician.getName());
        }

        @Test
        public void canGetHealthPoints() {
            assertEquals(100, magician.getHealthPoints());
        }

        @Test
        public void canGetStrengthPoints() {
            assertEquals(2, magician.getStrengthPoints());
        }

        @Test
        public void canGetTreasurePoints() {
            assertEquals(0, magician.getTreasurePoints());
        }

        @Test
        public void canGetDamageReduction() {
            assertEquals(3, magician.getDamageReduction());
        }

        @Test
        public void canGetSpell() {
            assertEquals(spell, magician.getSpell());
        }

        @Test
        public void canGetCreature() {
            assertEquals(creature, magician.getCreature());
        }

        @Test
        public void canSetSpell() {
            magician.setSpell(spell2);
            assertEquals(spell2, magician.getSpell());
        }

        @Test
        public void canSetCreature() {
            magician.setCreature(creature2);
            assertEquals(creature2, magician.getCreature());
        }

        @Test
        public void canSetHealthPoints() {
            magician.setHealthPoints(90);
            assertEquals(90, magician.getHealthPoints());
        }

        @Test
        public void canSetStrengthPoints() {
            magician.setStrengthPoints(90);
            assertEquals(90, magician.getStrengthPoints());
        }

        @Test
        public void canSetTreasurePoints() {
            magician.setTreasurePoints(90);
            assertEquals(90, magician.getTreasurePoints());
        }

        @Test
        public void canSetDamageReduction() {
            magician.setDamageReduction(90);
            assertEquals(90, magician.getDamageReduction());
        }

        @Test
        public void canIncreaseHealthPoints() {
            magician.increaseHealthPoints(90);
            assertEquals(190, magician.getHealthPoints());
        }

        @Test
        public void canIncreaseStrengthPoints() {
            magician.increaseStrengthPoints(90);
            assertEquals(92, magician.getStrengthPoints());
        }

        @Test
        public void canIncreaseTreasurePoints() {
            magician.increaseTreasurePoints(90);
            assertEquals(90, magician.getTreasurePoints());
        }

        @Test
        public void canIncreaseDamageReduction() {
            magician.increaseDamageReduction(90);
            assertEquals(93, magician.getDamageReduction());
        }

        @Test
        public void canBeHealed(){
            magician.beHealed(doctor);
            assertEquals(110, magician.getHealthPoints());
            assertEquals(10, doctor.getTreasurePoints());
        }


}

