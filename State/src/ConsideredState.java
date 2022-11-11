public class ConsideredState implements CandidateState {
    @Override
    public void next(Person person) {
        person.setState(new InterviewedState());
    }

    @Override
    public void prev(Person person) {
        System.out.println("The person is in initial state.");
    }

    @Override
    public void printStatus() {
        System.out.println("The person is being considered to interview.");
    }
}
