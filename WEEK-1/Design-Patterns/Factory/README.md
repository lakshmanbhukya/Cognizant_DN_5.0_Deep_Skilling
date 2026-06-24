## Factory Method Pattern

The **Factory Method Design Pattern** defines an interface or abstract class for creating an object, but lets subclasses decide which class to instantiate. It lets a class defer instantiation to subclasses.

### Key Points
- Promotes loose coupling by eliminating the need to bind application-specific classes into the code.
- Follows the **Dependency Inversion Principle** (depend upon abstract classes, not concrete classes).
- Follows the **Open/Closed Principle** (you can introduce new product types without breaking existing client code).

### Advantages
- Decouples the client code from the concrete classes it needs to instantiate.
- Simplifies adding new product subclasses (e.g., adding a new document type without modifying the client code).
- Consolidates creation logic in one place.

### Disadvantages
- Can make the code more complex because you need to introduce new subclasses for each product type.


### Example Use Cases
- Document management systems (handling different file formats like PDF, Word, Excel).
- Database connector libraries (instantiating MySQL, Postgres, Oracle connections).
- UI component libraries (rendering buttons/inputs for iOS, Android, or Web).
