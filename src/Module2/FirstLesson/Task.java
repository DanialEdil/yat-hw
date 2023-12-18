package Module2.FirstLesson;

public class Task {
    private String description;
    private TaskType type;
    private String assignee;
    private String issuer;
    private String issueDate;

    public Task(String description, TaskType type, String assignee, String issuer, String issueDate) {
        this.description = description;
        this.type = type;
        this.assignee = assignee;
        this.issuer = issuer;
        this.issueDate = issueDate;
    }

    public String getDescription() {
        return description;
    }

    public TaskType getType() {
        return type;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getIssuer() {
        return issuer;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public enum TaskType {
        normal, major, critical
    }
}
