import java.util.Scanner;

import Controllers.Controller;
import Models.Phonebook.Phonebook;
import Views.Screen;
import Views.View;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Phonebook phonebook = new Phonebook();
        View view = new View(scan);
        Screen screen = new Screen(view);
        Controller ctrl = new Controller(screen, phonebook);
        ctrl.run();
        scan.close();
    }
}
