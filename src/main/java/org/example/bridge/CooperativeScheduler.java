package org.example.bridge;

public class CooperativeScheduler extends Scheduler{

    public CooperativeScheduler(SchedulingSystem system) {
        super(system);
    }

    @Override
    public void run(Task task) {
        this.system.scheduleCooperative(task, 10);
    }

    @Override
    public void stop() {
        System.out.println("CooperativeScheduler stop");
    }
}
