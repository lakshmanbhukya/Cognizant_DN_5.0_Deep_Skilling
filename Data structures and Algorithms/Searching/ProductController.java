package org.example.Ecommerce.Searching;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {

        System.out.println("Ecommerce Searching");

        ArrayList<Product> products = new ArrayList<>();

        Product product1 = new Product(101, "laptop", "this is laptop", "1", "57000");
        Product product2 = new Product(102, "headset", "this is headset", "1", "2000");
        Product product3 = new Product(103, "keyboard", "this is keyboard", "1", "1000");
        Product product4 = new Product(104, "mouse", "this is mouse", "1", "700");

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        Scanner read = new Scanner(System.in);
        System.out.println("Enter product name: ");
        String name = read.nextLine();

        System.out.println("Using Linear Search");

        Product linearSearch = SearchUtils.linearsearch(products, name);
        System.out.println(linearSearch != null ? "Product Found" : "Product Not Found");

        System.out.println("Linear Search Finished");

        System.out.println("Enter product id: ");
        int id = read.nextInt();
        System.out.println("Using BinarySearch");
        Product binarySearch = SearchUtils.binarysearch(products, id);
        System.out.println(binarySearch != null ? "Product Found" : "Product Not Found");
        System.out.println("Binary Search Finished");
    }

}
