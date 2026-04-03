public class Director {
    DocBuilder docBuilder;
    public Director(DocBuilder docBuilder){
        this.docBuilder=docBuilder;
    }   

    public void getLetter(){
        docBuilder.addheader();
        System.out.println("Letter header added");
        docBuilder.addbody();
        System.out.println("Letter Body added");
        docBuilder.addfooter();
        System.out.println("Letter Footer added");
        System.out.println("Letter done : "+docBuilder.getDoc());
    }

    public void getResume(){
        docBuilder.addheader();
        System.out.println("Resume header added");
        docBuilder.addbody();
        System.out.println("Resume Body added");
        docBuilder.addfooter();
        System.out.println("Resume Footer added");
        System.out.println("Resume done : "+docBuilder.getDoc());
    }
}
