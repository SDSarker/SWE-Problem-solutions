public class DocumentProcessorDocx implements DocumentProcessor{

    @Override
    public void LoadDocument() {
        System.out.println("Docx Loaded");
    }

    @Override
    public void SaveDocument() {
        System.out.println("Docx Document Saved");
    }
}
