package org.example.factory;

public class WordFactory extends DocumentFactory{
    @Override
    public Document createDocument() {
        return new WordDocumnet();
    }
}
