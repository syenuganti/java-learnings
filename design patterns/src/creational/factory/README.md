# Factory Method Pattern

The Factory Method pattern is a creational pattern that provides an interface for creating objects but allows subclasses to alter the type of objects that will be created.

## Real-World Analogy
Think of a logistics company that needs to handle different types of transportation:
- Truck transport for land delivery
- Ship transport for sea delivery

The company doesn't know in advance which type of transport it needs to use - it depends on various factors like destination, cost, and time constraints.

## Problem It Solves
- Decouples object creation from the code that uses the objects
- Allows adding new types of objects without changing existing code
- Provides a way to delegate object creation to subclasses

## When to Use
- When you don't know the exact types of objects your code will need
- When you want to provide users of your library/framework a way to extend its internal components
- When you want to reuse existing objects instead of creating new ones each time
