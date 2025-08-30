# State Pattern

The State pattern allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

## Real-World Analogy
Think of a vending machine:
- Different states: HasMoney, NoMoney, SoldOut, Dispensing
- Each state determines how the machine responds to actions
- Actions like inserting money or pressing buttons have different effects based on the current state

## Problem It Solves
- Organizes state-specific behavior
- Makes state transitions explicit
- Eliminates complex conditional statements

## When to Use
- When an object's behavior depends on its state
- When you have lots of state-dependent code
- When you want to avoid large switch/if-else statements for state handling
