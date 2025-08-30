package isp;

// Bad example - violates ISP
interface Worker {
    void work();
    void eat();
    void sleep();
}

class Human implements Worker {
    @Override
    public void work() {
        // Working implementation
    }

    @Override
    public void eat() {
        // Eating implementation
    }

    @Override
    public void sleep() {
        // Sleeping implementation
    }
}

class Robot implements Worker {
    @Override
    public void work() {
        // Working implementation
    }

    @Override
    public void eat() {
        // Problem: Robot can't eat!
        throw new UnsupportedOperationException();
    }

    @Override
    public void sleep() {
        // Problem: Robot doesn't sleep!
        throw new UnsupportedOperationException();
    }
}

// Good example - follows ISP
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

class GoodHuman implements Workable, Eatable, Sleepable {
    @Override
    public void work() {
        // Working implementation
    }

    @Override
    public void eat() {
        // Eating implementation
    }

    @Override
    public void sleep() {
        // Sleeping implementation
    }
}

class GoodRobot implements Workable {
    @Override
    public void work() {
        // Only implements what it can do
    }
}
