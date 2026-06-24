package org.example.factory;

public class Testclass {
    public static void main(String[] args) {
        DocumentFactory pdf= new PdfFactory();
        System.out.println("-------------");
        pdf.manageDocumnet();
        DocumentFactory word= new WordFactory();
        System.out.println("-------------");
        word.manageDocumnet();
        DocumentFactory excel= new ExcelFactory();
        System.out.println("-------------");
        excel.manageDocumnet();
    }
}
