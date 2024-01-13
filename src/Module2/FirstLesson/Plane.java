package Module2.FirstLesson;

import java.util.Arrays;

public class Plane {

    public String id;
    public String leaveTime;
    public String arrivalTime;

    public Plane(String id, String leaveTime, String arrivalTime) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.leaveTime = leaveTime;
    }

    public boolean more2Hours() {
        String[] arrivalTime = this.arrivalTime.split(":");
        int arrivalHours = Integer.parseInt(arrivalTime[0]);
        int arrivalMinute = Integer.parseInt(arrivalTime[1]);
        String[] leaveTime = this.leaveTime.split(":");
        int leaveHours = Integer.parseInt(leaveTime[0]);
        int leaveMinute = Integer.parseInt(leaveTime[1]);
        System.out.println(Arrays.toString(arrivalTime) + " " + Arrays.toString(leaveTime));

        if (arrivalHours - leaveHours >= 2) {
            if (arrivalHours - leaveHours == 2 && leaveMinute > arrivalMinute) {
                return false;
            }
            System.out.println("true");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Plane[" +
                "id='" + id + '\'' +
                ", leaveTime='" + leaveTime + '\'' +
                ", arrivalTime='" + arrivalTime + '\'' +
                ']';
    }
}
