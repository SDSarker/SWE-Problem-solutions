public class SaveCommand implements Command{
    Editor editor;
    
    SaveCommand(Editor editor){
        this.editor=editor;
    }

    @Override
    public void execute() {
        editor.pressSave();
    }
}
