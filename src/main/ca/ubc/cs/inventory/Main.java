package ca.ubc.cs.inventory;

public class Main {
    public static void main(String[] args) {
        // TODO: add code for Step 1

        InventoryItem gummyBears = new InventoryItem( "Gummy Bears", 149);
        InventoryItem inventory = new InventoryItem( "Bar Soap", 259);
        InventoryItem soap = inventory;


        // TODO: add code for Step 2

        gummyBears.addStock(25);
        soap.addStock(10);

        System.out.println("Gummy Bears in stock:" + gummyBears.getNumInStock() );
        System.out.println("Bar Soap in stock:" + inventory.getNumInStock() );
        System.out.println("Bar Soap in stock:" + soap.getNumInStock() );


        // TODO: add code for Step 3
        gummyBears.addStock(15);
        System.out.println("Gummy Bears in stock:" + gummyBears.getNumInStock() );






        // TODO: add code for Step 4




        // TODO: add code for Step 5




        // TODO: add code for Step 6




    }
}
