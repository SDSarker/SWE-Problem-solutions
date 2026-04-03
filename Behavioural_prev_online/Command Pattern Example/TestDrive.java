public class TestDrive {
    public static void main(String[] args) {
        Editor editor=new Editor();

        // 3. Setup UI and Shortcuts (Invokers)
        Button saveBtn = new Button("Save", new SaveCommand(editor));
        Shortcut saveKey = new Shortcut("Ctrl+S", new SaveCommand(editor));
        
        Button cancelBtn = new Button("Cancel", new CancelCommand(editor));
        Shortcut cancelKey = new Shortcut("Shift+Esc", new CancelCommand(editor));

        // --- Simulation ---
        saveBtn.onClick();    // Triggered via Mouse
        saveKey.onKeyPress(); // Triggered via Keyboard (Same result!)
        cancelBtn.onClick();  // Triggered via Mouse
        cancelKey.onKeyPress(); // Triggered via Keyboard (Same result!)
    }    
}
