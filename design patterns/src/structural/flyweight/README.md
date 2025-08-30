# Flyweight Pattern

The Flyweight pattern minimizes memory usage by sharing as much data as possible with similar objects. It's useful when you need to create a large number of similar objects efficiently.

## Real-World Analogy
Think of a text editor:
- Each character has properties (font, size, color)
- Instead of storing these properties for each character
- Store shared properties once and reference them
- Only store unique properties per instance

## Problem It Solves
- Reduces memory usage when dealing with many similar objects
- Shares common state between multiple objects
- Improves performance in memory-constrained situations

## When to Use
- When you need many objects with similar intrinsic state
- When memory is a critical concern
- When object properties can be split into intrinsic and extrinsic state
