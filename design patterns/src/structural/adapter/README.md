# Adapter Pattern

The Adapter pattern allows incompatible interfaces to work together by wrapping an object in an adapter to make it compatible with another class.

## Real-World Analogy
Think of a power adapter for international travel:
- You have a device with a US plug
- You're in a country with different power sockets
- The power adapter makes your device compatible with local sockets

## Problem It Solves
- Allows incompatible classes to work together
- Converts one interface into another that clients expect
- Enables reuse of existing functionality

## When to Use
- When you want to use an existing class but its interface isn't compatible
- When you need to reuse several existing subclasses that lack common functionality
- When you want to create a reusable class that cooperates with classes that don't have compatible interfaces
