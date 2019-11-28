package players;

import tools.Weapon;

public class Warrior extends Player{

    private Weapon weapon;

    public Warrior(String name, int healthPoints, int strengthPoints, int treasurePoints, int damageReduction, Weapon weapon){
        super(name, healthPoints, strengthPoints, treasurePoints, damageReduction);
        this.weapon = weapon;
    }


    public Weapon getWeapon(){
        return this.weapon;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
}
