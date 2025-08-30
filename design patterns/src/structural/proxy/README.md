# Proxy Pattern

The Proxy pattern provides a surrogate or placeholder for another object to control access to it. It creates a representative object that controls access to another object, which may be remote, expensive to create, or in need of securing.

## Real-World Analogy
Think of a debit card:
- Acts as a proxy for your bank account
- Provides controlled access to your money
- Adds security layers
- Can cache information locally

## Problem It Solves
- Controls access to another object
- Provides lazy initialization
- Implements logging, access control, or caching
- Adds security layer

## When to Use
- When you need lazy initialization (Virtual Proxy)
- When you need access control (Protection Proxy)
- When you need logging before/after method calls (Logging Proxy)
- When you need caching (Caching Proxy)
