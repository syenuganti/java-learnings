package lsp;

// Bad example - violates LSP
class Bird {
    public void fly() {
        // Implementation for flying
    }
}

class Duck extends Bird {
    @Override
    public void fly() {
        // Duck flying implementation
    }
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        // Problem: Ostrich can't fly!
        throw new UnsupportedOperationException("Ostriches can't fly!");
    }
}

// Good example - follows LSP
interface FlyingBird {
    void fly();
}

interface WalkingBird {
    void walk();
}

class GoodDuck implements FlyingBird, WalkingBird {
    @Override
    public void fly() {
        // Duck flying implementation
    }

    @Override
    public void walk() {
        // Duck walking implementation
    }
}

class GoodOstrich implements WalkingBird {
    @Override
    public void walk() {
        // Ostrich walking implementation
    }
}
