package OOPProject.Akib;

public class VisitorEntryModel {
    private String name;
    private String purpose;
    private String ticketId;

    public VisitorEntryModel(String name, String purpose, String ticketId) {
        this.name = name;
        this.purpose = purpose;
        this.ticketId = ticketId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    @Override
    public String toString() {
        return "VisitorEntryModel{" +
                "name='" + name + '\'' +
                ", purpose='" + purpose + '\'' +
                ", ticketId='" + ticketId + '\'' +
                '}';
    }
}
