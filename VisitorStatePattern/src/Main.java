import StatePattern.*;
import VisitorPattern.*;

public class Main {
    public static void main(String[] args) {
        Document assignmentDocument = new AssignmentDocument();

        // Visitor Pattern
        final FrenchTranslationVisitor frenchLanguage = new FrenchTranslationVisitor();
        assignmentDocument.accept(frenchLanguage);

        System.out.println();

        //State Pattern
        assignmentDocument.showCurrentStatus();

        assignmentDocument.transitionToNextState();
        assignmentDocument.showCurrentStatus();

        assignmentDocument.transitionToNextState();
        assignmentDocument.showCurrentStatus();

        assignmentDocument.transitionToNextState();
        assignmentDocument.showCurrentStatus();

        assignmentDocument.transitionToNextState();
        assignmentDocument.showCurrentStatus();
    }
}