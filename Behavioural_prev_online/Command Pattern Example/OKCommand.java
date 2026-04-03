public class OKCommand implements Command{
    Editor editor;
    
    OKCommand(Editor editor){
        this.editor=editor;
    }

    @Override
    public void execute() {
        editor.pressOK();
    }
}
