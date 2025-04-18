package OOPProject.Santo.classcode.ParkAdmin.RideOperator;

public class AnswerGuestQuestionsEvent {
    private String rideName;
    private String guestQuestion;
    private String operatorResponse;

    public AnswerGuestQuestionsEvent(String rideName, String guestQuestion, String operatorResponse) {
        this.rideName = rideName;
        this.guestQuestion = guestQuestion;
        this.operatorResponse = operatorResponse;
    }

    public String getRideName() {
        return rideName;
    }

    public String getGuestQuestion() {
        return guestQuestion;
    }

    public String getOperatorResponse() {
        return operatorResponse;
    }

    @Override
    public String toString() {
        return "AnswerGuestQuestionsEvent{" +
                "rideName='" + rideName + '\'' +
                ", guestQuestion='" + guestQuestion + '\'' +
                ", operatorResponse='" + operatorResponse + '\'' +
                '}';
    }
}
