package players;

import tools.HealingTool;

public class Healer extends Player{

    private HealingTool healingTool;

    public Healer(String name, int healthPoints, int strengthPoints, int treasurePoints, int damageReduction, HealingTool healingTool){
        super(name, healthPoints, strengthPoints, treasurePoints, damageReduction);
        this.healingTool = healingTool;
    }


    public HealingTool getHealingTool(){
        return this.healingTool;
    }

    public void setHealingTool(HealingTool healingTool){
        this.healingTool = healingTool;
    }
}
