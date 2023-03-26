package Commands.ControlllerCommands;

import java.io.File;
import java.io.FileWriter;

import Commands.ControlllerCommands.Base.ControllerCommand;
import Controllers.Controller;
import Models.Menu.Menu;
import Models.Phonebook.Contact;
import Models.Phonebook.Phonebook;
import Views.Screen;
import Views.View;

public class SaveToFilePhonebookCommand extends ControllerCommand {

    public SaveToFilePhonebookCommand(Controller controller) {
        super(controller);
    }

    @Override
    public void execute() {
        Screen screen = controller.getScreen();
        View view = screen.getView();
        Menu menu = screen.getMenu();
        Phonebook phonebook = controller.getPhonebook();
        screen.setMenu(new Menu());
        screen.setBar("Введите имя файла: ");
        String fileName = view.getString()+".txt";

        try {
            File file = new File("HomeWork05/", fileName);
            FileWriter fw = new FileWriter(file);
            for (Contact contact : phonebook.getContacts()) {
                fw.write(contact.getLastname()+"\n");
                fw.write(contact.getFirstname()+"\n");
                fw.write(contact.getMiddlename()+"\n");
                fw.write(contact.getTelnumber()+"\n");
                fw.write(contact.getEmailaddr()+"\n");
            }
            fw.flush();
            fw.close();
            screen.setBar("Cправочник успешно cохранен");
        } catch (Exception e) {
            screen.setBar("Не удалось сохранить справочник");
            e.printStackTrace();
        }
        screen.setData(controller.getPhonebook().toString());
        screen.setMenu(menu);
    }

}
