# Command Pattern

The Command pattern encapsulates a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

## Real-World Analogy
Think of a smart home remote control:
- Each button represents a command
- Buttons can be reprogrammed for different devices
- Commands can be undone
- Multiple commands can be executed in sequence

## Problem It Solves
- Decouples sender from receiver
- Allows request queueing and logging
- Supports undo operations
- Enables parameterization of operations

## When to Use
- When you need to parameterize objects with operations
- When you need to queue, log, or support undo operations
- When you want to structure a system around high-level operations
