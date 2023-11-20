package VisitorPattern;

public interface DocumentTranslationVisitor {
    void visit(LetterDocument letterDocument);
    void visit(AssignmentDocument assignmentDocument);
}
