package VisitorPattern;

import StatePattern.Document;

public class LetterDocument extends Document{
    @Override
    public void accept(final DocumentTranslationVisitor visitor) {
        visitor.visit(this);
    }
}
