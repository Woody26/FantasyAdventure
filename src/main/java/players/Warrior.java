package players;

import tools.Weapon;

public class Warrior extends Player{

    private Weapon weapon;

    public Warrior(String name, Weapon weapon){
        super(name, 100, weapon.getPower(), 0, 0);
        this.weapon = weapon;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
}
