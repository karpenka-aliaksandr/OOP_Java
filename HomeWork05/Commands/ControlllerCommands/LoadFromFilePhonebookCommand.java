package Commands.ControlllerCommands;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import Commands.ControlllerCommands.Base.ControllerCommand;
import Controllers.Controller;
import Models.Menu.Menu;
import Models.Phonebook.Contact;
import Views.Screen;
import Views.View;

public class LoadFromFilePhonebookCommand extends ControllerCommand {

    public LoadFromFilePhonebookCommand(Controller controller) {
        super(controller);
    }

    @Override
    public void execute() {
        Screen screen = controller.getScreen();
        View view = screen.getView();
        Menu menu = screen.getMenu();
        screen.setMenu(new Menu());
        screen.setBar("Введите имя файла: ");
        String fileName = view.getString()+".txt";

        try {
            File file = new File("HomeWork05/", fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);

            String lastname = reader.readLine();
            while (lastname != null) {
                String firstname = reader.readLine();
                String middlename = reader.readLine();
                String telnumber = reader.readLine();
                String emailaddr = reader.readLine();
                controller.getPhonebook()
                        .addContact(new Contact(lastname, firstname, middlename, telnumber, emailaddr));

                lastname = reader.readLine();
            }
            reader.close();
            fr.close();
            screen.setBar("Cправочник успешно загружен");
        } catch (Exception e) {
            screen.setBar("Не удалось загрузить справочник");
            e.printStackTrace();
        }
        screen.setData(controller.getPhonebook().toString());
        screen.setMenu(menu);
    }

}
