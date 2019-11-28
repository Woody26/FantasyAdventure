package tools;

public abstract class Tool {
    private String name;
    private int power;

    public Tool(String name, int power){
        this.name = name;
        this.power = power;
    }

    public String getName(){
        return this.name;
    }

    public int getPower(){
        return this.power;
    }

    public void setPower(int power){
        this.power = power;
    }
}
