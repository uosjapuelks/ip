package duke.task;

import duke.TaskList;
import duke.Ui;

public class Task {
    protected String task;
    protected boolean isDone;
    protected String type;

    private Ui ui;
    private TaskList taskList;

    public Task(String task) {
        this.task = task;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "[X] " : "[ ] ");
    }

    public boolean isDone() {
        return isDone;
    }

    public String getTime() {
        return "";
    }

    public String getTask() {
        return task;
    }

    public String getType() {
        return type;
    }

    public void markAsDone() {
        this.isDone = true;
    }

    public String toString() {
        return this.getStatusIcon() + this.task;
    }

}