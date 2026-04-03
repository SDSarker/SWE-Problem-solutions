public class Button {
    private Command command;
    private String label;
 
    public Button(String label, Command command) {
        this.label = label;
        this.command = command;
    }
 
    public void onClick() {
 
        System.out.println("GUI: " + label + " button clicked.");
        command.execute();
    }
}