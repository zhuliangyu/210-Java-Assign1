package ca.ubc.cs.inventory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // TODO: add code for Step 1

        InventoryItem gummyBears = new InventoryItem( "Gummy Bears", 149);
        InventoryItem inventory = new InventoryItem( "Bar Soap", 259);
        InventoryItem soap = inventory;


        // TODO: add code for Step 2

        gummyBears.addStock(25);
        soap.addStock(10);

        System.out.println(gummyBears.getDescription() + " in stock: " + gummyBears.getNumInStock() );
        System.out.println(inventory.getDescription() + " in stock: " + inventory.getNumInStock() );
        System.out.println(soap.getDescription() + " in stock: " + soap.getNumInStock() );


        // TODO: add code for Step 3
        gummyBears.addStock(15);
        System.out.println(gummyBears.getDescription() + " in stock: " + gummyBears.getNumInStock() );






        // TODO: add code for Step 4
        inventory = gummyBears;

        inventory.setPrice( inventory.getCostInCents() + 50);


        System.out.println(gummyBears.getDescription() + " price: " + gummyBears.getCostInCents() + 'c');
        System.out.println(soap.getDescription() + " price: " + soap.getCostInCents() + 'c');
        System.out.println(inventory.getDescription() + " price: " + inventory.getCostInCents() + 'c');




        // TODO: add code for Step 5
        ArrayList<InventoryItem> inventoryList = new ArrayList<InventoryItem>();
        inventoryList.add(gummyBears);
        inventoryList.add(gummyBears);
        inventoryList.add(soap);





        // TODO: add code for Step 6
        inventoryList.get(0).removeFromStock(1);
        inventoryList.get(1).removeFromStock(1);
        gummyBears.removeFromStock(1);
        inventory.removeFromStock(1);

        System.out.println( gummyBears.getDescription() + " in stock: "+ gummyBears.getNumInStock());




    }
}
