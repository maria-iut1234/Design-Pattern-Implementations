package VisitorPattern;

public class RussianTranslationVisitor implements DocumentTranslationVisitor{
    @Override
    public void visit(LetterDocument letterDocument) {
        System.out.println("Letter has been translated to Russian Language.");
    }

    @Override
    public void visit(AssignmentDocument assignmentDocument) {
        System.out.println("Assignment Document has been translated to Russian Language.");
    }
}
