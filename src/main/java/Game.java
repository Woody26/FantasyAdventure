import enemies.Enemy;
import players.Player;
import rooms.Room;
import rooms.TreasureType;

import java.util.ArrayList;

public class Game {

    private Player player;
    private ArrayList<Room> rooms;

    public Game(Player player, ArrayList<Room> rooms){
        this.player = player;
        this.rooms = rooms;
    }

    public void setPlayer(Player newPlayer){
        this.player = newPlayer;
    }

    public void addRoom(Room room){
        this.rooms.add(room);
    }

    public void getTreasure(Player player, TreasureType treasureType){
        player.increaseTreasurePoints(treasureType.getValue());
    }

    public void fight(Player player, Enemy enemy){
        int damage = enemy.getDamagePower() - player.getStrengthPoints() - player.getDamageReduction();
        player.increaseHealthPoints(-damage);
    }
}
