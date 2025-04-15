package OOPProject.Santo.ControllerCode;

public class Visitor {
    private String name;
    private int age;
    private String ticketType;

    public Visitor(String name, int age, String ticketType) {
        this.name = name;
        this.age = age;
        this.ticketType = ticketType;
    }

    public void enterPark() {
        // Logic for entering the park
    }

    public void exitPark() {
        // Logic for exiting the park
    }
}