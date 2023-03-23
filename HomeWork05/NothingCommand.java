public class NothingCommand implements Command {
    private View view;
    public NothingCommand(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.setBar("Комманда ничего не делает");
    }
    
}
