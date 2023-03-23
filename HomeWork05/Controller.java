public class Controller {
    Phonebook model;
    View view;

    public Controller(View view, Phonebook model) {
        this.view = view;
        this.model = model;
    }

    public void run(){

        new MakeMainMenuCommand(view).execute();
        while (true) {
            view.show();
            int numPunkt = view.getInt();
            PunktMenu pm = view.getMenu().getPunkt(numPunkt);
            if (pm == null) {
                view.setBar("Неправильный выбор");
            } else {
                pm.run();
            }
        }
        
        
    }

}
