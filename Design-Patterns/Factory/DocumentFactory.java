package org.example.factory;

public abstract class DocumentFactory {
    public abstract Document createDocument();
    public  void manageDocumnet(){
        Document document = createDocument();
        document.document();
        document.save_documnet();
        document.doc_type();
    }
}
