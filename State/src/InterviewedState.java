public class InterviewedState implements CandidateState {

    @Override
    public void next(Person person) {
        person.setState(new EmployedState());
    }

    @Override
    public void prev(Person person) {
        person.setState(new ConsideredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Person is being interviewed for a position.");
    }
}
