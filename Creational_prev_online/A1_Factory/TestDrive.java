public class TestDrive {
    public static void main(String[] args) {
        ProcessorFactory f1=new ProcessorFactory("Result.pdf");
        ProcessorFactory f2=new ProcessorFactory("Result.txt");
        ProcessorFactory f3=new ProcessorFactory("Result.docx");
        
        
        DocumentProcessor d1=f1.getProcessor();
        DocumentProcessor d2=f2.getProcessor();
        DocumentProcessor d3=f3.getProcessor();

        d1.LoadDocument();
        d1.SaveDocument();

        d2.LoadDocument();
        d2.SaveDocument();

        d3.LoadDocument();
        d3.SaveDocument();
    }    
}
