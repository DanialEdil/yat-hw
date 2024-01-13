package Module2.FirstLesson;

public class Candidate {
    String name;
    String work;
    int income;

    public Candidate(String name, String work, int income) {
        this.name = name;
        this.work = work;
        this.income = income;
    }

    public boolean canParticipatePrivateClub() {
        boolean canParticipate = true;

        if (name.contains("Johnson") || name.contains("Edisson")) {
            canParticipate = false;
        }

        if (work.contains("banker")) {
            canParticipate = false;
        }

        if (income <= 1000) {
            canParticipate = false;
        }

        return canParticipate;
    }

    @Override
    public String toString() {
        return name;
    }
}
