public class JS10 extends Peaksoft{
    private String mentor;
    private String lessons;

    public String getLessons() {
        return lessons;
    }

    public void setLessons(String lessons) {
        this.lessons = lessons;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public JS10(String groupName, int quantity, String mentor,String lessons) {
        super(groupName, quantity);
        this.mentor=mentor;
        this.lessons=lessons;
    }
}
