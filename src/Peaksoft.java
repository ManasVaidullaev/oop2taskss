public class Peaksoft {
    private String groupName;
    private int quantity;

    public Peaksoft(String groupName, int quantity) {
        this.groupName = groupName;
        this.quantity = quantity;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void getInfoGroups(){
        System.out.println("gruppa aty"+groupName+" kolichestvo chelovek "+quantity);
    }

    @Override
    public String toString() {
        return "Peaksoft{" +
                "groupName='" + groupName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
