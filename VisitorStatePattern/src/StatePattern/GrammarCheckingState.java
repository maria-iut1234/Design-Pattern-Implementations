package StatePattern;

public class GrammarCheckingState implements DocumentState{
    @Override
    public void transitionToNext(Document document) {
        document.setState(new FormattingState());
    }

    @Override
    public void showStatus() {
        System.out.println("Document has been grammatically checked, waiting for Formatting State...");
    }
}
