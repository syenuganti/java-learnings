# Iterator Pattern

The Iterator pattern provides a way to access elements of a collection sequentially without exposing its underlying representation. It extracts the traversal behavior of a collection into a separate object.

## Real-World Analogy
Think of a TV remote control:
- Channel up/down buttons let you iterate through channels
- You don't need to know how channels are stored
- You can traverse channels sequentially
- Different TVs may store channels differently, but the remote works the same

## Problem It Solves
- Provides uniform way to traverse different collections
- Simplifies collection interface
- Supports multiple simultaneous traversals
- Allows different traversal algorithms

## When to Use
- When you want to access collection elements without exposing internals
- When you need multiple ways to traverse a collection
- When you want to provide a uniform interface for traversing different collections
