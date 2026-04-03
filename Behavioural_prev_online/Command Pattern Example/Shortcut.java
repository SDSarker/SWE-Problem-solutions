public class Shortcut {
    private Command command;
    private String keyCombo;

    public Shortcut(String keyCombo, Command command) {
        this.keyCombo = keyCombo;
        this.command = command;
    }

    public void onKeyPress() {
        System.out.println("Keyboard: " + keyCombo + " pressed.");
        command.execute();
    }
}
