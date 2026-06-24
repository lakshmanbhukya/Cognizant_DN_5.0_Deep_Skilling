package org.example.factory;

public class WordDocumnet extends Document{
    @Override
    void document() {
        System.out.println("creation of word");
    }

    @Override
    void save_documnet() {
        System.out.println("saving the word");
    }

    @Override
    void doc_type() {
        System.out.println("word");
    }
}
