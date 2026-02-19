public class Item {

    private String name;
    private int value;
    private String type;

    private static int totalItemsCreated = 0;
    // Ekstra udfordring
    private static double sumValue = 0;

    public Item(String name, int value, String type) {
        this.name = name;
        this.value = value;
        this.type = type;
        totalItemsCreated += 1;
        sumValue += value;
    }

    public String getName() {
        return name;
    }
    public int getValue() {
        return value;
    }
    public String getType() {
        return type;
    }

    public static int getTotalItemsCreated() {
        return totalItemsCreated;
    }

    public String toString() {
        return "Name :" + name + ", Value :" + value + ", Type :" + type;
    }

    public static double getAverageItemValue() {
        if (totalItemsCreated == 0) {
            return 0;
        }
        return (double) (sumValue / totalItemsCreated);
    }

}
