package rooms;

import enemies.Enemy;

public class Room {

    private String name;
    private TreasureType treasuretype;
    private Enemy enemy;

    public Room(String name, TreasureType treasureType, Enemy enemy){
        this.name = name;
        this.treasuretype = treasureType;
        this.enemy = enemy;
    }

    public String getName() {
        return this.name;
    }

    public TreasureType getTreasureType() {
        return this.treasuretype;
    }

    public Enemy getEnemy() {
        return this.enemy;
    }

}
