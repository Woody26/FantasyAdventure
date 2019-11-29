public class HealingToolTest {

    private HealingTool healingTool;

    @Before
    public void before(){
        creature = new Creature("Grog");
    }

    @Test
    public void canGetName() {
        assertEquals("Grog", creature.getName());
    }

    @Test
    public void canGetProtectionPower() {
        assertEquals(3, creature.getProtectionPower());
    }

    @Test
    public void canSetProtectionPower() {
        creature.setProtectionPower(5);
        assertEquals(5, creature.getProtectionPower());
    }
}
