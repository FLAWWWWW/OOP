package Lab_03.Problem3;

public interface ICollection {
    void addElement();
    void deleteElement();
    <T> boolean isInCollection(T element);
    int size();
    boolean isEmpty();
    void deleteCollection();
}
