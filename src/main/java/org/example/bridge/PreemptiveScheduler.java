package org.example.bridge;

public class PreemptiveScheduler extends Scheduler{

    public PreemptiveScheduler(SchedulingSystem system) {
        super(system);
    }

    @Override
    public void run(Task task) {
        this.system.schedulePreemptive(task);
    }

    @Override
    public void stop() {
        System.out.println("PreemptiveScheduler stop");
    }
}
