package org.example.bridge;

public interface SchedulingSystem {

    public void schedulePreemptive(Task task);

    public void scheduleCooperative(Task task, int maxTime);

    public void scheduleRoundrobin(Task task);
}
