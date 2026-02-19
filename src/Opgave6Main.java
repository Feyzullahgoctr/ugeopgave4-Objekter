import java.util.ArrayList;

public class Opgave6Main {

    void main() {
        Inventory player1 = new Inventory("Hero", 3);
        Inventory player2 = new Inventory("Warrior", 4);

        player1.addItem(new Item("Armor",150,"Defense"));
        player1.addItem(new Item("Sword",120,"Attack"));
        player1.addItem(new Item("Bow",100,"Attack"));

        player2.addItem(new Item("Shield",200,"Defence"));
        player2.addItem(new Item("Health potion",250,"Health"));
        player2.addItem(new Item("Spear",120,"Attack"));
        player2.addItem(new Item("Apple",80,"Health"));

        player1.printInventory();
        player2.printInventory();

        System.out.println("Total Item : " + Item.getTotalItemsCreated());

        System.out.println(player1.getPlayerName() + " Total Value : "+ player1.getTotalValue());
        System.out.println(player2.getPlayerName() + " Total Value : "+ player2.getTotalValue());

        System.out.println("Total Average Item Value : " + Item.getAverageItemValue());

        ArrayList<Item> findItem = player2.findItemsByType("Health");
        System.out.println(player2.getPlayerName() + " Health Item");
        for (Item item : findItem) {
            System.out.println(" -" + item);
        }


    }

}
