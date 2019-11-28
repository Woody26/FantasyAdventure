package players;

import creatures.Creature;
import tools.Spell;

public class Magician extends Player{

    private Spell spell;
    private Creature creature;

    public Magician(String name, Spell spell, Creature creature){
        super(name, 100, spell.getPower(), 0, creature.getProtectionPower());
        this.spell = spell;
        this.creature = creature;
    }

    public Spell getSpell(){
        return this.spell;
    }

    public void setSpell(Spell spell){
        this.spell = spell;
    }

    public Creature getCreature(){
        return this.creature;
    }

    public void setCreature(Creature creature){
        this.creature = creature;
    }

}
