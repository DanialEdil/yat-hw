package Module2.FirstLesson;

import static Module2.FirstLesson.Task.TaskType;

public class MainFirstLesson {
    public static void main(String[] args) {
        Person danial = new Person();
        danial.firstname = "Danial";
        danial.lastname = "Edilev";
        danial.age = 20;
        danial.sex = "Male";
        danial.interests = new String[]{"Snowboard", "Table Tennis", "Programming"};
        System.out.println(danial);

        Person qainar = new Person();
        qainar.firstname = "Qainar";
        qainar.lastname = "Mamalov";
        qainar.age = 21;
        qainar.sex = "Male";
        qainar.interests = new String[]{"Dota 2", "CS:GO", "Node.js"};
        System.out.println(qainar);

        Task task1 = new Task("Task 1. \n You need to find avg number of sum", TaskType.major, "Sanzhar", "Danial", "01.12.2025");
        Task task2 = new Task("Task 2. \n You need to validate BST", TaskType.critical, "Sanzhar", "Danial", "05.04.2024");
        Task task3 = new Task("Task 3. \n You need to find fibonacci on n - number", TaskType.normal, "Sanzhar", "Danial", "04.05.2021");

        printTask(task1);
        printTask(task2);
        printTask(task3);

        Interview interview1 = new Interview();
        interview1.setInterviewer("Danial");
        interview1.setInterviewee("Dimash");
        interview1.setDate("17.12.2023");
        interview1.setTopic("Algo Interview, LinkedList");
        interview1.setLength(30);

        Interview interview2 = new Interview();
        interview2.setInterviewer("Dimash");
        interview2.setInterviewee("Danial");
        interview2.setDate("17.12.2023");
        interview2.setTopic("Algo Interview, DP");
        interview2.setLength(30);

        Interview interview3 = new Interview();
        interview3.setInterviewer("Sanzhar");
        interview3.setInterviewee("Danial");
        interview3.setDate("17.12.2023");
        interview3.setTopic("Algo Interview");
        interview3.setLength(60);


        printInterview(interview1);
        printInterview(interview2);
        printInterview(interview3);
    }

    public static void printTask(Task task) {
        System.out.println("Description: " + task.getDescription());
        System.out.println("Type: " + task.getType());
        System.out.println("Assign: " + task.getAssignee());
        System.out.println("Issuer: " + task.getIssuer());
        System.out.println("Issue Date: " + task.getIssueDate());
        System.out.println();
    }

    public static void printInterview(Interview interview) {
        System.out.println("Name of interview: " + interview.getTopic());
        System.out.println("Interviewer: " + interview.getInterviewer());
        System.out.println("Interviewee: " + interview.getInterviewee());
        System.out.println("Date: " + interview.getDate());
        System.out.println("Length of interview: " + interview.getLength() + " minutes");
        System.out.println();
    }
}
