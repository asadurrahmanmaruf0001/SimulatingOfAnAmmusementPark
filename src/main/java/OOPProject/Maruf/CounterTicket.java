package OOPProject.Maruf;

public class CounterTicket {
    private String name;
    private String type;
    private String visitDate;

    public CounterTicket(String name, String type, String visitDate) {
        this.name = name;
        this.type = type;
        this.visitDate = visitDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    @Override
    public String toString() {
        return "CounterTicket{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", visitDate='" + visitDate + '\'' +
                '}';
    }
}
