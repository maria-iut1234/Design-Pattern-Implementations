package VisitorPattern;

public interface DocumentElement {
    void accept(DocumentTranslationVisitor visitor);
}
