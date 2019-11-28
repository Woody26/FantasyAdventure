package rooms;

public enum TreasureType {
    GOLD(10),
    JEWELS(5);

    private final int value;

    TreasureType(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
