package StatePattern;

public class SavingState implements DocumentState{
    @Override
    public void transitionToNext(Document document) {
        document.setState(new ExportingState());
    }

    @Override
    public void showStatus() {
        System.out.println("Document has been saved, waiting for Exporting State...");
    }
}
