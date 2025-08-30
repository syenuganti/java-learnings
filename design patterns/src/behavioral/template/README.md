# Template Method Pattern

The Template Method pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. It lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

## Real-World Analogy
Think of building a house:
- The basic steps remain the same (foundation, walls, roof)
- But details can vary (materials, design, finishing)
- The construction process (template) stays consistent
- Specific implementation details change based on house type

## Problem It Solves
- Implements invariant parts of an algorithm once
- Lets subclasses define variant parts
- Prevents code duplication

## When to Use
- When you have an algorithm with fixed steps but flexible implementations
- When you want to avoid code duplication in similar algorithms
- When you want to control how subclasses extend your algorithm
