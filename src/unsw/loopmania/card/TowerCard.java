package unsw.loopmania.card;

import javafx.beans.property.SimpleIntegerProperty;
import unsw.loopmania.Card;
import unsw.loopmania.StaticEntity;
import unsw.loopmania.card.LootTables.*;

/**
 * represents a Tower Card in the backend game world
 */
public class TowerCard extends Card {
    
    private CardLootTable lootTable;
    private final int EXP = 10;
    private final int GOLD = 10;

    public TowerCard(SimpleIntegerProperty x, SimpleIntegerProperty y) {
        super(x, y);
        this.lootTable = new NormalLootTable();
    }    

    @Override
    public StaticEntity dropItemLoot() {
        return this.lootTable.generateItem();
    }

    @Override
    public int dropExp() {
        return EXP;
    }

    @Override
    public int dropGold() {
        return GOLD;
    }
}