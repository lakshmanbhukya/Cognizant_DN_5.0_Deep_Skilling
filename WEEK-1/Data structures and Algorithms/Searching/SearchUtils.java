package org.example.Ecommerce.Searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SearchUtils {
    public static Product linearsearch(ArrayList<Product> products, String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarysearch(ArrayList<Product> products, int id) {
        Collections.sort(products, Comparator.comparing(Product::getId));
        int low = 0;
        int high = products.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (products.get(mid).getId() == id) {
                return products.get(mid);
            } else if (products.get(mid).getId() < id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;

    }
}