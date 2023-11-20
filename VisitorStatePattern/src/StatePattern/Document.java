package StatePattern;

import VisitorPattern.DocumentElement;
import VisitorPattern.DocumentTranslationVisitor;

public abstract class Document implements DocumentElement {
    private DocumentState state = new TranslatingState();

    public void setState(DocumentState state) {
        this.state = state;
    }

    public DocumentState getState() {
        return state;
    }

    public void transitionToNextState() {
        state.transitionToNext(this);
    }

    public void showCurrentStatus() {
        state.showStatus();
    }
}
