public class Task {
    protected String task;
    protected boolean isDone;

    public Task(String task){
        this.task = task;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return(isDone ? "[X] " : "[ ] ");
    }

    public String getTask(){
        return this.task;
    }

    public void markAsDone(){
        this.isDone = true;
    }

    public String toString(){
        return this.getStatusIcon() + this.task;
    }

}