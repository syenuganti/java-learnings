# Observer Pattern

The Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

## Real-World Analogy
Think of a news agency:
- Subscribers sign up for news updates
- When news breaks, all subscribers get notified
- Subscribers can subscribe or unsubscribe at any time

## Problem It Solves
- Establishes relationships between objects at runtime
- Provides loose coupling between objects
- Supports broadcast communication

## When to Use
- When changes to one object require changing others
- When an object should notify other objects without knowing who they are
- When you need to maintain consistency between related objects
