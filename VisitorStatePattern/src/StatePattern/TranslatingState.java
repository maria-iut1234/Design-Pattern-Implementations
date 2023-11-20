package StatePattern;

public class TranslatingState implements DocumentState{
    @Override
    public void transitionToNext(Document document) {
        document.setState(new GrammarCheckingState());
    }

    @Override
    public void showStatus() {
        System.out.println("Document has been translated, waiting for Grammar Checking State...");
    }
}
