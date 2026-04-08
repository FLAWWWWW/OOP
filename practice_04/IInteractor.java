package practice_04;

public interface IInteractor {
    void Interact(IInteractable target);
    void Push(IPushable target, int x, int y);
}
