public class App {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        View view = new View();
        Controller ctrl = new Controller(view, phonebook);
        ctrl.run();
    }
}
