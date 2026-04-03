public class ProcessorFactory {
    String filename;
    public ProcessorFactory(String filename){
        this.filename=filename;
    }

    public DocumentProcessor getProcessor(){
        int n=filename.length();
        String str=filename.substring(n-3);
        
        if(str.equals("pdf")){
            return new DocumentProcessorPdf();
        }
        else if(str.equals("txt")){
            return new DocumentProcessorTxt();
        }
        else{
            return new DocumentProcessorDocx();
        }
    }
}
