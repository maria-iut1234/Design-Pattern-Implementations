package VisitorPattern;

import StatePattern.Document;

public class AssignmentDocument extends Document{
    @Override
    public void accept(final DocumentTranslationVisitor visitor) {
        visitor.visit(this);
    }
}
