# E-Commerce Searching Module

## Overview

This module demonstrates practical implementation of searching algorithms in an e-commerce product catalog system. It provides efficient methods to locate products using different search techniques with various optimization levels.

## Features

- **Linear Search**: Search products by name with O(n) time complexity
- **Binary Search**: Search products by ID with O(log n) time complexity
- **Product Management**: Create and manage product inventory
- **Interactive User Interface**: Command-line interface for searching products

## Project Structure

### Classes

#### 1. **Product.java**
A data model class representing a product in the e-commerce system.

**Properties:**
- `id` (int): Unique product identifier
- `name` (String): Product name
- `description` (String): Product description
- `quantity` (String): Available quantity
- `price` (String): Product price

**Methods:**
- Constructor: `Product(int id, String name, String description, String quantity, String price)`
- Getters and Setters for all properties

**Example:**
```java
Product product = new Product(101, "laptop", "this is laptop", "1", "57000");
```

#### 2. **SearchUtils.java**
Utility class containing search algorithms for finding products.

**Methods:**

- **linearsearch(ArrayList<Product> products, String name)**
  - Searches for a product by name
  - Time Complexity: O(n)
  - Space Complexity: O(1)
  - Returns: Product object if found, null otherwise
  - Use Case: When you need to search by product name

- **binarysearch(ArrayList<Product> products, int id)**
  - Searches for a product by ID using binary search
  - Time Complexity: O(log n)
  - Space Complexity: O(1)
  - Returns: Product object if found, null otherwise
  - Use Case: When you need to search by product ID (requires sorted list)
  - Note: Internally sorts the list by ID before searching

#### 3. **ProductController.java**
Main application class that orchestrates the searching functionality.

**Features:**
- Initializes a sample product inventory (Laptop, Headset, Keyboard, Mouse)
- Accepts user input for product searches
- Demonstrates both linear and binary search algorithms
- Displays search results

## Sample Data

The application comes with sample products:

| ID  | Name    | Description      | Quantity | Price  |
|-----|---------|------------------|----------|--------|
| 101 | laptop  | this is laptop   | 1        | 57000  |
| 102 | headset | this is headset  | 1        | 2000   |
| 103 | keyboard| this is keyboard | 1        | 1000   |
| 104 | mouse   | this is mouse    | 1        | 700    |

## Usage

### Running the Application

```bash
java org.example.Ecommerce.Searching.ProductController
```

### Sample Execution Flow

1. **Program Start**: Displays "Ecommerce Searching"
2. **Linear Search**:
   - Prompts: "Enter product name: "
   - Example input: `laptop`
   - Output: "Product Found" or "Product Not Found"

3. **Binary Search**:
   - Prompts: "Enter product id: "
   - Example input: `101`
   - Output: "Product Found" or "Product Not Found"

### Example Run

```
Ecommerce Searching
Enter product name: 
keyboard
Using Linear Search
Product Found
Linear Search Finished
Enter product id: 
102
Using BinarySearch
Product Found
Binary Search Finished
```

## Algorithm Analysis

### Linear Search
```
Time Complexity: O(n)
Space Complexity: O(1)
Best Case: O(1) - Element at first position
Worst Case: O(n) - Element at last position or not present
Average Case: O(n/2)
```

**When to Use:**
- Unsorted data
- Small datasets
- When searching by non-indexed attributes

### Binary Search
```
Time Complexity: O(log n)
Space Complexity: O(1)
Best Case: O(1) - Element at middle position
Worst Case: O(log n) - Narrowing down to one element
```

**Prerequisite:** Data must be sorted
**When to Use:**
- Large sorted datasets
- When frequent searches are required
- Searching by indexed/unique attributes like ID

## Performance Comparison

| Operation | Linear Search | Binary Search |
|-----------|---------------|---------------|
| 100 items | ~50 operations | ~7 operations |
| 1,000 items | ~500 operations | ~10 operations |
| 10,000 items | ~5,000 operations | ~14 operations |
| 1,000,000 items | ~500,000 operations | ~20 operations |

## Learning Outcomes

This module helps understand:
- ✅ Linear search implementation and use cases
- ✅ Binary search implementation and requirements
- ✅ Time and space complexity analysis
- ✅ Real-world application in e-commerce
- ✅ Object-oriented design principles
- ✅ ArrayList manipulation in Java

## Future Enhancements

- Implement search by price range
- Add search filtering by product type
- Implement indexed search for faster lookups
- Add caching mechanism for frequently searched items
- Database integration instead of in-memory storage
- REST API endpoints for search functionality

## Notes

- The binary search method internally sorts the list, which adds O(n log n) overhead on each call
- For production systems, it's better to maintain a pre-sorted collection
- Consider implementing a proper database for large-scale e-commerce applications
- The current implementation searches from an in-memory ArrayList

