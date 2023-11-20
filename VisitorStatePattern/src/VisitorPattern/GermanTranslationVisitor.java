package VisitorPattern;

public class GermanTranslationVisitor implements DocumentTranslationVisitor{
    @Override
    public void visit(LetterDocument letterDocument) {
        System.out.println("Letter has been translated to German Language.");
    }

    @Override
    public void visit(AssignmentDocument assignmentDocument) {
        System.out.println("Assignment Document has been translated to German Language.");
    }
}
