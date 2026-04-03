public class CancelCommand implements Command{
    
    Editor editor;
    
    CancelCommand(Editor editor){
        this.editor=editor;
    }

    @Override
    public void execute() {
        editor.pressCancel();
    }
}
