package Commands.ControlllerCommands;
import Commands.ControlllerCommands.Base.ControllerCommand;
import Controllers.Controller;
import Models.Menu.Menu;
import Models.Menu.PunktMenu;


public class MakeMainMenuCommand extends ControllerCommand {
    public MakeMainMenuCommand(Controller controller) {
        super(controller);
    }

    @Override
    public void execute() {
        Menu menu = new Menu();
        menu.addPunkt(1,new PunktMenu("Загрузить справочник из файла", new LoadFromFilePhonebookCommand(controller)));
        menu.addPunkt(2,new PunktMenu("Сохранить справочник в файл", new SaveToFilePhonebookCommand(controller)));
        menu.addPunkt(0,new PunktMenu("Выход", new ExitAppCommand(controller)));
        controller.getScreen().setMenu(menu);
    }
    


    

    
}