import java.util.ArrayList;

public class Inventory {

    private String playerName;
    private ArrayList<Item> items;
    private int maxCapacity;

    public Inventory(String playerName,int maxCapacity) {
        this.playerName = playerName;
        this.maxCapacity = maxCapacity;
        this.items = new ArrayList<>();
    }

    public String getPlayerName() {
        return playerName;
    }

    public void addItem(Item item) {
        if (items.size() < maxCapacity) {
            items.add(item);
        } else {
            System.out.println("insufficient capacity");
        }
    }
    public int getTotalValue(){
        int sum = 0;
        for (Item item : items) {
            sum += item.getValue();
        }
        return sum;
    }

    public ArrayList<Item> findItemsByType(String type) {
        ArrayList<Item> itemByType = new ArrayList<>();
        for (Item item : items) {
            if (item.getType().equals(type)) {
                itemByType.add(item);
            }
        }
        return itemByType;
    }

    public void printInventory() {
        System.out.println("=== " + playerName + " Inventory ===");
        for (Item item : items) {
            System.out.println(" -" + item);
        }
    }

}
