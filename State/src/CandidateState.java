public interface CandidateState {
    void next(Person person);
    void prev(Person person);
    void printStatus();
}
