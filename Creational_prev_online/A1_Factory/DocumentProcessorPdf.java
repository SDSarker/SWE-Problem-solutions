public class DocumentProcessorPdf implements DocumentProcessor{

    @Override
    public void LoadDocument() {
        System.out.println("Pdf Loaded");
    }

    @Override
    public void SaveDocument() {
        System.out.println("Pdf Document Saved");
    }
}
