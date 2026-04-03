// Abstraction: Button
abstract class Button {
    protected GUIAPI guiAPI; // Bridge to GUI API (Windows/Linux)

    public Button(GUIAPI guiAPI) {
        this.guiAPI = guiAPI;
    }

    public abstract void render();  // Method to render the button
}


class RegularCustomerButton extends Button {
    public RegularCustomerButton(GUIAPI guiAPI) {
        super(guiAPI);
    }

    public void render() {
        System.out.println("Rendering Regular Customer button with " + guiAPI.getOS());
    }
}

// Refined Abstraction: LinuxButton
class AdminButton extends Button {
    public AdminButton(GUIAPI guiAPI) {
        super(guiAPI);
    }

    public void render() {
        System.out.println("Rendering Admin button with " + guiAPI.getOS());
    }
}

// Implementor: GUIAPI (Windows/Linux)
interface GUIAPI {
    String getOS();  // Method to get the operating system
}

// Concrete Implementor: WindowsAPI
class WindowsAPI implements GUIAPI {
    public String getOS() {
        return "Windows API";
    }
}

// Concrete Implementor: LinuxAPI
class LinuxAPI implements GUIAPI {
    public String getOS() {
        return "Linux API";
    }
}

// Client
public class GUIClient {
    public static void main(String[] args) {
        // Creating API implementations
        GUIAPI windowsAPI = new WindowsAPI();
        GUIAPI linuxAPI = new LinuxAPI();

        
        Button regularCustomerButton1 = new RegularCustomerButton(windowsAPI);
        Button regularCustomerButton2 = new RegularCustomerButton(linuxAPI);

        Button adminButton1 = new AdminButton(linuxAPI);
        Button adminButton2 = new AdminButton(windowsAPI);

        // Render buttons
        regularCustomerButton1.render();
        regularCustomerButton2.render();
        adminButton1.render();
        adminButton2.render();
    }
}