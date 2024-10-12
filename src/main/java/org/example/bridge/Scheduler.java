package org.example.bridge;

public abstract class Scheduler {
    protected SchedulingSystem system;

    protected Scheduler(SchedulingSystem system) {
        this.system = system;
    }

    abstract public void run(Task task);

    abstract public void stop();
}
