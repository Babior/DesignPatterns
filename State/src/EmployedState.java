public class EmployedState implements CandidateState {
    @Override
    public void next(Person person) {
    }

    @Override
    public void prev(Person person) {
        person.setState(new InterviewedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Person is employed for a position.");
    }
}
