public class DocumentProcessorTxt implements DocumentProcessor{

    @Override
    public void LoadDocument() {
        System.out.println("Txt Loaded");
    }

    @Override
    public void SaveDocument() {
        System.out.println("Txt Document Saved");
    }
}
