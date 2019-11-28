package enemies;

public class Enemy {

    private String name;
    private int damagePower;

    public Enemy(String name, int damagePower){
        this.name = name;
        this.damagePower = damagePower;
    }

    public String getName(){
        return this.name;
    }

    public int getDamagePower(){
        return this.damagePower;
    }

    public void setDamagePower(int damagePower){
        this.damagePower = damagePower;
    }
}
