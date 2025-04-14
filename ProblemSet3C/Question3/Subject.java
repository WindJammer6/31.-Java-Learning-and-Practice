package ProblemSet3C.Question3;

public interface Subject {

    void addObserver( Observer observer);
    void updateData(double data);
    void notifyObservers();
}
