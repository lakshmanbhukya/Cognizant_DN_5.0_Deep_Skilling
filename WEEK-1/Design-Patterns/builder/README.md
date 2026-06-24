## Builder Pattern

The **Builder Design Pattern** is a creational design pattern that lets you construct complex objects step-by-step. The pattern allows you to produce different types and representations of an object using the same construction code.

### Key Points
- Separation of construction code from representation code.
- Solves the telescoping constructor anti-pattern (having too many constructors with different parameters).
- Ensures that the constructed object is immutable (by having a private constructor and no setters).

### Advantages
- Provides clear separation between construction and representation.
- Gives finer control over the construction process.
- Avoids passing `null` or default values for optional parameters in constructors.
- Enhances code readability by using method chaining.

### Disadvantages
- Requires creating a separate concrete Builder class for each type of Product.
- Increases the number of lines of code due to the helper builder class.

### Example Use Cases
- Constructing objects with many optional attributes (e.g., a HTTP Request Builder, a User Profile Builder).
- Constructing complex objects containing other objects.
- Parsing configuration files to build complex system configurations.
