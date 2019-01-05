package ca.ubc.cs.inventory;

// TODO: fix code for Step 3

// Represents an inventory item with a description, cost in cents and a count of the number currently in stock
public class InventoryItem {
    private String description;
    private int costInCents;
    private int numInStock;

    // REQUIRES: costInCents > 0
    // EFFECTS: constructs and inventory item with given description and cost in cents
    public InventoryItem(String description, int costInCents) {
        this.description = description;
        this.costInCents = costInCents;
        this.numInStock = 0;
    }

    // REQUIRES: numItems > 0
    // MODIFIES: this
    // EFFECTS: adds numItems items to the stock of this inventory item
    public void addStock(int numItems) {
        numInStock = +numItems;
    }

    // REQUIRES: numItems <= getNumInStock()
    // MODIFIES: this
    // EFFECTS: removes numItems items from the stock of this inventory item
    public void removeFromStock(int numItems) {
        numInStock = -numItems;
    }

    // REQUIRES: costInCents > 0
    // MODIFIES: this
    // EFFECTS: sets the price of this inventory item to costInCents
    public void setPrice(int costInCents) {
        this.costInCents = costInCents;
    }

    // getters
    public String getDescription() { return description;}
    public int getCostInCents() { return costInCents; }
    public int getNumInStock() { return numInStock; }
}
