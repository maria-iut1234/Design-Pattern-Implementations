package StatePattern;

public class FormattingState implements DocumentState{
    @Override
    public void transitionToNext(Document document) {
        document.setState(new SavingState());
    }

    @Override
    public void showStatus() {
        System.out.println("Document has been formatted, waiting for Saving State...");
    }
}
