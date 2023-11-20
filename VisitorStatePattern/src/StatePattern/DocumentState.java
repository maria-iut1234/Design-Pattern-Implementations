package StatePattern;

public interface DocumentState {
    void transitionToNext(Document document);
    void showStatus();
}
