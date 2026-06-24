package org.example.factory;

public class PdfDocument extends Document{

    @Override
    void document() {
        System.out.println("creation of pdf document");
    }

    @Override
    void save_documnet() {
        System.out.println("saving document");
    }

    @Override
    void doc_type() {
        System.out.println("Pdf");
    }
}
