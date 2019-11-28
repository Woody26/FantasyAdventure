package players;

public abstract class Player {

    private String name;
    private int healthPoints;
    private int strengthPoints;
    private int treasurePoints;
    private int damageReduction;

    public Player(String name, int healthPoints, int strengthPoints, int treasurePoints, int damageReduction){
        this.name = name;
        this.healthPoints = healthPoints;
        this.strengthPoints = strengthPoints;
        this.treasurePoints = treasurePoints;
        this.damageReduction = damageReduction;
    }

    public String getName(){
        return this.name;
    }

    public int getHealthPoints(){
        return this.healthPoints;
    }

    public int getStrengthPoints(){
        return this.strengthPoints;
    }

    public int getTreasurePoints(){
        return this.treasurePoints;
    }

    public int getDamageReduction(){
        return this.damageReduction;
    }

    public void setHealthPoints(int healthPoints){
        this.healthPoints = healthPoints;
    }

    public void setStrengthPoints(int strengthPoints){
        this.strengthPoints = strengthPoints;
    }

    public void setTreasurePoints(int treasurePoints){
        this.treasurePoints = treasurePoints;
    }

    public void setDamageReduction(int damageReduction){
        this.damageReduction = damageReduction;
    }

    public void increaseHealthPoints(int increase){
        this.healthPoints += increase;
    }

    public void increaseStrengthPoints(int increase){
        this.strengthPoints += increase;
    }

    public void increaseTreasurePoints(int increase){
        this.treasurePoints += increase;
    }

    public void increaseDamageReduction(int increase){
        this.damageReduction += increase;
    }

    public void beHealed(Healer healer){
        increaseHealthPoints(10);
        healer.getPaidForHealing();
    }
}
