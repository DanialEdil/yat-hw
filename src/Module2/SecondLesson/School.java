package Module2.SecondLesson;


public class School {
    String title;

    String specType;

    int escCount;

    Esper[] espers;

    int acceptEspersList;
    int acceptSpecialSchool;

    public School(String title, String specType, int escCount, Esper[] espers) {
        this.title = title;
        this.specType = specType;
        this.escCount = escCount;
        this.espers = espers;
    }

    public void calculateEspers() {
        for (Esper esper : espers) {
            System.out.println(esper.type + " - " + esper.mighty);

            if (esper.type.equals(this.specType)) {
                if (esper.mighty > 10) {
                    acceptEspersList++;
                }
            } else {
                if (esper.mighty > 10 && esper.mighty < 1000) {
                    acceptEspersList++;
                } else {
                    if (esper.mighty > 1000) {
                        acceptSpecialSchool++;
                    }
                }
            }
        }
    }


}
