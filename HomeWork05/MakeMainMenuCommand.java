public class MakeMainMenuCommand implements Command {
    View view;
    Menu menu;

    public MakeMainMenuCommand(View view) {
        this.view = view;
        this.menu = view.getMenu();

    }

    @Override
    public void execute() {
        menu.addPunkt(new PunktMenu("Ничего", new NothingCommand(view) ));
        menu.addPunkt(new PunktMenu("Выход", new ExitAppCommand(view)));
    }
    


    

    
}