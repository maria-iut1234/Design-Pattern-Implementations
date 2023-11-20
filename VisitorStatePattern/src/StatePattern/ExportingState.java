package StatePattern;

public class ExportingState implements DocumentState{
    @Override
    public void transitionToNext(Document document) {
        System.out.println("Document has already been exported!");
    }

    @Override
    public void showStatus() {
        System.out.println("Document has been exported, no next state in the process.");
    }
}
