package players;

import tools.HealingTool;

public class Healer extends Player{

    private HealingTool healingTool;

    public Healer(String name, HealingTool healingTool){
        super(name, 100, 0, 0, 5);
        this.healingTool = healingTool;
    }

    public HealingTool getHealingTool(){
        return this.healingTool;
    }

    public void setHealingTool(HealingTool healingTool){
        this.healingTool = healingTool;
    }

    public void getPaidForHealing(){
        increaseTreasurePoints(10);
    }
}
