import org.junit.Before;
import org.junit.Test;
import players.Healer;
import tools.HealingTool;

import static org.junit.Assert.assertEquals;

public class HealerTest {

        private Healer healer;
        private HealingTool healingTool;
        private HealingTool newHealingTool;
        private Healer healer2;

        @Before
        public void before(){
            healingTool = new HealingTool("micropore");
            healer = new Healer("Grog", healingTool);
            newHealingTool = new HealingTool("bandaid");
            healer2 = new Healer("Greg", newHealingTool);
        }

        @Test
        public void canGetName() {
            assertEquals("Grog", healer.getName());
        }

        @Test
        public void canGetHealthPoints() {
        assertEquals(100, healer.getHealthPoints());
        }

        @Test
        public void canGetStrengthPoints() {
        assertEquals(0, healer.getStrengthPoints());
        }

        @Test
        public void canGetTreasurePoints() {
        assertEquals(0, healer.getTreasurePoints());
        }

        @Test
        public void canGetDamageReduction() {
            assertEquals(5, healer.getDamageReduction());
        }

        @Test
        public void canGetHealingTool() {
            assertEquals(healingTool, healer.getHealingTool());
        }

        @Test
        public void canGetPaidForHealing(){
            healer.getPaidForHealing();
            assertEquals(10, healer.getTreasurePoints());
        }

        @Test
        public void canSetHealingTool() {
            healer.setHealingTool(newHealingTool);
            assertEquals(newHealingTool, healer.getHealingTool());
        }

        @Test
        public void canSetHealthPoints() {
            healer.setHealthPoints(90);
            assertEquals(90, healer.getHealthPoints());
        }

        @Test
        public void canSetStrengthPoints() {
            healer.setStrengthPoints(90);
            assertEquals(90, healer.getStrengthPoints());
        }

        @Test
        public void canSetTreasurePoints() {
            healer.setTreasurePoints(90);
            assertEquals(90, healer.getTreasurePoints());
        }

        @Test
        public void canSetDamageReduction() {
            healer.setDamageReduction(90);
            assertEquals(90, healer.getDamageReduction());
        }

        @Test
        public void canIncreaseHealthPoints() {
            healer.increaseHealthPoints(90);
            assertEquals(190, healer.getHealthPoints());
        }

        @Test
        public void canIncreaseStrengthPoints() {
            healer.increaseStrengthPoints(90);
            assertEquals(90, healer.getStrengthPoints());
        }

        @Test
        public void canIncreaseTreasurePoints() {
            healer.increaseTreasurePoints(90);
            assertEquals(90, healer.getTreasurePoints());
        }

        @Test
        public void canIncreaseDamageReduction() {
            healer.increaseDamageReduction(90);
            assertEquals(95, healer.getDamageReduction());
        }

        @Test
        public void canBeHealed(){
            healer.beHealed(healer2);
            assertEquals(110, healer.getHealthPoints());
            assertEquals(10, healer2.getTreasurePoints());
        }


}


