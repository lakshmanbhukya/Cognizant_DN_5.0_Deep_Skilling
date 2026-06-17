package org.example.factory;

public class ExcelDocument extends Document{
    @Override
    void document() {
        System.out.println("creation of excel");
    }

    @Override
    void save_documnet() {
        System.out.println("saving excel");
    }

    @Override
    void doc_type() {
        System.out.println("excel");
    }
}
