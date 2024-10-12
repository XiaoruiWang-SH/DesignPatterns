package org.example.bridge;

public class OSXSystem implements SchedulingSystem{
    @Override
    public void schedulePreemptive(Task task) {
        String s = String.format("OSXSystem schedule preemptive task: %d", task.id);
        System.out.println(s);
    }

    @Override
    public void scheduleCooperative(Task task, int maxTime) {
        String s = String.format("OSXSystem schedule cooperative task: %d, time: %d", task.id, maxTime);
        System.out.println(s);
    }

    @Override
    public void scheduleRoundrobin(Task task) {
        String s = String.format("OSXSystem schedule round robin task: %d", task.id);
        System.out.println(s);
    }
}
