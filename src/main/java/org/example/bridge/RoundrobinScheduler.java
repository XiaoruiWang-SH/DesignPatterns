package org.example.bridge;

public class RoundrobinScheduler extends Scheduler{
    public RoundrobinScheduler(SchedulingSystem system) {
        super(system);
    }

    @Override
    public void run(Task task) {
        this.system.scheduleRoundrobin(task);
    }

    @Override
    public void stop() {
        System.out.println("RoundrobinScheduler stop");
    }
}
