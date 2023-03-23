

public class ExitAppCommand implements Command{
    View view;
    public ExitAppCommand(View view) {
        this.view = view;
    }

    @Override
    public void execute() {
        view.setBar("До свидяния.");
        System.exit(0);
    }

}
