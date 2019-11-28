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

    public void getTreasure(Room room){
        player.increaseTreasurePoints(room.getTreasureType().getValue());
    }

    public void fight(Room room){
        int damage = room.getEnemy().getDamagePower() - player.getStrengthPoints() - player.getDamageReduction();
        player.increaseHealthPoints(-damage);
    }

    public void passThroughRooms(){
        for(Room room : rooms){
            if(room.getEnemy() != null){
                fight(room);
            }
            if(room.getTreasureType() != null){
                getTreasure(room);
            }
        }
    }

    public String playQuest(){
        System.out.println("Starting the quest");
        passThroughRooms();
        if(player.getHealthPoints() > 0){
            return "Congratulations! You have completed the quest! You have won " + player.getTreasurePoints() + " treasure points.";
        }
        return "Sorry, you didn't survive the quest.";
    }


}
