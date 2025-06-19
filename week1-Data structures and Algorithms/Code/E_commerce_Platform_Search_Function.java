import java.util.Arrays;
import java.util.Scanner;

class Product implements Comparable<Product> {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String toString() {
        return "[" + productId + ", " + productName + ", " + category + "]";
    }

    public int compareTo(Product other) {
        return Integer.compare(this.productId, other.productId);
    }
}

class SearchUtil {

    public static Product linearSearch(Product[] products, int targetId) {
        for (Product product : products) {
            if (product.productId == targetId) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].productId == targetId) {
                return products[mid];
            } else if (products[mid].productId < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}

public class E_commerce_Platform_Search_Function {

    public static void explainAsymptoticNotation() {
        System.out.println("----- 1. Understanding Asymptotic Notation -----");
        System.out.println("Big O notation describes the performance (time/space) of an algorithm as input size increases.");
        System.out.println("It helps us understand how efficient an algorithm is.");
        System.out.println("Best Case: The input causes the least work.");
        System.out.println("Average Case: The expected amount of work for random input.");
        System.out.println("Worst Case: The input causes the most work.");
        System.out.println("------------------------------------------------\n");
    }

    public static void analyzeSearchAlgorithms() {
        System.out.println("\n----- 4. Time Complexity Analysis -----");

        System.out.println("Linear Search:");
        System.out.println("Time Complexity: O(n)");
        System.out.println("Best Case: O(1) - Target is at beginning");
        System.out.println("Average Case: O(n/2) ≈ O(n)");
        System.out.println("Worst Case: O(n) - Target is at end or not present\n");

        System.out.println("Binary Search:");
        System.out.println("Time Complexity: O(log n)");
        System.out.println("Best Case: O(1) - Target is at the middle");
        System.out.println("Average Case: O(log n)");
        System.out.println("Worst Case: O(log n) - Keep halving till found or empty\n");

        System.out.println("Conclusion:");
        System.out.println("Binary search is faster but needs sorted data.");
        System.out.println("Linear search works without sorting but is slower for large datasets.");
        System.out.println("For fast e-commerce search, binary search is more suitable.");
        System.out.println("-------------------------------------------\n");
    }

    public static void main(String[] args) {
        explainAsymptoticNotation();

        System.out.println("----- 2. Setup: Creating Products -----");
        Product[] products = {
            new Product(105, "Phone", "Electronics"),
            new Product(110, "Laptop", "Electronics"),
            new Product(101, "Shoes", "Footwear"),
            new Product(108, "Shirt", "Clothing"),
            new Product(102, "Book", "Stationery")
        };

        for (Product p : products) {
            System.out.println(p);
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Product ID to search: ");
        int searchId = sc.nextInt();

        System.out.println("\n----- 3A. Linear Search -----");
        Product linearResult = SearchUtil.linearSearch(products, searchId);
        if (linearResult != null) {
            System.out.println("Found: " + linearResult);
        } else {
            System.out.println("Product not found.");
        }

        System.out.println("\nSorting products for binary search...");
        Arrays.sort(products);

        System.out.println("Sorted Product List:");
        for (Product p : products) {
            System.out.println(p);
        }

        System.out.println("\n----- 3B. Binary Search -----");
        Product binaryResult = SearchUtil.binarySearch(products, searchId);
        if (binaryResult != null) {
            System.out.println("Found: " + binaryResult);
        } else {
            System.out.println("Product not found.");
        }

        analyzeSearchAlgorithms();
    }
}
