# Strategy Pattern

## Definition

The Strategy Pattern is a behavioral design pattern that enables selecting an algorithm's behavior at runtime. It defines a family of algorithms, encapsulates each one, and makes them interchangeable. The Strategy lets the algorithm vary independently from clients that use it.

## Key Points

- Define a set of algorithms
- Encapsulate each algorithm in separate classes
- Make the algorithms interchangeable
- Allow client to choose the algorithm at runtime
- Uses composition to vary the algorithm independently
- Eliminates conditional statements for selecting algorithms
- Promotes the Open/Closed Principle

## Advantages

- Avoids hardcoding decision logic in the client code
- Simplifies class interfaces by removing algorithm-specific methods
- Provides different versions of an algorithm easily
- Eliminates conditional statements for selecting an algorithm
- Strategies can be changed dynamically
- Each strategy is isolated and can be tested independently
- Easy to add new strategies without modifying existing code
- Reduces code complexity and improves maintainability

## Disadvantages

- Introduces additional classes for each strategy
- Can be overkill for simple algorithms
- Client must be aware of different strategies to select the right one
- Increased memory usage if many strategies are created
- Adds complexity to the codebase when only one or two algorithms exist
