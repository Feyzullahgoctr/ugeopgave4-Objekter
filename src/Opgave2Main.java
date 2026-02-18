import java.util.Scanner;

public class Opgave2Main {

    void findProduct(Product[] products, String text) {
        for (Product p : products) {
            if (p.hasTag(text)) {
                p.printInfo();
            }
        }
    }

    int findProductCount(Product[] products, String text) {
        int count = 0;
        for (Product p : products) {
            if (p.hasTag(text)) {
                count++;
            }
        }
        return count;

    }

    double findMostExpensiveProduct(Product[] products) {
        double maxPrice = products[0].getPrice();
        for (Product p : products) {
            if (maxPrice < p.getPrice()) {
                maxPrice = p.getPrice();
            }
        }
        return maxPrice;
    }

    void FindProductWithPriceRange(Product[] products, double startingPrice, double endingPrice) {
        System.out.println("\n=== Products within the " + startingPrice + " and " + endingPrice + " range ===");
        for (Product p : products) {
            if (p.getPrice() >= startingPrice && p.getPrice() <= endingPrice) {
                p.printInfo();
                System.out.println();
            }
        }
    }

    void main() {

        Product p1 = new Product("Laptop", 5500, new String[]{"electronics", "new"});
        Product p2 = new Product("Mouse", 199, new String[]{"electronics", "sale"});
        Product p3 = new Product("Keyboard", 500, new String[]{"electronics", "sale"});
        Product p4 = new Product("Monitor", 2540, new String[]{"electronics"});

        Product[] products = {p1, p2, p3, p4};

        System.out.println(" === Alle Product ===");
        for (Product p : products) {
            p.printInfo();
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter the word to be found :");
        String text = scan.nextLine();
        int textCount = findProductCount(products, text);
        if (textCount > 0) {
            System.out.println("\n===" + text + " Product information===");
            findProduct(products,text);
        }



        double maxPrice = findMostExpensiveProduct(products);
        System.out.println("\nMax Price : " + maxPrice);

        // Ekstra udfordring
        System.out.println("Starting Price :");
        double startingPrice = scan.nextInt();
        System.out.println("Ending Price :");
        double endingPrice = scan.nextInt();
        FindProductWithPriceRange(products,startingPrice,endingPrice);

    }




}
