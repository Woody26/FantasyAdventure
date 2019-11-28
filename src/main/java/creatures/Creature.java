package creatures;

public class Creature {

    private String name;
    private int protectionPower;

    public Creature(String name, int protectionPower){
        this.name = name;
        this.protectionPower = protectionPower;
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

