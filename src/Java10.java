public class Java10 extends Peaksoft{
    private String mentor;
    private double startDay;

    public double getStartDay() {
        return startDay;
    }

    public void setStartDay(double startDay) {
        this.startDay = startDay;
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }

    public Java10(String groupName, int quantity, String mentor,double startDay) {
        super(groupName, quantity);
        this.mentor=mentor;
        this.startDay=startDay;
    }
}
