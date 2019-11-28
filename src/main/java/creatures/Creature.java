package creatures;

public class Creature {

    private String name;
    private int protectionPower;

    public Creature(String name){
        this.name = name;
        this.protectionPower = 3;
    }

    public String getName(){
        return this.name;
    }

    public int getProtectionPower(){
        return this.protectionPower;
    }

    public void setProtectionPower(int protectionPower){
        this.protectionPower = protectionPower;
    }
}

