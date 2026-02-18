public class Product {

    private String name;
    private double price;
    private String[] tags;
    private static int count = 0;
    private int id;

    public Product(String name, double price, String[] tags) {
        this.name = name;
        this.price = price;
        this.tags = tags;
        count += 1;
        id = count;
    }

    public void printInfo(){

        System.out.println(id + ".Product");
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
        for (String tag : tags) {
            System.out.println(" -" + tag);
        }
    }

    public boolean hasTag(String tag) {
        for (String s : tags) {
            if (s.equals(tag)) {
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String[] getTags() {
        return tags;
    }

}
