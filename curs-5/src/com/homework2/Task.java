package com.homework2;

import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Task {
    String taskName;
    Integer taskId;
    Integer executionTime;
    static Integer numberOfTasks;
    private final static Random random = new Random();

    void init() {
        if (Objects.isNull(numberOfTasks)) {
            numberOfTasks = 0;
        }
        numberOfTasks++;
        this.taskId = generateId();
        this.taskName = "Task " + taskId;
        this.executionTime = random.nextInt(1, 21);
        System.out.printf("* init called for %s, having id %d%n", this.taskName, this.taskId);

    }

    public void destroy() {
        System.out.printf("* destroying bean %s *%n", this.taskName);
        numberOfTasks--;
    }

    public void run() throws InterruptedException {
        System.out.printf("Sleeping for %d seconds %n", this.executionTime);
        TimeUnit.SECONDS.sleep(executionTime);
        System.out.println("run executed");
    }

    public Integer generateId() {
        return numberOfTasks - 1;
    }
}
